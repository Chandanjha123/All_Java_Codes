import java.util.*;
public class Second_Largest_and_Smallest {
    public static void main(String[] args){
        int max=0;
        int second_max=0;
        int min=0;
        int second_min=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter hopw many numbers you want to store");
        int num=sc.nextInt();
        System.out.println("enter the "+num+" integers: ");
        int[] a=new int[num];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
         max=Integer.MIN_VALUE;
        second_max=Integer.MIN_VALUE;
         for(int i=0;i<a.length;i++){
            if(a[i]>max ){
               
                second_max=max;
                max=a[i];
                }
                else if(a[i]>second_max && a[i] != max){
                    second_max=a[i];
                }
         }
         System.out.println("The second largest number in the given Array is== "+second_max);
         min=Integer.MAX_VALUE;
         second_min=Integer.MAX_VALUE;
         for(int i=0;i<a.length;i++){
                  if(a[i]<min){
                    second_min=min;
                    min=a[i];
                  }
                  else if(a[i]<second_min && a[i]!=min){
                        second_min=a[i];
                  }
         }
         System.out.println("the second minimum number in the given Array is== "+second_min);

         sc.close();

    }
}
