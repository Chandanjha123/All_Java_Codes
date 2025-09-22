import java.util.TreeMap;
public class TreeMapDemo {
    public static void main(String[] args){
        TreeMap<Object,Object> map=new TreeMap<>();
        map.put(2,"Chandan");
        map.put(1,"hello");
        map.put(6,"world");
        map.put(3,"das");
        map.put(5,"meow");
        map.put(7,"bhaw");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.ceilingEntry(3));
        System.out.println(map.floorEntry(4));
        System.out.println(map.size());
        map.replace(5, "meowmeow");
        System.out.println(map);
        System.out.println(map.subMap(2,6));
    }
}
