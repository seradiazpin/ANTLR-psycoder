import javax.xml.bind.ValidationEvent;
import java.util.*;

/**
 * Created by sergioalejandrodiazpinilla on 12/04/16.
 */
public class EvalVisitor extends PsycoderBaseVisitor<Value> {
    public static final double SMALL_VALUE = 0.00000000001;

    // store variables (there's only one global scope!)
    private MemoryManager memory;
    private Map<String, Map<String, String>> structMemory = new HashMap<String, Map<String, String>>();
    private Map<String, Function> functionMemory = new HashMap<String, Function>();
    private String currentTypeToAssign = "";

    public EvalVisitor(){
        memory = new MemoryManager();
    }

    @Override
    public Value visitProgram(PsycoderParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Value visitTypedAssign(PsycoderParser.TypedAssignContext ctx) {
        this.currentTypeToAssign = ctx.type().getText();
        this.visitChildren(ctx);
        this.currentTypeToAssign = "";

        return null;
    }

    @Override
    public Value visitAssign_type(PsycoderParser.Assign_typeContext ctx) {
        String id = ctx.ID().getText();

        if(memory.containsId(id)) {
            throw new RuntimeException("El identificador " + id + " ya existe y no se puede declarar de nuevo.");
        }

        if(ctx.expression() == null) { // asignación por omisión
            memory.addId(id, currentTypeToAssign);
        } else { // asignación por expresión
            memory.addId(id, this.visit(ctx.expression()));
        }

        return ctx.assign_type_pri() != null ? this.visit(ctx.assign_type_pri()) : null;
    }

    @Override
    public Value visitAssign_id(PsycoderParser.Assign_idContext ctx) {
        String id = ctx.identifier().getText();
        Value val = memory.getId(id);
        val.setValue(this.visit(ctx.expression()));

        return this.visit(ctx.assign_id_pri());
    }

    @Override
    public Value visitId_terminal(PsycoderParser.Id_terminalContext ctx) {
        String id = ctx.getText();
        Value value = memory.getId(id);
        if(value == null) {
            throw new RuntimeException("El identificador " + id + " no ha sido declarado");
        }
        return value;
    }

    //todo recordar rangos de los enteros y los reales

    @Override
    public Value visitEntero_terminal(PsycoderParser.Entero_terminalContext ctx) {
        return new Value(Integer.valueOf(ctx.getText()));
    }

    @Override
    public Value visitReal_terminal(PsycoderParser.Real_terminalContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }

    @Override
    public Value visitCadena_terminal(PsycoderParser.Cadena_terminalContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
    }

    @Override
    public Value visitCaracter_terminal(PsycoderParser.Caracter_terminalContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\'\'", "\'");
        Character chr = str.charAt(0);
        return new Value(chr);
    }

    @Override
    public Value visitVerdadero_terminal(PsycoderParser.Verdadero_terminalContext ctx) {
        return new Value(true);
    }

    @Override
    public Value visitFalso_terminal(PsycoderParser.Falso_terminalContext ctx) {
        return new Value(false);
    }

   @Override
    public Value visitPrint_declaration(PsycoderParser.Print_declarationContext ctx) {
        this.visitChildren(ctx);
        System.out.println();
        return null;
    }

    @Override
    public Value visitStr_struct(PsycoderParser.Str_structContext ctx) {
        Value value = this.visit(ctx.expression());
        if(value.toString().contains("\\n")){
            System.out.print(value.toString().replace("\\n","\n"));
        }else {
            System.out.print(value + " ");
        }
        return this.visitChildren(ctx);
    }

    @Override
    public Value visitRead_declaration(PsycoderParser.Read_declarationContext ctx) {
        String id = ctx.identifier().getText();
        Value idVar = memory.getId(id);
        Scanner read = new Scanner(System.in);
        Object toAssign = null;

        if(idVar.isBoolean()) {
            String s = read.next();
            if(s.equals("verdadero")) toAssign = true;
            else if(s.equals("falso")) toAssign = false;
            else throw new RuntimeException("El valor de " + s + " no se puede asignar a un booleano");
        } else if(idVar.isCharacter()) {
            toAssign = read.next().charAt(0);
        } else if(idVar.isDouble()) {
            toAssign = read.nextDouble();
        } else if(idVar.isInteger()) {
            toAssign = read.nextInt();
        } else if(idVar.isString()) {
            toAssign = read.next();
        } else if(idVar.isStruct()) {
            throw new RuntimeException("No se puede imprimir la estructura " + id);
        }

        idVar.setValue(toAssign);
        return this.visitChildren(ctx);
    }

    /**
     * Declaración y llamado de funciones
     */

    private List<Tuple> paramsFun = new ArrayList<>();
    private int currentParam = 0;

    @Override
    public Value visitFunction_declaration(PsycoderParser.Function_declarationContext ctx) {
        String returnType = ctx.type().getText();
        String id = ctx.ID().getText();

        paramsFun.clear();
        this.visit(ctx.params());

        Function fun = new Function(returnType, this.paramsFun, ctx.cmp_declaration(), ctx.return_declaration());
        functionMemory.put(id, fun);
        return null;
    }

    @Override
    public Value visitFunction_call(PsycoderParser.Function_callContext ctx) {
        String id = ctx.ID().getText();
        Function currentFunction = functionMemory.get(id);

        if(currentFunction == null) throw new RuntimeException("La función \"" + id + "\" no ha sido declarada.");

        paramsFun = currentFunction.getParams();
        currentParam = 0;
        memory.addLocalMemory(false);

        this.visitChildren(ctx);

        if(currentParam != paramsFun.size()) {
            throw new RuntimeException("Se encontraron " + currentParam + " argumentos, se esperaban " + paramsFun.size() + ".");
        }

        paramsFun = new ArrayList<>();

        this.visitChildren(currentFunction.getContext());
        Value returnValue = this.visit(currentFunction.getReturnContext());

        if(!returnValue.getType().equals(currentFunction.getReturnType()))
            throw new RuntimeException("Se esperaba el tipo de retorno + " + currentFunction.getReturnType() + ", se encontró "
                    + returnValue.getType() + " en la función " + id + ".");

        memory.removeLocalMemory();

        return returnValue;
    }

    @Override
    public Value visitArgs_fun(PsycoderParser.Args_funContext ctx) {
        Value val = ctx.expression() != null ? this.visit(ctx.expression()) : null;

        if(currentParam == paramsFun.size() && paramsFun.size() != 0)
            throw new RuntimeException("Se esperaban " + paramsFun.size() + " argumentos.");


        if(paramsFun.size() != 0) {
            Tuple t = paramsFun.get(currentParam);
            currentParam++;

            //Value currentVal = this.visit(ctx.expression());
            if(!val.getType().equals(t.type)) throw new RuntimeException("Se esperaba " + t.type + " y se encontró " + val.getType() + ".");

            memory.addId(t.id, val);
        }

        return this.visitChildren(ctx);
    }

    @Override
    public Value visitReturn_declaration(PsycoderParser.Return_declarationContext ctx) {
        return this.visit(ctx.expression());
    }

    /**
     * Manejo de estructuras
     */
    public String currentStructBuild;

    @Override
    public Value visitStructElement(PsycoderParser.StructElementContext ctx) {
        currentStructBuild = ctx.ID().getText();
        structMemory.put(currentStructBuild, new HashMap<>());
        Value toRet = this.visitChildren(ctx);
        currentStructBuild = null;
        return toRet;
    }

    @Override
    public Value visitStruct_declaration(PsycoderParser.Struct_declarationContext ctx) {
        for(int i = 0; i < ctx.ID().size(); ++i) {
            String currentType = ctx.type().get(i).getText();
            String currentId = ctx.ID().get(i).getText();

            if(!currentType.equals("entero") && !currentType.equals("real") && !currentType.equals("caracter")
                    && !currentType.equals("cadena") && !currentType.equals("booleano") && !structMemory.containsKey(currentType)) {
                throw new RuntimeException("El tipo " + currentType + " no ha sido declarado.");
            }
            if(currentType.equals(currentStructBuild)) {
                throw new RuntimeException("No hay soporte a estructuras circulares");
            }
            Map<String, String> currentStruct = structMemory.get(currentStructBuild);
            if(currentStruct.containsKey(currentId)) {
                throw new RuntimeException("El identificador \"" + currentId + "\" ya ha sido declarado dentro de la estructura.");
            }

            structMemory.get(currentStructBuild).put(currentId, currentType);
        }
        return this.visitChildren(ctx);
    }
}
