import java.util.Scanner;
import java.util.*;
public class linearseacrh_String {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the name you want to search=== ");
        String n=sc.next();
        int temp=0;
        String[] arr={"deepak","chandan","payal","rohit"};
        for(int i=0;i<arr.length;i++){
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

