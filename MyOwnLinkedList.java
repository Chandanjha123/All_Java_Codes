public class MyOwnLinkedList {

    Node head;
    int size = 0;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertionAtFirst(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            return;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void insertionAtPosition(int pos, int val) {
        Node node = new Node(val);

        if (head == null) {
            throw new IllegalStateException("List is empty");

        } else {
            Node temp = head;
            int count = 0;
            Node prev = null;
            while (temp.next != null && count != pos) {
                prev = temp;
                temp = temp.next;
                count++;
            }
            if (temp.next == null) {
                throw new IllegalStateException("Index out of bound");
            } else {
                node.next = prev.next;
                prev.next = node;
            }

        }
        size++;
    }

    public void insertionAtLast(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            return;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        size++;
    }

    public void deleteThisNumber(int val) {
        if (head == null) {
            throw new IllegalStateException("List is empty");

        } else {
            Node temp = head;
            while (temp.next != null && temp.next.data != val) {
                temp = temp.next;
            }
            if (temp.next == null) {
                throw new IllegalStateException("Element not found");
            } else {
                temp.next = temp.next.next;
            }

        }
        size--;
    }

    public void deleteFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");

        } else {
            head = head.next;

        }
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            throw new IllegalStateException("List is empty");

        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        size--;
    }

    public void printMyOwnLinkedList() {
        if (head == null) {
            throw new IllegalStateException("List is empty");

        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }

    public static void main(String[] args) {
        MyOwnLinkedList mol = new MyOwnLinkedList();
        mol.insertionAtFirst(1);
        mol.insertionAtLast(2);
        mol.insertionAtLast(3);
        mol.insertionAtLast(4);
        mol.insertionAtLast(5);
        // mol.deleteFirst();
        // mol.deleteLast();
        // mol.deleteThisNumber(3);
        // mol.deleteThisNumber(5);
        // mol.deleteThisNumber(5);
        mol.insertionAtPosition(1, 8);
        mol.insertionAtPosition(7, 8);
        mol.printMyOwnLinkedList();
    }

}
