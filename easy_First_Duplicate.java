import java.util.Scanner;

public class easy_First_Duplicate {
    public static void main(String[] args){
        int temp=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter how many number you want to store");
    int num=sc.nextInt();
    System.out.println("enter the "+num+" integers: ");
    int a[]=new int[num];
    for(int i=0;i<num;i++){
        a[i]=sc.nextInt();
    }
            for(int i=0;i<a.length;i++){
                for(int j=i+1;j<a.length;j++){
                    if(a[i]==a[j]){
                        System.out.println("first duplicate elemnet is "+a[j]);
                        temp=temp+1;
                        break;
                    }
                }
                if(temp>0){
                    break;
                }
            }
        
}
}
