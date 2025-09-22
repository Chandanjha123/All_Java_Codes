import java.util.Hashtable;
public class HashTableDemo {
    public static void main(String args[]){
        Hashtable<Object,Object> ht=new Hashtable<>();
        ht.put(20, "Chandan");
        ht.put(10, "Akash");
        ht.put(90, "Shubham");
        ht.put(60, "Gaurav");
        ht.put(70, "Manish");
        ht.put(80, "Aditya");
        ht.put(50, "Ritikesh");
        ht.put(30, "Rohit");
        System.out.println(ht);
        System.out.println(ht.get(20));
        System.out.println(ht.containsKey(90));
        System.out.println(ht.containsValue("Shubham"));
        System.out.println(ht.size());
        System.out.println(ht.remove(20));
        System.out.println(ht);
    }
}
