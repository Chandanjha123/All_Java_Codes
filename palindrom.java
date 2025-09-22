import java.util.*;
public class palindrom {
    public static void main(String[] args)
    {
        int a,b=0,m;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int temp=num;
        while(temp!=0){
        a=temp%10;
        b=b*10+a;
        temp=temp/10;
    }
        if(b==num){
            System.out.println(num+" is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
    }
}

