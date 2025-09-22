import java.util.*;
public class swap2 {
    public static void main(String[]args){
        //swpping without using third varaible
        int m=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
       m=a;
       a=b;
       b=m;
        System.out.println("a=="+a);
        System.out.println("b=="+b);
    }
}
