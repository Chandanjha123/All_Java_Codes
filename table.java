import java.util.*;
public class table {
    public static void main(String[] args){
        String input;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("enter a number");
        int no=sc.nextInt();
             for(int i=1;i<=10;i++)
        {
            System.out.println(no+"*"+i+"="+no*i);
        }
        System.out.println("do you want to continue type ('y' for Yes 'n' for NO)");
        input=sc.next();
        }
         while (input.equals("y"));
    }
}
