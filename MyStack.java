import java.util.Scanner;
public class MyStack {

    int arrayStack[];
    int top;
    int size;

    public MyStack(int size){
        this.size = size;
        arrayStack = new int[size];
        top=-1;
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
    
    public boolean isFull(){
        return(top==size-1);
    }
    public void push(int data){
        if(isFull()){
            System.out.println("Stack Overflow");
        }else{
            arrayStack[++top] = data;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }else{
            return(arrayStack[top--]);
        }
    }
    
    public int peek(){
        if(!isEmpty())
            return(arrayStack[top]);
        else
            return 0;
    }
    public int size(){
        return size;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of stack: ");
        int size=sc.nextInt();
        MyStack ms= new MyStack(size);
        int i=0;
         do{
            System.out.println("Do you want to add  element? Y/N :");
            char choice=sc.next().charAt(0);
            if(choice=='n'||choice=='N'){
                break;
            }
            System.out.print("Enter the element you want to insert : ");
            int element=sc.nextInt();   
            ms.push(element);
            i++;
         }
         while(i<size);
      

       System.out.println("Your Deleted Element "+ ms.pop());
       System.out.println("Your Top Element "+ ms.peek());
        
        System.out.println("Your Stack Size "+ms.size());
        System.out.println("Your Deleted Element "+ ms.pop());
        sc.close();
             
    }
}