public class DLL {
    Node head;
    int c = 0;

    class Node {
        String data;
        Node next;
        Node prev;

        Node(String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // add
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            c++;
            return;
        }
        else{
        newNode.next = head;
        head.prev=newNode;
        head = newNode;
        }
        c++;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        c++;
    }

    public void DeleteFirst() {
        if (head == null) {
            System.out.println("no node is present");
            return;
        }
        head=head.next;
        head.prev=null;
        c--;
    }

    public void DeleteLast() {
        if (head == null) {
            System.out.println("No node is present");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondLast = lastNode;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
        c--;

    }

    public void printlist() {
        if (head == null) {
            System.out.println("No Node ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void printListRev() {
        if (head == null) {
            System.out.println("no node");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.prev;
        }
        System.out.println("Null");
    }


public void Size() {
    System.out.println(c);
}
public static void main(String[] args) {
    DLL list = new DLL();
    list.addFirst("SOLO");
    list.addLast("is");
    list.addLast("the");
    list.addLast("GOAT");
    list.addLast("Akash");
    list.addFirst("Hello world");
    list.printlist();
    list.printListRev();
    list.Size();
}
}
