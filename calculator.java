import java.util.*;
public class calculator {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of a ");
    int a=sc.nextInt();
    System.out.println("enter the value of b");
    int b=sc.nextInt();
    System.out.println("select symbol(+,-,*,/,%)");
    int sum=0;
    String sym=sc.next();
    switch (sym) {
        case "+":
            sum=a+b;
            System.out.println(sum);
            break;
        case "-":
            sum=a-b;
            System.out.println(sum);
        break;
        case "%":
            sum=a%b;
            System.out.println(sum);
            break;
            case "*":
            sum=a*b;
            System.out.println(sum);
            break;
            case "/":
            sum=a/b;
            System.out.println(sum);
            break;
        default:
        System.out.println("invalid symbol");
            break;
    }
   } 
}
