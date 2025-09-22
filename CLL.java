public class CLL {
    Node tail;
    Node head;
    int c=0;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    //add
    public void circularList(){
        head=tail=null;
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head == null){
             head=tail= newNode;
             tail.next=head;
             c++;
             return;
        }
         newNode.next=head;
         head=newNode; 
         tail.next=newNode;
         c++;        
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head == null){
            head=tail=newNode;
            tail.next=head;
            return;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        tail=newNode;
        tail.next=head;
        c++;
    }
    public void DeleteFirst(){
        if(head==null){
            System.out.println("no node is present");
            return;
        }
        head=head.next;
        tail.next=head;
        c--;
    }
    public void DeleteLast(){
        if(head==null){
            System.out.println("No node is present");
            return;
        }
        if(head.next==head){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=head){
               secondLast=lastNode;
               lastNode=lastNode.next;
        }
        tail=secondLast;
        tail.next=head;
        c--;

    }
    public void printlist(){
        if (head==null){
           System.out.println("No Node ");
            return;
        }
        System.out.print(head.data+"-->");
        Node temp=head.next;
        while(temp!=head){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public void Size(){
        System.out.println(c);
    }

    public static void main(String[] args){
             CLL list=new CLL();
             list.addFirst("SOLO");
             list.addLast("is");
             list.addLast("the");
             list.addLast("GOAT");
             list.addLast("Akash");
             list.addFirst("hello");
             list.DeleteFirst();
             list.DeleteLast();
             list.Size();
             list.printlist();
    }
}
