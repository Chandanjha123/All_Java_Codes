import java.util.*;
public class factorial {
    public static void main(String[] args){
        String input;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("enter a number");
        int num=sc.nextInt();
        int i,fact=1;
        for(i=num;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println(fact);
        System.out.println("do you want to continue(press'y'for yes'n'for no)");
        input=sc.next();
    }while(input.equals("y"));
    }
}
