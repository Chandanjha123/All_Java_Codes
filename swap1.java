import java.util.*;
public class swap1 {
    public static void main(String[]args){
        //swpping without using third varaible
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a=="+a);
        System.out.println("b=="+b);
    }
}
