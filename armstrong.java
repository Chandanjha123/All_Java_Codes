import java.util.*;
public class armstrong {
    public static void main(String[] args){
         String input;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("enter a number");
        int num=sc.nextInt();
        int temp1=num;
        int len=0;
        int rem=0,mul=1,arm=0;
        //for finding the lenght of the given number
        while(temp1!=0){
            len=len+1;
             temp1=temp1/10;
        }
        //reversing to seperate all the digit and than multiply it with it self by applying the for loop 
        int temp2=num;
        while(temp2!=0){
            rem=temp2%10;
            mul=1;
            for(int i=1;i<=len;i++){
              mul=mul*rem;
            }
             arm=arm+mul;
            temp2=temp2/10;
        }
        // to check weather the number is matching or not 
        if(num==arm){
            System.out.println(num +"----"+ "is a armstrong number");
        }
        else{
            System.out.println(num +"----"+ "is not a armstrong number");
        }System.out.println("do ypu want to continue(press 'y'for yes 'n' for no)");
        input=sc.next();
    }while(input.equals("y"));


    }
}
