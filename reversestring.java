import java.util.*;
public class reversestring {
    static String input;
    public static void main(String[] args){
        do{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
        String i=sc.next();
        String rev=" ";
        int l=i.length();
        
    sc.close();
        for(int j=l-1;j>=0;j--)
        {
            rev=rev+i.charAt(j);
        }
        System.out.println(rev);
         System.out.println("do you want to continue(press 'y' for yes 'n' for no)");
         input=sc.next();
    }while(input.equals("y"));
   
}
}


