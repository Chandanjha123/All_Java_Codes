import java.util.HashSet;
public class HashsetDemo {
    public static void main(String[] args){
        HashSet<Object> al1=new HashSet<Object>();
        al1.add(10);
        al1.add(20);
        al1.add(20);
        al1.add("akash");
        HashSet<Object> al2=new HashSet<Object>();
        al2.add(null);
        al2.add(20);
        al2.add(30);
        al2.add(40);
        System.out.println(al1);
        System.out.println(al2.size());
    }
}
