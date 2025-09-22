import java.util.Scanner;
import java.util.*;
public class linear {
    public static void main(String[] args){
        int temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter how many name you want to enter ");
        int num=sc.nextInt();
        System.out.println("great! enter the name");
        String[] arr=new String[num];
        for(int j=0;j<num;j++){
            arr[j]=sc.next();
        }
         System.out.print("enter the name you want to search=== ");
        String n=sc.next();
        for(int i=0;i<num;i++){
            if(arr[i].equalsIgnoreCase(n)){
                System.out.println("elemeant is present at"+"    "+i+"  "+"index position");
                temp=temp+1;
            }
        }
        if (temp==0) {
            System.out.println("element not found");
        }

    }
}
