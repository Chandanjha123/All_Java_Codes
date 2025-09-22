import java.util.*;
public class normal {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number== ");
        int i,j;
        int n=sc.nextInt();
        int c1=0,c2=0;
        int v1=0,v2=0;
       for(i=n;i>=2;i--){
        for(j=1;j<=i-1;j++){
            if(i%j==0){
                c1=c1+1;
            }
            else{
                v1=i;
                break;
            }
        }
           }
           if(c1==0){
            System.out.println("not found");
           }
           else{
            System.out.print(v1);
       }
    }
}
