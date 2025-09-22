import java.util.Scanner;
public class BitManipulation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=sc.nextInt();
        //for finding even or odd
        if((x & 1) == 1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }

}
