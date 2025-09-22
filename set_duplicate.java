import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class set_duplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many number you want to store");
        int num=sc.nextInt();
        System.out.println("enter the "+num+" integer");
        int []a=new int[num];
        for(int i=0;i<num;i++){
            a[i]=sc.nextInt();
        }
        Set<Integer> s=new HashSet<>();
        for(int no:a){
            if(s.add(no)==false){
                System.err.println("the duplicate number is "+no);
            }
        }
}
}
