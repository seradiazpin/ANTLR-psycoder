/**
 * Created by sergioalejandrodiazpinilla on 12/04/16.
 */
public class Value {

    public static Value VOID = new Value(new Object());
    public static Value REAL = new Value(0.0);
    public static Value INTEGER = new Value(0);
    public static Value STRING = new Value("");
    public static Value CHAR = new Value(' ');
    public static Value BOOLEAN = new Value(false);

    private Object value;

    public Value(Object value) {
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
        }else{
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
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}