import java.util.Scanner;
import java.util.HashSet;
public class HashSet_firstDuplicate {
     public static void main(String[] args){
        int temp=-1;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter how many number you want to store");
    int num=sc.nextInt();
    System.out.println("enter the "+num+" integers: ");
    int a[]=new int[num];
    for(int i=0;i<num;i++){
        a[i]=sc.nextInt();
    }
    HashSet<Integer> hs=new HashSet<>();
    for(int i=a.length-1;i>=0;i--){
        if(hs.contains(a[i])){
            temp=i;
        }
        else{
            hs.add(a[i]);
        }
    }
    if(temp!=-1){
        System.out.println("First duplicate element is "+a[temp]);
    }
}
}
