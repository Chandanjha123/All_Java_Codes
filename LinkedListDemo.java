import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<Object> l=new LinkedList<Object>();
        l.add(0, 1);
        l.add(1, "Akash");
        l.add(2, "Chandan");
        l.add(3, 20);
        l.add(4, 40);
        l.add(5, 50);
        l.add(6, 60);
        Iterator itr=l.iterator(); {
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        };
    }
}
