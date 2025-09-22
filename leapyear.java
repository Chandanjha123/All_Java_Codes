import java.util.*;
public class leapyear {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the year");
        int year=sc.nextInt();
       if((year%400==0)||(year%4==0 && year%100!=0)){
            System.out.println("the given year is a leap year ");
    }
        else{
            System.out.println("the given year is not a leap year");
        }
    }
}
