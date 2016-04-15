import java.util.*;

/**
 * Created by sergioalejandrodiazpinilla on 12/04/16.
 */
public class EvalVisitor extends PsycoderBaseVisitor<Value> {
    public static final double SMALL_VALUE = 0.00000000001;

    // store variables (there's only one global scope!)
    private MemoryManager memory;
    private Map<String, Map<String, String>> structMemory = new HashMap<String, Map<String, String>>();
    private Map<String, List<String>> functionMemory = new HashMap<String, List<String>>();


    public EvalVisitor(){
        memory = new MemoryManager();
    }

    @Override
    public Value visitProgram(PsycoderParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Value visitAssign(PsycoderParser.AssignContext ctx) {
        if(ctx.type() != null) {
            String type = ctx.type().getText();
            String id = ctx.ID().getText();
            Value value = this.visit(ctx.assign_pri().expression());
            if (type.equals("booleano")) {
                if (!value.isBoolean()) {
                    throw new RuntimeException("variable: "+id + " is " +type+" and "+value.toString()+" is "+value.getType());
                }
            } else if (type.equals("entero")) {
                if (!value.isInteger()) {
                    throw new RuntimeException("variable: "+id + " is " +type+" and "+value.toString()+" is "+value.getType()); 
                }
            } else if (type.equals("real")) {
                if (!value.isDouble()) {
                    throw new RuntimeException("variable: "+id + " is " +type+" and "+value.toString()+" is "+value.getType()); 
                }
            } else if (type.equals("cadena")) {
                if (!value.isString()) {
                    throw new RuntimeException("variable: "+id + " is " +type+" and "+value.toString()+" is "+value.getType()); 
                }
            } else if (type.equals("caracter")) {
                if (!value.isCharacter()) {
                    throw new RuntimeException("variable: "+id + " is " +type+" and "+value.toString()+" is "+value.getType()); 
                }
            } else {
                if (!value.isStruct() && structMemory.get(type) == null) {
                    if(structMemory.get(type) == null){
                            throw new RuntimeException("type: "+id +" not created");
                    }else{
                        throw new RuntimeException("variable: "+id + " is " +type+" and "+value.toString()+" is "+value.getType());
                    }
                }
            }

            memory.addId(id, value);
            return value;
        }else{
            String id = ctx.ID().getText();
            Value value = this.visit(ctx.assign_pri().expression());
            Value idVal = memory.getId(id);

            if(idVal == null) {
                throw new RuntimeException("No a sido delcarado : " + id);
            } else {
                //idVal = memory.remove(id);
                if (!idVal.getType().equals(value.getType())) {
                        throw new RuntimeException(ctx.getStart().getLine() + " variable " + id + " is " + idVal.getType() + " y " + value.toString() + " is " + value.getType());
                } else {
                    idVal.setValue(value.getValue());
                }
            }
            /*System.out.println("---------------------------");
            System.out.println("id->" + id);
            System.out.println("value->" + value.toString());
            System.out.println("Class->" + value.getType());
            System.out.println("----------------------------");*/
            //return memory.put(id,idVal);
            return value;
        }
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
        visitChildren(ctx);
        System.out.println();
        return null;
    }

    @Override
    public Value visitStr_struct(PsycoderParser.Str_structContext ctx) {
        Value value = this.visit(ctx.expression());
        System.out.print(value + " ");
        return visitChildren(ctx);
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
        return null;
    }

    /**
     * Operadores de expresiones
     */

    // pendiente
    /*@Override public Value visitFunctionDotOpExp(PsycoderParser.FunctionDotOpExpContext ctx) {
        Value val = this.visit(ctx.function_call());
        if(!val.isStruct()) throw new RuntimeException("El valor retornado por la función no es una estructura");

        Struct struct = val.asStruct();

    }*/
}
