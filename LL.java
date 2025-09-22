public class LL {
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
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head == null){
             head = newNode;
             c++;
             return;
        }
         newNode.next=head;
         head=newNode; 
         c++;        
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        c++;
    }
    public void DeleteFirst(){
        if(head==null){
            System.out.println("no node is present");
            return;
        }
        head=head.next;
        c--;
    }
    public void DeleteLast(){
        if(head==null){
            System.out.println("No node is present");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
               secondLast=lastNode;
               lastNode=lastNode.next;
        }
        secondLast.next=null;
        c--;

    }
    public void printlist(){
        if (head==null){
           System.out.println("No Node ");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public void Size(){
        System.out.println(c);
    }

    public static void main(String[] args){
             LL list=new LL();
             list.addFirst("SOLO");
             list.addLast("is");
             list.addLast("the");
             list.addLast("GOAT");
             list.addLast("Akash");
             list.printlist();
             list.Size();
             list.Size();
             list.DeleteLast();
             list.printlist();
             list.Size();
    }
}
