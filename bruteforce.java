import java.util.*;
public class bruteforce {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many number you want to store");
        int num=sc.nextInt();
        System.out.println("enter the "+num+" integer");
        int []a=new int[num];
        for(int i=0;i<num;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]&& i!=j){
                    System.out.println("duplicate number is "+a[j]);
                }
            }
        }
    }
}
