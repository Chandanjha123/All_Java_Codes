import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class ListDemo {
    public static void main(String[] args){
        List<Object> list=new ArrayList<Object>();
        list.add(10);
        list.add(20);
        list.add(30);
        // System.out.println(list);
        Iterator itr=list.iterator();
        ListIterator itr2=list.listIterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println("----------------------------------");
        while(itr2.hasPrevious()){
            System.out.println(itr2.previous());
        }
    }
}
