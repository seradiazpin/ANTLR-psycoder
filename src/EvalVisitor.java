import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Created by sergioalejandrodiazpinilla on 12/04/16.
 */
public class EvalVisitor extends PsycoderBaseVisitor<Value> {
    public static final double SMALL_VALUE = 0.00000000001;

    // store variables (there's only one global scope!)
    private Map<String, Value> memory = new HashMap<String, Value>();
    private Map<String, List<String>> structMemory = new HashMap<String, List<String>>();
    private Map<String, List<String>> functionMemory = new HashMap<String, List<String>>();
    private Stack<ContextMemory> localMemory = new Stack<ContextMemory>();
    private Stack<ContextMemory> auxiliar = new Stack<ContextMemory>();

    public EvalVisitor(){
        localMemory.push(new ContextMemory(new HashMap<String, Value>(),false));
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
            return memory.put(id,value);
        }else{
            String id = ctx.ID().getText();
            Value value = this.visit(ctx.assign_pri().expression());
            Value idVal;
            if(!memory.containsKey(id)) {
                throw new RuntimeException("No a sido delcarado : " + id);
            }else{
                idVal = memory.remove(id);
                System.out.println("");
                if (idVal.getType() != value.getType()) {
                        throw new RuntimeException("variable: "+id + " is " +idVal.getType()+" and "+value.toString()+" is "+value.getType());
                }else {
                    idVal = new Value(value);
                }
            }
            /*
            System.out.println("---------------------------");
            System.out.println("id->" + id);
            System.out.println("value->" + value.toString());
            System.out.println("Class->" + value.getType());
            System.out.println("----------------------------");
            */
            return memory.put(id,idVal);
        }

    }

    @Override
    public Value visitId_terminal(PsycoderParser.Id_terminalContext ctx) {
        String id = ctx.getText();
        Value value = memory.get(id);
        if(value == null) {
            throw new RuntimeException("No a sido delcarado : " + id);
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
    public Value visitVerdadero_terminal(PsycoderParser.Verdadero_terminalContext ctx){
        return new Value(true);
    }

    @Override
    public Value visitFalso_terminal(PsycoderParser.Falso_terminalContext ctx) {
        return new Value(false);
    }
}
