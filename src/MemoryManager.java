import java.util.HashMap;
import java.util.Stack;

/**
 * Created by Jefferson on 14/04/2016.
 */
public class MemoryManager {
    private Stack<ContextMemory> localMemory;
    private Stack<ContextMemory> auxiliar;

    public MemoryManager() {
        localMemory = new Stack<ContextMemory>();
        auxiliar = new Stack<ContextMemory>();
        localMemory.push(new ContextMemory(new HashMap<String, Value>(), false));
    }

    public void addLocalMemory(boolean removable) {
        localMemory.push(new ContextMemory(new HashMap<String, Value>(), removable));
    }

    public void addId(String id, Value value) {
        ContextMemory memory = localMemory.peek();
        if(memory.getMemory().containsKey(id)) {
            throw new RuntimeException("el identificador " + id + " ya fue declarado");
        }

        localMemory.peek().getMemory().put(id, value);
    }

    public void addId(String id, String type) {
        ContextMemory memory = localMemory.peek();
        if(memory.getMemory().containsKey(id)) {
            throw new RuntimeException("el identificador " + id + " ya fue declarado");
        }

        if (type.equals("booleano")) {
            memory.getMemory().put(id, new Value(Value.BOOLEAN));
        } else if (type.equals("entero")) {
            memory.getMemory().put(id, new Value(Value.INTEGER));
        } else if (type.equals("real")) {
            memory.getMemory().put(id, new Value(Value.REAL));
        } else if (type.equals("cadena")) {
            memory.getMemory().put(id, new Value(Value.STRING));
        } else if (type.equals("caracter")) {
            memory.getMemory().put(id, new Value(Value.CHAR));
        } else {
            Struct s = new Struct();
            s.setName(type);
            memory.getMemory().put(id, new Value(s));
        }
    }

    public Value getId(String id) {
        Value val = null;
        ContextMemory memory = null;

        do {
            memory = localMemory.peek();
            val = memory.getMemory().get(id);
            if(val != null) {
                break;
            } else if(memory.isRemovable()) {
                auxiliar.push(memory);
                localMemory.pop();
            }
        } while (memory.isRemovable());

        while (!auxiliar.empty()) localMemory.push(auxiliar.pop());

        if(val == null) {
            throw new RuntimeException("No existe el identificador " + id);
        }

        return val;
    }

    public boolean containsId(String id) {
        try {
            getId(id);
        } catch (RuntimeException ex) {
            return false;
        }

        return true;
    }

    public void removeLocalMemory() {
        if(localMemory.empty()) throw new IllegalStateException("no hay más memoria");
        localMemory.pop();
    }
}
