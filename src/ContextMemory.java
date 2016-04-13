import java.util.Map;

/**
 * Created by sergioalejandrodiazpinilla on 13/04/16.
 */
public class ContextMemory {
    private Map<String,Value> memory;
    private boolean removable;

    public ContextMemory(Map<String, Value> memory, boolean removable){
        this.memory = memory;
        this.removable = removable;
    }

    public Map<String, Value> getMemory() {
        return memory;
    }

    public boolean isRemovable() {
        return removable;
    }
}
