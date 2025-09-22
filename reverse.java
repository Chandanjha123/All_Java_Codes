import java.util.*;
public class reverse {
    static String input;
    public static void main(String[] args){
        do{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
        int i=sc.nextInt();
    int m,s=0;
    while(i!=0)
    {
     m=i%10;
     s=s*10+m;
     i=i/10;
    }
    System.out.println(s);
     System.out.println("do you want to continue(press 'y' for yes 'n' for no)");
    input=sc.next();
    }while(input.equals("y"));
   
}
}

