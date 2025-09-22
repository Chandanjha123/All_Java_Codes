import java.util.*;
public class greater {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of element you want to store");
        n=sc.nextInt();
        int temp=0;
         int a[]=new int[55
        ];
         System.out.println("enter the number");
         for(int m=0;m<n;m++)
         {
            a[n]=sc.nextInt();
         }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
              temp=a[j+1];
              a[j+1]=a[j];
              a[j]=temp;
            }
            System.out.println();
        }
         sc.close();
    for(int i=0;i<a.length;i++)
    {
        System.out.println("the sorted array is"+i);
    }
}
    
}
