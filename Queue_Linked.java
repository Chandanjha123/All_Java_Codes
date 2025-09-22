public class Queue_Linked {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    static class Queue1 {
      static Node head=null;
      static Node tail=null;

    public static boolean isEmpty(){
       return head==null && tail==null;
    }

    public static void Enqueue(int data){
       Node  newNode = new Node(data);
       if(isEmpty()){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

        public int Dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result=head.data;
            head = head.next;
            return result;
        }

        public static int peek() {
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue1 ql = new Queue1();
        ql.Enqueue(20);
        ql.Enqueue(30);
        ql.Enqueue(40);
        ql.Enqueue(50);
        ql.Enqueue(60);
        ql.Dequeue();
        System.out.println(ql.peek());

    }
}
