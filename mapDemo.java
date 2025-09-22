import java.util.HashMap;
import java.util.Map;
public class mapDemo {
    public static void main(String args[]){
        Map<String,Integer> map=new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);
        System.out.println(map);
        System.out.println(map.get("a"));
        System.out.println(map.containsKey("a"));
        System.out.println(map.containsValue(1));
        System.out.println(map.size());
        System.out.println(map.remove("a"));
        System.out.println(map);
        System.out.println(map.size());
        map.clear();
        System.out.println(map);
        System.out.println(map.size());
    }
}
