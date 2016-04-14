/**
 * Created by sergioalejandrodiazpinilla on 12/04/16.
 */
public class Value {

    public static Value VOID = new Value(new Object());

    final Object value;

    public Value(Object value) {
        this.value = value;
    }

    public Boolean asBoolean() {
        return (Boolean)value;
    }

    public Double asDouble() {
        return (Double)value;
    }

    public String asString() {
        return String.valueOf(value);
    }

    public boolean isDouble() {
        return value instanceof Double;
    }
    public boolean isBoolean() {
        return value instanceof Boolean;
    }
    public boolean isInteger() {
        return value instanceof Integer;
    }
    public boolean isString() {
        return value instanceof String;
    }
    public boolean isCharacter() {
        return value instanceof Character;
    }
    public boolean isStruct() {
        return value instanceof Struct;
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
            Struct temp = (Struct)this.value;
            return temp.toString();
        }else{
            return "NONE";
        }
    }

    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        Value that = (Value)o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}