import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Struct {
    private Map<String,Value> myVar;
    private String name ;

    public Struct() {}

    public Struct(Map<String, Value> myVar, String name) {
        this.myVar = myVar;
        this.name = name;
    }

    public Struct(ArrayList<String> myVar){
        this.myVar = new HashMap<String, Value>();

        for (String x:myVar){
            this.myVar.put(x,null);
        }
    }
    public Struct(ArrayList<String> myVar, Struct toAssign){
        this(myVar);
        for(String x: myVar){
            this.myVar.put(x,toAssign.get(x));
        }
    }

    public Struct(ArrayList<String> myVar, String name){
        this(myVar);
        this.name = name;
    }
    public Struct(ArrayList<String> myVar, Struct toAssign, String name){
        this(myVar, toAssign);
        this.name = name;
    }

    public Value get(String key){
        return this.myVar.get(key) ;
    }

    public boolean containsId(String key) {
        return this.myVar.containsKey(key);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

}
