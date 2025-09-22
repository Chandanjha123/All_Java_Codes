import java.util.*;
public class dublicate {
    public static void main(String[] args){
        int temp=0;
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many numbers you want to store");
        int n=sc.nextInt();
        System.out.println("enter the "+n+" integers ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                       if(a[j+1]<a[j]){
                        temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                       }
                       if(a[i]==a[j+1]){
                        c++;
                       }
            }
            System.out.println(a[i]+" has "+c+" duplicates number ");
        }
        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

