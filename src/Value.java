/**
 * Created by sergioalejandrodiazpinilla on 12/04/16.
 */
public class Value {

    public static double REAL = 0.0;
    public static int INTEGER = 0;
    public static String STRING = "";
    public static char CHAR = ' ';
    public static boolean BOOLEAN = false;

    public static Value REALDESP = new Value(0.0000000000000001);

    private Object value;

    public Value(Object value) {
        if(value instanceof Integer){
            checkRangeInt(Integer.valueOf(value.toString()));
        }
        if(value instanceof Double){
            checkRangeDouble(Double.valueOf(value.toString()));
        }
        this.setValue(value);
    }

    public Boolean asBoolean() {
        return (Boolean) getValue();
    }

    public Double asDouble() {
        return (Double) getValue();
    }

    public String asString() {
        return String.valueOf(getValue());
    }

    public Integer asInteger() {
        return (Integer) getValue();
    }

    public Struct asStruct() {
        return (Struct) getValue();
    }

    public boolean isDouble() {
        return getValue() instanceof Double;
    }
    public boolean isBoolean() {
        return getValue() instanceof Boolean;
    }
    public boolean isInteger() {
        return getValue() instanceof Integer;
    }
    public boolean isString() {
        return getValue() instanceof String;
    }
    public boolean isCharacter() {
        return getValue() instanceof Character;
    }
    public boolean isStruct() {
        return getValue() instanceof Struct;
    }

    public String getType(){
        if(this.isDouble()){
            return "real";
        }else if (this.isString()){
            return "cadena";
        }else if (this.isBoolean()){
            return "booleano";
        }else if (this.isCharacter()){
            return "caracter";
        }else if (this.isInteger()){
            return "entero";
        }else if (this.isStruct()){
            Struct temp = (Struct) this.getValue();
            return temp.toString();
        }else {
            return "NONE";
        }
    }

    @Override
    public int hashCode() {

        if(getValue() == null) {
            return 0;
        }

        return this.getValue().hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(getValue() == o) {
            return true;
        }

        if(getValue() == null || o == null || o.getClass() != getValue().getClass()) {
            return false;
        }

        Value that = (Value)o;

        return this.getValue().equals(that.getValue());
    }

    @Override
    public String toString() {
        if(this.isBoolean()) {
            if(this.asBoolean()) {
                return "verdadero";
            } else {
                return "falso";
            }
        }

        return String.valueOf(getValue());
    }
    public void setValue(Object value) {
        if(value.toString().equals("falso"))
            this.value = false;
        else if(value.toString().equals("verdadero"))
            this.value = true;
        else
            this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void checkRangeInt(Integer a){
        if(a < -2147483648 || a > 2147483647) throw new RuntimeException("<line> Error semantico: variable por fuera de su rango valido.");
    }
    public void checkRangeDouble(Double a){
        if(a < -2147483648 || a > 2147483647) throw new RuntimeException("<line> Error semantico: variable por fuera de su rango valido.");
    }
}