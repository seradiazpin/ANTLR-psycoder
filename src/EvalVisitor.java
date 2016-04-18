import org.antlr.v4.codegen.model.ArgAction;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

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

    private Value createDefaultStruct(String type) {
        if(!structMemory.containsKey(type))
            throw new RuntimeException("La estructura " + type + " no esta declarada.");

        Map<String, String> properties = structMemory.get(type);
        Map<String, Value> variables = new HashMap<>();

        for(String property : properties.keySet()) {
            String currType = properties.get(property);

            switch (currType) {
                case "entero":
                    variables.put(property, new Value(Value.INTEGER));
                    break;
                case "real":
                    variables.put(property, new Value(Value.REAL));
                    break;
                case "cadena":
                    variables.put(property, new Value(Value.STRING));
                    break;
                case "caracter":
                    variables.put(property, new Value(Value.CHAR));
                    break;
                case "booleano":
                    variables.put(property, new Value(Value.BOOLEAN));
                    break;
                default:
                    variables.put(property, createDefaultStruct(currType));
                    break;
            }
        }

        return new Value(new Struct(variables, type));
    }

    @Override
    public Value visitAssign_type(PsycoderParser.Assign_typeContext ctx) {
        String id = ctx.ID().getText();

        if(memory.containsId(id)) {
            throw new RuntimeException("El identificador " + id + " ya existe y no se puede declarar de nuevo.");
        }

        if(ctx.expression() == null) { // asignación por omisión
            if(!this.currentTypeToAssign.equals("entero") && !this.currentTypeToAssign.equals("real") && !this.currentTypeToAssign.equals("caracter")
                    && !this.currentTypeToAssign.equals("cadena") &&  !this.currentTypeToAssign.equals("booleano")) { // caso de asignar estructura

                memory.addId(id, createDefaultStruct(this.currentTypeToAssign));
            } else { // caso de asignación por omisión de tipo primitivo
                memory.addId(id, this.currentTypeToAssign);
            }
        } else { // asignación por expresión
            Value toAssign = this.visit(ctx.expression());
            if(!toAssign.getType().equals(this.currentTypeToAssign)) {
                throw new RuntimeException("El tipo de la expresión es " + toAssign.getType() +
                        ", se esperaba " + this.currentTypeToAssign + ".");
            }
            memory.addId(id, toAssign);
        }

        return ctx.assign_type_pri() != null ? this.visit(ctx.assign_type_pri()) : memory.getId(id);
    }

    @Override
    public Value visitAssign_id(PsycoderParser.Assign_idContext ctx) {
        Value val = this.visit(ctx.identifier());
        val.setValue(this.visit(ctx.expression()));

        return this.visit(ctx.assign_id_pri());
    }

    @Override
    public Value visitId_terminal(PsycoderParser.Id_terminalContext ctx) {
        Value value = this.visit(ctx.identifier());
        //Value value = memory.getId(id);
        return value;
    }

    /**
     * Devuelve un elemento de acuerdo al identificador, este solo es usado cuando se
     * hace asignación sin tipo, por lo que es correcto devolverlo
     */
    @Override
    public Value visitIdentifier(PsycoderParser.IdentifierContext ctx) {
        List<TerminalNode> ids = ctx.ID();
        String id = ids.get(0).getText();

        if(!memory.containsId(id)) {
            throw new RuntimeException("El identificador \"" + id + "\" no ha sido declarado.");
        }

        Value element = memory.getId(id);
        if(element.isStruct()) {
            Value structValue = element;
            String prevId = "Nothing"; // default to debug
            for(int i = 1; i < ids.size(); ++i) {
                String currentId = ids.get(i).getText();

                if(!structValue.isStruct()) {
                    throw new RuntimeException("El operador \".\" no es válido sobre \"" + prevId + "\" " +
                            "ya que este es un tipo primitivo.");
                }

                if(!structValue.asStruct().containsId(currentId)) {
                    throw new RuntimeException("el identificador \"" + ids.get(i).getText() + "\" no hace parte de la " +
                            "estructura \"" + structValue.asStruct() + "\".");
                }

                structValue = structValue.asStruct().get(currentId);
                prevId = currentId;
            }

            element = structValue;
        } else {
            if(ids.size() > 1) {
                throw new RuntimeException("El identificador \"" + id + "\" es un " +
                        element.getType() + " no una estructura.");
            }
        }

        return element;
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
    private Value returnedValue = null;
    private boolean isReturning = false;

    @Override
    public Value visitFunction_declaration(PsycoderParser.Function_declarationContext ctx) {
        String returnType = ctx.type().getText();
        String id = ctx.ID().getText();

        paramsFun.clear();
        this.visit(ctx.params());

        Function fun = new Function(returnType, this.paramsFun, ctx.cmp_declaration());
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
        if(!this.isReturning) {
            throw new RuntimeException("La función \"" + id + "\" debe tener una sentencia \"retornar\".");
        }

        Value returnValue = this.returnedValue;
        //this.returnedValue = null;
        this.isReturning = false;

        if(!returnValue.getType().equals(currentFunction.getReturnType()))
            throw new RuntimeException("Se esperaba el tipo de retorno + " + currentFunction.getReturnType() + ", se encontró "
                    + returnValue.getType() + " en la función " + id + ".");

        memory.removeFunctionMemory();

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
        this.returnedValue = this.visit(ctx.expression());
        this.isReturning = true;

        if(!memory.isCurrentFunction()) {
            throw new RuntimeException("La sentencia retornar debe estar dentro de una función y no en funcion_principal");
        }

        return null;
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

    /**
     * Declaracion if
     */

    private boolean isBreaking = false;

    @Override
    public Value visitCmp_declaration(PsycoderParser.Cmp_declarationContext ctx) {
        return isBreaking || isReturning ? null : super.visitCmp_declaration(ctx);
    }

    @Override
    public Value visitDeclaration(PsycoderParser.DeclarationContext ctx) {

        if(ctx.break_declaration() == null)
            return super.visitDeclaration(ctx);
        else {
            this.isBreaking = true;
            return null;
        }
    }

    @Override
    public Value visitIf_declaration(PsycoderParser.If_declarationContext ctx) {
        Value val = this.visit(ctx.expression());
        if(!val.isBoolean()) {
            throw new RuntimeException("La expresión dentro del if debe ser booleana y es " + val.getType() + ".");
        }

        memory.addLocalMemory(true);
        Value ret;

        if(val.asBoolean()) {
            ret = this.visit(ctx.cmp_declaration());
        } else {
            ret = this.visit(ctx.declaration_if());
        }

        memory.removeLocalMemory();

        return ret;
    }

    @Override
    public Value visitDeclaration_if(PsycoderParser.Declaration_ifContext ctx) {
        if(ctx.cmp_declaration() != null) {
            return this.visit(ctx.cmp_declaration());
        }
        else return null;
    }

    /**
     * while declaration
     */

    @Override
    public Value visitWhile_declaration(PsycoderParser.While_declarationContext ctx) {
        Value condition = this.visit(ctx.expression());
        if(!condition.isBoolean()) {
            throw new RuntimeException("La condición del \"mientras\" debe ser booleana, se recibió " + condition.getType() + ".");
        }

        memory.addLocalMemory(true);

        while(condition.asBoolean()) {
            this.visit(ctx.cmp_declaration());
            condition = this.visit(ctx.expression());

            if(isBreaking || isReturning || !condition.asBoolean() ) {
                if(isBreaking) {
                    isBreaking = !isBreaking;
                }
                memory.removeLocalMemory();
                return null;
            }
        }

        return null;
    }

    /**
     * for declaration
     */

    @Override
    public Value visitFor_declaration(PsycoderParser.For_declarationContext ctx) {
        List<PsycoderParser.ExpressionContext> exps = ctx.expression();

        Value condition = this.visit(exps.get(exps.size() == 2 ? 1 : 0));
        Value toAssign = this.visit(exps.get(0));
        String id = ctx.ID().getText();
        if(!condition.isBoolean()) {
            throw new RuntimeException("La condición del \"para\" debe ser booleana, se recibió " + condition.getType() + ".");
        }

        memory.addLocalMemory(true);

        if(!(toAssign.isInteger() || toAssign.isDouble())) {
            throw new RuntimeException("El tipo de la asignación del \"para\" debe ser entero o real, se recibió " + toAssign.getType() + ".");
        }

        if(ctx.type() != null) {
            memory.addId(id, toAssign);
        } else {
            if(!memory.containsId(id)) {
                throw new RuntimeException("El identificador \"" + id + "\" no ha sido declarado.");
            }

            Value obtained = memory.getId(id);
            obtained.setValue(toAssign.getValue());
            toAssign = obtained;
        }

        while (condition.asBoolean()) {
            this.visit(ctx.cmp_declaration());
            condition = this.visit(exps.get(exps.size() == 2 ? 1 : 0));

            if(!(!isBreaking && !isReturning)) {
                if(isBreaking) {
                    isBreaking = !isBreaking;
                }
                memory.removeLocalMemory();
                return null;
            }

            Value toIncrease = this.visit(ctx.end_loop());

            if(toAssign.isInteger()) {
                toAssign.setValue(toAssign.asInteger() + toIncrease.asInteger());
            } else {
                toAssign.setValue(toAssign.asDouble() + toIncrease.asDouble());
            }
        }

        memory.removeLocalMemory();
        return null;
    }

    @Override
    public Value visitEnd_loop(PsycoderParser.End_loopContext ctx) {
        if(ctx.ID() != null) {
            String id = ctx.ID().getText();
            if(!memory.containsId(id)) {
                throw new RuntimeException("El identificador \"" + id + "\" no existe.");
            }
            return memory.getId(id);
        } else {
            return ctx.TK_ENTERO() != null ? new Value(Integer.valueOf(ctx.TK_ENTERO().getText()))
                                            : new Value(Double.valueOf(ctx.TK_REAL().getText()));
        }
    }

    /**
     * do while declaration
     */
    @Override
    public Value visitDowhile_declaration(PsycoderParser.Dowhile_declarationContext ctx) {
        Value condition = this.visit(ctx.expression());
        if(!condition.isBoolean()) {
            throw new RuntimeException("La condición del \"mientras\" debe ser booleana, se recibió " + condition.getType() + ".");
        }

        memory.addLocalMemory(true);

        do {
            this.visit(ctx.cmp_declaration());
            if(isBreaking || isReturning) {
                if(isBreaking) {
                    isBreaking = !isBreaking;
                }
                memory.removeLocalMemory();
                return null;
            }

            condition = this.visit(ctx.expression());
        } while (condition.asBoolean());

        memory.removeLocalMemory();
        return null;
    }

    /**
     * switch case declaration
     */
    @Override
    public Value visitSwitch_declaration(PsycoderParser.Switch_declarationContext ctx) {
        Value variable = this.visit(ctx.identifier());
        if(variable.getValue() instanceof Value) { // ESTO ES HORRRIIIIIIBLEEEEEE
            variable = (Value)variable.getValue();
        }

        List<PsycoderParser.Cmp_declarationContext> contexts = ctx.cmp_declaration();
        List<PsycoderParser.Terminal_valueContext> comparisons = ctx.terminal_value();

        if(variable.isStruct()) {
            throw new RuntimeException("No hay soporte para estructuras dentro del seleccionar");
        }

        for(int i = 0; i < comparisons.size(); ++i) {
            Value currentCase = this.visit(comparisons.get(i));
            if(!currentCase.getType().equals(variable.getType())) {
                throw new RuntimeException("El tipo es \"" + currentCase.getType() + "\", se esperaba " + variable.getType() + ".");
            }

            if(currentCase.getValue().equals(variable.getValue())) {
                memory.addLocalMemory(true);

                this.visit(contexts.get(i));
                if(isBreaking || isReturning) {
                    if(isBreaking) {
                        isBreaking = !isBreaking;
                    }
                    memory.removeLocalMemory();
                    return null;
                }

                memory.removeLocalMemory();
            }
        }

        if(comparisons.size() != contexts.size()) {
            memory.addLocalMemory(true);

            this.visit(contexts.get(contexts.size() - 1));
            if(isBreaking || isReturning) {
                if(isBreaking) {
                    isBreaking = !isBreaking;
                }
                memory.removeLocalMemory();
                return null;
            }

            memory.removeLocalMemory();
        }

        return null;
    }
}
