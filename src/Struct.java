import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sergioalejandrodiazpinilla on 13/04/16.
 */
public class Struct {
    private Map<String,Value> myVar;
    private String name ;

    public Struct(ArrayList<String> myVar){
        for (String x:myVar){
            this.myVar.put(x,null);
        }
    }
    public Struct(ArrayList<String> myVar,Struct toAssign){
        this(myVar);
        for(String x: myVar){
            this.myVar.put(x,toAssign.get(x));
        }

    }
    public Struct(ArrayList<String> myVar,String name){
        this(myVar);
        this.name = name;
    }
    public Struct(ArrayList<String> myVar,Struct toAssign, String name){
        this(myVar, toAssign);
        this.name = name;
    }

    public Value get(String key){
        if(this.myVar.get(key) == null){
            throw new RuntimeException("No existe el identificador para esta estructura");
        }
        return this.myVar.get(key) ;
    }
    @Override
    public String toString(){
        return name;
    }

}
