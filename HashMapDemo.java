import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args){
        HashMap<Object,Object> map=new HashMap<>();
        map.put(1,"Chandan");
        map.put(2,"hello");
        map.put(3,"world");
        map.put(4,"akash");
        map.put(6,"das");
        map.put(5,"meow");
        map.put(7,"bhaw");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("Chandan"));
        System.out.println(map.size());
        System.out.println(map.remove(1));
        System.out.println(map);
        System.out.println(map.size());
        map.clear();
        System.out.println(map);
        System.out.println(map.size());
    }
}
