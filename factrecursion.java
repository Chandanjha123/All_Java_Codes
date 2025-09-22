import java.util.*;
public class factRecursion {
    static int fact=1;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
         factrecursion f= new factrecursion();
         f.factorial(n);
         System.out.println(fact);
    }
    void  factorial(int n)
    {
        if(n>1)
        {
            fact=fact*n;
            factorial(n-1);
        }
    }
}

