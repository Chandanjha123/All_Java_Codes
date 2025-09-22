public class fibonacci_Recursion {
    static int a=0,b=1,c;
    public static void main(String[] args){
        System.out.print(a+" "+b);
        fibonacci_recursion ob=new fibonacci_recursion();
         ob.fibonacci(10);
    }
          void fibonacci(int i)
          {
               if(i>=1)
               {
                c=a+b;
                System.out.print(" "+c);    
                a=b;
                b=c;
                fibonacci(i-1);
               }

          }
}
