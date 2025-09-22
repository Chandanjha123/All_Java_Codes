import java.util.Iterator;
import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args){
        Vector<Object> v=new Vector<Object>();
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        v.addElement(20);
        v.addElement(60);
        v.addElement("Chandan");
        v.remove(2);
        System.out.println(v);
    }
}
