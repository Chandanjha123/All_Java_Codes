import java.util.*;

public class minmax {
    public static void main(String[] args){
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.print("how many number you want to store");
        int num=sc.nextInt();
        System.out.print("enter the " +num+ " integers :");
        int a[]=new int[num];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int k=0;k<a.length;k++){
            for(int j=0;j<a.length-1;j++){
                if(a[j+1]<a[j]){
                      temp=a[j];
                      a[j]=a[j+1];
                      a[j+1]=temp;
                }
            }
        }
       System.out.println("The minimum number in the given array is "+a[0]);
       System.out.println("the maximum number in the given array is "+a[a.length-1]);
             
    }
}

