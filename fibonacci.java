public class fibonacci {
    public static void main(String[] args){
        int a=0,c,b=1,i;
        System.out.print(a+" "+b);
        for(i=1;i<=10;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}