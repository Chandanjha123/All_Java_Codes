import java.util.*;
public class myminmax {
    public static void main(String[] args){
        int max=0;
        int min=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("how many number you want to store");
        int num=sc.nextInt();
        System.out.print("enter the " +num+ " integers :");
        int a[]=new int[num];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
         max=a[0];
          for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
          }
          min=a[0];
          for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
          }
          System.out.println("the max number is "+max);
          System.out.print("the minimu number is "+min);
    }
}
