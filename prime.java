import java.util.*;
public class prime {
    static String input;
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number");
            int p=sc.nextInt();
            int m=0;
            for(int i=2;i<=p-1;i++){
                if(p%i==0){
                    m=m+1;
                }
            }
                if(m==0){
                    System.out.println("is a prime number");
                }
                else{
                    System.out.println("not a prime number");
                }
    }
}

    