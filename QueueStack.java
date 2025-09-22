import java.util.Stack;

public class QueueStack {
    static class Queue1 {
        static Stack<Integer> s1 = new Stack<Integer>();
        static Stack<Integer> s2 = new Stack<Integer>();

        public static void add(int x) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(x);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public static int remove() {
            if (s1.isEmpty()) {
                return -1;
            }
            int data=s1.pop();
            return data;
        }

        public static int peek() {
            if (s1.isEmpty()) {
                return -1;
            }
            return s1.peek();
        }

        public static boolean isEmpty() {
            return s1.isEmpty();
        }
    }

    public static void main(String args[]) {
        Queue1 q = new Queue1();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
