public class Queue_Array {
    static class queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1; 

        queue(int n){
            arr=new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1 && front ==-1 ;
        }

        public static boolean isFull(){
            return (rear+1)% size == front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("No Space In Queue");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear= (rear+1)%size ;
            arr[rear]=data;
        }

        public static int Remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
            }
            int result=arr[front];
            if(rear == front){
                rear = front =-1;
            }
            else{
               front = (front+1)%size;
            }
            return result;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
            }
            return arr[front];
        }
    }

    public static void main(String[] args){
        queue qa = new queue(6);
        qa.add(60);
        qa.add(70);
        qa.add(80);
        qa.add(90);
        qa.add(30);
        System.out.println(qa.peek());
        System.out.println(qa.Remove());
        System.out.println(qa.peek());

    }
}
