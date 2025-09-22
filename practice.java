import java.util.*;
public class practice {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner (System.in);
       System.out.print("enter a number= ");
       int num=sc.nextInt();
       int a =num,c=0,sum=0,m=0;
       int deb=num;
       while(num!=0){
       num=num/10;
       c++;
       }
       while(a!=0){
       m=a%10;
       sum+=Math.pow(m, c);
       a=a/10;
       }
       if(deb==sum){
        System.out.print(+deb+" is a armstrong number");
       }
       else{
         System.out.print(+deb+" is not a armstrong number");
       }

    }
}
