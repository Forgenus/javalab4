import java.util.HashMap;
import java.util.Map;

public class Department{

    public int id;
    public String name;

    private static int nextId = 0;
    private static HashMap<String, Integer> ids = new HashMap<>();
    public Department(String name){
        if(!ids.containsKey(name)){
            ids.put(name, nextId);
            nextId++;
        }
        id = ids.get(name);
        this.name = name;
    }
}