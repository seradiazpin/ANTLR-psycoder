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
            //System.out.println(this.visit(ctx.expression()).getType()+", "+id+", "+this.visit(ctx.expression()).toString());
            String typec = this.visit(ctx.expression()).getType();
            if(!typec.equals(currentTypeToAssign)){
                throw new RuntimeException("Se esperaba " + currentTypeToAssign + " se encontro "+ typec);
            }
            memory.addId(id, this.visit(ctx.expression()));
        }

        return this.visit(ctx.assign_type_pri());
    }

    @Override
    public Value visitAssign_id(PsycoderParser.Assign_idContext ctx) {
        String id = ctx.identifier().getText();
        Value val = memory.getId(id);
        String typec = this.visit(ctx.expression()).getType();
        if(!val.getType().equals(typec)){
            throw new RuntimeException("Se esperaba " + val.getType() + " se encontro "+ typec);
        }
        //todo es esto el problema
        Value newVal = this.visit(ctx.expression());
        if(typec.equals("booleano")){
            val.setValue(newVal.asBoolean());
        }else if(typec.equals("entero")){
            val.setValue(newVal.asInteger());
        }else if(typec.equals("real")){
            val.setValue(newVal.asDouble());
        }else if(typec.equals("cadena")){
            val.setValue(newVal.asString());
        }else if(typec.equals("caracter")){
            val.setValue(newVal.toString().charAt(0));
        }else{
            if (newVal.isStruct() && memory.getId(newVal.asStruct().getName()) == null) {
                if(memory.getId(newVal.asStruct().getName()) == null){
                    throw new RuntimeException("type: "+id +" not created");
                }else{
                    throw new RuntimeException("variable: "+id + " is " +typec+" and "+newVal.toString()+" is "+newVal.getType());
                }
            }
            val.setValue(newVal.asStruct());
        }

        return this.visitChildren(ctx);
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
        try {
            return new Value(Integer.valueOf(ctx.getText()));
        }catch (Exception e){
            throw new RuntimeException("Entero fuera de rango");
        }
    }

    @Override
    public Value visitNeg_entero_terminal(PsycoderParser.Neg_entero_terminalContext ctx) {
        try {
            return new Value(-Integer.valueOf(ctx.getText()));
        }catch (Exception e){
            throw new RuntimeException("Entero fuera de rango");
        }
    }

    @Override
    public Value visitReal_terminal(PsycoderParser.Real_terminalContext ctx) {
        Double d = Double.valueOf(ctx.getText());
        if(d >= -2147483648 && d <= 2147483647){
            return new Value(Double.valueOf(ctx.getText()));
        }else{
            throw new RuntimeException("Real fuera de rango");
        }
    }

    @Override
    public Value visitNeg_real_terminal(PsycoderParser.Neg_real_terminalContext ctx) {
        Double d = Double.valueOf(ctx.getText());
        if(d >= -2147483648 && d <= 2147483647){
            return new Value(-Double.valueOf(ctx.getText()));
        }else{
            throw new RuntimeException("Real fuera de rango");
        }
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
        if(ctx.expression() == null){
            return Value.VOID;
        }
        Value value = this.visit(ctx.expression());
        if(value.toString().contains("\\n")){
            System.out.print(value.toString().replace("\\n","\n"));
        }else {
            System.out.print(value.toString() + " ");
        }
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

    @Override
    public Value visitParenPriExp(PsycoderParser.ParenPriExpContext ctx) {
        return this.visit(ctx.expression());
    }

    @Override
    public Value visitNegExp(PsycoderParser.NegExpContext ctx) {
        Value value = this.visit(ctx.expression_bool());
        if(!value.toString().equals("verdadero")&&!value.toString().equals("falso")){
            throw new RuntimeException("Solo se puede negar un valor booleano, se encontro "+value.toString());
        }else if(value.toString().equals("verdadero")) {
            return new Value(false);
        }else{
            return new Value(true);
        }
    }

    @Override
    public Value visitNegativeExp(PsycoderParser.NegativeExpContext ctx) {
        Value value = this.visit(ctx.expression());
        if(!value.isDouble() && !value.isInteger()){
            throw new RuntimeException("negatividad solo a numeros, se encontro "+value.toString());
        }else{
            return value.isInteger()? new Value(-value.asInteger()):new Value(-value.asDouble());
        }
    }

    @Override
    public Value visitMultiplicationExp(PsycoderParser.MultiplicationExpContext ctx) {
        Value left = this.visit(ctx.expression_product());
        Value right = this.visit(ctx.primary());
        switch (ctx.op.getText().charAt(0)) {
            case '*':
                if(left.isDouble() && right.isDouble()){
                    return new Value(left.asDouble() * right.asDouble());
                }else if(left.isDouble() && right.isInteger()){
                    return new Value(left.asDouble() * right.asInteger());
                }else if(left.isInteger() && right.isDouble()){
                    return new Value(left.asInteger() * right.asDouble());
                }else if(left.isInteger() && right.isInteger()){
                    return new Value(left.asInteger()*right.asInteger());
                }else if(left.isCharacter() && right.isDouble()){
                    return new Value((int)left.toString().charAt(0) * right.asDouble());
                }else if(left.isDouble() && right.isCharacter()){
                    return new Value(left.asDouble() * (int)right.toString().charAt(0));
                }else if(left.isInteger() && right.isCharacter()){
                    return new Value(left.asInteger() * (int)right.toString().charAt(0));
                }else if(left.isCharacter() && right.isInteger()){
                    return new Value((int)left.toString().charAt(0) * right.asInteger());
                }else if(left.isCharacter() && right.isCharacter()){
                    return new Value((int)left.toString().charAt(0) * (int)right.toString().charAt(0));
                }else {
                    throw new RuntimeException("operador: " +ctx.op.getText()+" solo para numeros enteros o reales");
                }
            case '/':
                if(left.isDouble() && right.isDouble()){
                    return new Value(left.asDouble() / right.asDouble());
                }else if(left.isDouble() && right.isInteger()){
                    return new Value(left.asDouble() / right.asInteger());
                }else if(left.isInteger() && right.isDouble()){
                    return new Value(left.asInteger() / right.asDouble());
                }else if(left.isInteger() && right.isInteger()){
                    return new Value(left.asInteger() / right.asInteger());
                }else if(left.isCharacter() && right.isDouble()){
                    return new Value((int)left.toString().charAt(0) / right.asDouble());
                }else if(left.isDouble() && right.isCharacter()){
                    return new Value(left.asDouble() / (int)right.toString().charAt(0));
                }else if(left.isInteger() && right.isCharacter()){
                    return new Value(left.asInteger() / (int)right.toString().charAt(0));
                }else if(left.isCharacter() && right.isInteger()){
                    return new Value((int)left.toString().charAt(0) / right.asInteger());
                }else if(left.isCharacter() && right.isCharacter()){
                    return new Value((int)left.toString().charAt(0) / (int)right.toString().charAt(0));
                }else {
                    throw new RuntimeException("operador: " +ctx.op.getText()+" solo para numeros enteros o reales");
                }
            case '%':
                if(left.isDouble() && right.isDouble()){
                    return new Value(left.asDouble() % right.asDouble());
                }else if(left.isDouble() && right.isInteger()){
                    return new Value(left.asDouble() % right.asInteger());
                }else if(left.isInteger() && right.isDouble()){
                    return new Value(left.asInteger() % right.asDouble());
                }else if(left.isInteger() && right.isInteger()){
                    return new Value(left.asInteger() % right.asInteger());
                }else if(left.isCharacter() && right.isDouble()){
                    return new Value((int)left.toString().charAt(0) % right.asDouble());
                }else if(left.isDouble() && right.isCharacter()){
                    return new Value(left.asDouble() % (int)right.toString().charAt(0));
                }else if(left.isInteger() && right.isCharacter()){
                    return new Value(left.asInteger() % (int)right.toString().charAt(0));
                }else if(left.isCharacter() && right.isInteger()){
                    return new Value((int)left.toString().charAt(0) % right.asInteger());
                }else if(left.isCharacter() && right.isCharacter()){
                    return new Value((int)left.toString().charAt(0) % (int)right.toString().charAt(0));
                }else {
                    throw new RuntimeException("operador: " +ctx.op.getText()+" solo para numeros enteros o reales");
                }
            default:
                throw new RuntimeException("unknown operator: " +ctx.op.getText());
        }
    }

    @Override
    public Value visitAdditionExp(PsycoderParser.AdditionExpContext ctx) {
        Value left = this.visit(ctx.expression_addition());
        Value right = this.visit(ctx.expression_product());
        switch (ctx.op.getText().charAt(0)) {
            case '+':
                if(left.isDouble() && right.isDouble()){
                    return new Value(left.asDouble() + right.asDouble());
                }else if(left.isDouble() && right.isInteger()){
                    return new Value(left.asDouble() + right.asInteger());
                }else if(left.isInteger() && right.isDouble()){
                    return new Value(left.asInteger() + right.asDouble());
                }else if(left.isInteger() && right.isInteger()){
                    return new Value(left.asInteger() + right.asInteger());
                }else if(left.isCharacter() && right.isDouble()){
                    return new Value((int)left.toString().charAt(0) + right.asDouble());
                }else if(left.isDouble() && right.isCharacter()){
                    return new Value(left.asDouble() + (int)right.toString().charAt(0));
                }else if(left.isInteger() && right.isCharacter()){
                    return new Value(left.asInteger() + (int)right.toString().charAt(0));
                }else if(left.isCharacter() && right.isInteger()){
                    return new Value((int)left.toString().charAt(0) + right.asInteger());
                }else if(left.isCharacter() && right.isCharacter()){
                    return new Value((int)left.toString().charAt(0) + (int)right.toString().charAt(0));
                }else if(left.isString() && right.isString()){
                    return new Value(left.toString()+ right.toString());
                }else {
                    throw new RuntimeException("operador: " +ctx.op.getText()+" solo para numeros enteros o reales");
                }
            case '-':
                if(left.isDouble() && right.isDouble()){
                    return new Value(left.asDouble() - right.asDouble());
                }else if(left.isDouble() && right.isInteger()){
                    return new Value(left.asDouble() - right.asInteger());
                }else if(left.isInteger() && right.isDouble()){
                    return new Value(left.asInteger() - right.asDouble());
                }else if(left.isInteger() && right.isInteger()){
                    return new Value(left.asInteger() - right.asInteger());
                }else if(left.isCharacter() && right.isDouble()){
                    return new Value((int)left.toString().charAt(0) - right.asDouble());
                }else if(left.isDouble() && right.isCharacter()){
                    return new Value(left.asDouble() - (int)right.toString().charAt(0));
                }else if(left.isInteger() && right.isCharacter()){
                    return new Value(left.asInteger() - (int)right.toString().charAt(0));
                }else if(left.isCharacter() && right.isInteger()){
                    return new Value((int)left.toString().charAt(0) - right.asInteger());
                }else if(left.isCharacter() && right.isCharacter()){
                    return new Value((int)left.toString().charAt(0) - (int)right.toString().charAt(0));
                }else {
                    throw new RuntimeException("operador: " +ctx.op.getText()+" solo para numeros enteros o reales");
                }
            default:
                throw new RuntimeException("unknown operator: " +ctx.op.getText());
        }
    }



    @Override
    public Value visitAndExp(PsycoderParser.AndExpContext ctx) {
        Value left = this.visit(ctx.expression_bool());
        Value right = this.visit(ctx.expression_rel());
        if(!left.isBoolean() || !right.isBoolean()){
            throw new RuntimeException("Expresion no booleana :"+left.toString()+" || "+right.toString());
        }
        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override
    public Value visitOrExp(PsycoderParser.OrExpContext ctx) {
        Value left = this.visit(ctx.expression());
        Value right = this.visit(ctx.expression_bool());
        if(!left.isBoolean() || !right.isBoolean()){
            throw new RuntimeException("Expresion no booleana:"+left.toString()+" && "+right.toString());
        }
        return new Value(left.asBoolean() || right.asBoolean());
    }


    @Override
    public Value visitRelationalExp(PsycoderParser.RelationalExpContext ctx) {
        Value left = this.visit(ctx.expression_addition(0));
        Value right = this.visit(ctx.expression_addition(1));
        switch (ctx.op.getType()) {
            case PsycoderParser.GT:
                if(left.isDouble() && right.isDouble()){
                    return new Value(left.asDouble() > right.asDouble());
                }else if(left.isDouble() && right.isInteger()){
                    return new Value(left.asDouble() > right.asInteger());
                }else if(left.isInteger() && right.isDouble()){
                    return new Value(left.asInteger() > right.asDouble());
                }else if(left.isInteger() && right.isInteger()){
                    return new Value(left.asInteger() > right.asInteger());
                }else if(left.isCharacter() && right.isDouble()){
                    return new Value((int)left.toString().charAt(0) > right.asDouble());
                }else if(left.isDouble() && right.isCharacter()){
                    return new Value(left.asDouble() > (int)right.toString().charAt(0));
                }else if(left.isInteger() && right.isCharacter()){
                    return new Value(left.asInteger() > (int)right.toString().charAt(0));
                }else if(left.isCharacter() && right.isInteger()){
                    return new Value((int)left.toString().charAt(0) > right.asInteger());
                }else if(left.isCharacter() && right.isCharacter()){
                    return new Value((int)left.toString().charAt(0) > (int)right.toString().charAt(0));
                }else {
                    throw new RuntimeException("operador: " +ctx.op.getText()+" solo para expreciones booleanas");
                }
            case PsycoderParser.GTEQ:
                if(left.isDouble() && right.isDouble()){
                    return new Value(left.asDouble() >= right.asDouble());
                }else if(left.isDouble() && right.isInteger()){
                    return new Value(left.asDouble() >= right.asInteger());
                }else if(left.isInteger() && right.isDouble()){
                    return new Value(left.asInteger() >= right.asDouble());
                }else if(left.isInteger() && right.isInteger()){
                    return new Value(left.asInteger() >= right.asInteger());
                }else if(left.isCharacter() && right.isDouble()){
                    return new Value((int)left.toString().charAt(0) >= right.asDouble());
                }else if(left.isDouble() && right.isCharacter()){
                    return new Value(left.asDouble() >= (int)right.toString().charAt(0));
                }else if(left.isInteger() && right.isCharacter()){
                    return new Value(left.asInteger() >= (int)right.toString().charAt(0));
                }else if(left.isCharacter() && right.isInteger()){
                    return new Value((int)left.toString().charAt(0) >= right.asInteger());
                }else if(left.isCharacter() && right.isCharacter()){
                    return new Value((int)left.toString().charAt(0) >= (int)right.toString().charAt(0));
                }else {
                    throw new RuntimeException("operador: " +ctx.op.getText()+" solo para expreciones booleanas");
                }
            case PsycoderParser.LT:
                if(left.isDouble() && right.isDouble()){
                    return new Value(left.asDouble() < right.asDouble());
                }else if(left.isDouble() && right.isInteger()){
                    return new Value(left.asDouble() < right.asInteger());
                }else if(left.isInteger() && right.isDouble()){
                    return new Value(left.asInteger() < right.asDouble());
                }else if(left.isInteger() && right.isInteger()){
                    return new Value(left.asInteger() < right.asInteger());
                }else if(left.isCharacter() && right.isDouble()){
                    return new Value((int)left.toString().charAt(0) < right.asDouble());
                }else if(left.isDouble() && right.isCharacter()){
                    return new Value(left.asDouble() < (int)right.toString().charAt(0));
                }else if(left.isInteger() && right.isCharacter()){
                    return new Value(left.asInteger() < (int)right.toString().charAt(0));
                }else if(left.isCharacter() && right.isInteger()){
                    return new Value((int)left.toString().charAt(0) < right.asInteger());
                }else if(left.isCharacter() && right.isCharacter()){
                    return new Value((int)left.toString().charAt(0) < (int)right.toString().charAt(0));
                }else {
                    throw new RuntimeException("operador: " +ctx.op.getText()+" solo para expreciones booleanas");
                }
            case PsycoderParser.LTEQ:
                if(left.isDouble() && right.isDouble()){
                    return new Value(left.asDouble() <= right.asDouble());
                }else if(left.isDouble() && right.isInteger()){
                    return new Value(left.asDouble() <= right.asInteger());
                }else if(left.isInteger() && right.isDouble()){
                    return new Value(left.asInteger() <= right.asDouble());
                }else if(left.isInteger() && right.isInteger()){
                    return new Value(left.asInteger() <= right.asInteger());
                }else if(left.isCharacter() && right.isDouble()){
                    return new Value((int)left.toString().charAt(0) <= right.asDouble());
                }else if(left.isDouble() && right.isCharacter()){
                    return new Value(left.asDouble() <= (int)right.toString().charAt(0));
                }else if(left.isInteger() && right.isCharacter()){
                    return new Value(left.asInteger() <= (int)right.toString().charAt(0));
                }else if(left.isCharacter() && right.isInteger()){
                    return new Value((int)left.toString().charAt(0) <= right.asInteger());
                }else if(left.isCharacter() && right.isCharacter()){
                    return new Value((int)left.toString().charAt(0) <= (int)right.toString().charAt(0));
                }else {
                    throw new RuntimeException("operador: " +ctx.op.getText()+" solo para expreciones booleanas");
                }
            default:
                throw new RuntimeException("unknown operator: " +ctx.op.getText());
        }
    }

    @Override
    public Value visitEqualitylExp(PsycoderParser.EqualitylExpContext ctx) {
        Value left = this.visit(ctx.expression_addition(0));
        Value right = this.visit(ctx.expression_addition(1));
        switch (ctx.op.getType()) {
            case PsycoderParser.EQ:
                if(left.isDouble() && right.isDouble()){
                    return new Value(left.asDouble().equals(right.asDouble()));
                }else if(left.isInteger() && right.isInteger()){
                    return new Value(left.asInteger().equals(right.asInteger()));
                }else if(left.isInteger() && right.isCharacter()){
                    return new Value(left.asInteger() == (int)right.toString().charAt(0));
                }else if(left.isCharacter() && right.isInteger()){
                    return new Value((int)left.toString().charAt(0) == right.asInteger());
                }else if(left.isCharacter() && right.isCharacter()){
                    return new Value((int)left.toString().charAt(0) == (int)right.toString().charAt(0));
                }else if(left.isBoolean() && right.isBoolean()){
                    return new Value(left.asBoolean().equals(right.asBoolean()));
                }else {
                    throw new RuntimeException("operador: " +ctx.op.getText()+" solo para expreciones booleanas");
                }
            case PsycoderParser.NEQ:
                if(left.isDouble() && right.isDouble()){
                    return new Value(!left.asDouble().equals(right.asDouble()));
                }else if(left.isInteger() && right.isInteger()){
                    return new Value(!left.asInteger().equals(right.asInteger()));
                }else if(left.isInteger() && right.isCharacter()){
                    return new Value(left.asInteger() != (int)right.toString().charAt(0));
                }else if(left.isCharacter() && right.isInteger()){
                    return new Value((int)left.toString().charAt(0) != right.asInteger());
                }else if(left.isCharacter() && right.isCharacter()){
                    return new Value((int)left.toString().charAt(0) != (int)right.toString().charAt(0));
                }else if(left.isBoolean() && right.isBoolean()){
                    return new Value(!left.asBoolean().equals(right.asBoolean()));
                }else {
                    throw new RuntimeException("operador: " +ctx.op.getText()+" solo para expreciones booleanas");
                }
            default:
                throw new RuntimeException("unknown operator: " +ctx.op.getText());
        }
    }
}
