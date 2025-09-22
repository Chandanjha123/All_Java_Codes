import java.util.*;
public class larger {
    public static void main(String[] args){
    int a,b,d;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of a");
    a=sc.nextInt();
    System.out.println("enter the value of b");
    b=sc.nextInt();
    System.out.println("enter the value of d");
    d=sc.nextInt();
    if(a>b&&a>d){
      System.out.println("a is greater "+a); 
    } 
    else if((b>a)&&(b>d)){
        System.out.println("b is greater "+b);
    }
    else{
    System.out.println("d is greater"+d);
    }
    
}
}
