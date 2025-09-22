import java.util.Scanner;
public class Kth_largestAndSmallest {
    public static void main(String[] args){
        int temp=0;
        int n=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter how many number you want to store");
    int num=sc.nextInt();
    System.out.println("enter the "+num+" integers: ");
    int a[]=new int[num];
    for(int i=0;i<num;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("enter the kth largest number you want to find");
    int k=sc.nextInt();
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length-1;j++){
                 if(a[j+1]<a[j]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                 }
        }
        if(i==k-1){
            System.out.println("the kth largest number is"+a[i]);
        }
    }
    for(int i=0;i<num;i++){
        System.out.print(a[i]+" ");
    }
    }

}
