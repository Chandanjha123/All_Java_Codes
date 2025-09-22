import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Object> all=new ArrayList<Object>(6);
        all.add(10);
        all.add(20);
        all.add(null);
        all.add(40);
        ArrayList<Object> al2=new ArrayList<Object>();
        al2.add(null);
        al2.add(20);
        al2.add(50);
        al2.add(55);
        all.removeAll(al2);
        System.out.println(all);
    }
}
