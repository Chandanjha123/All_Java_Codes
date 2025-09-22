import java.util.ArrayList;
public class collectionDemo {
    public static void main(String[] args){
        ArrayList<Object> obj=new ArrayList<Object>();
        obj.add("akash_kalwa");
        obj.add(100);
        obj.add(" mai maan jata hai ");
        System.err.println(obj);
        ArrayList<Object> obj2=new ArrayList<Object>();
        obj2.add("gaurav");
        obj2.add("lar chusta");
        System.out.println(obj2);
        obj.addAll(obj2);
        System.out.println(obj);
        System.out.println(obj.contains("gaurav"));
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());
        System.out.println(obj.remove(1));
        System.out.println(obj);

    }
}
