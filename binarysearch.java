import java.util.*;
public class binarysearch{
        public static void main(String[] args){
            int i,num,item,a[],first,last,middle;
            //to capture the user input
            Scanner sc=new Scanner(System.in);
            System.out.print("how many numbers you want to store: ");
            num=sc.nextInt();
            System.out.print("enter"+ num + "integers:");
            a=new int[num];
            for(i=0;i<num;i++)
            {
               a[i]=sc.nextInt();
            }
            System.out.print("enter the number you want to search: ");
            item=sc.nextInt();
            first=0;
            last=num-1;
            middle=(first+last)/2;
            while(first<=last){
                if(a[middle]==item){
                    System.out.print(item+ " is at"+ middle + " position");
                    break;
                }
                else if(a[middle]<item){
                    first=middle+1;
                }
                else{
                    last=middle-1;
                }
                 middle=(first+last)/2;
            }
            if(first>last)
            {
                System.out.println(item+ "is not found");
            }
        }
}

