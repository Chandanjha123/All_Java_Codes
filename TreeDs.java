import java.util.*;
public class TreeDs {

    class Node<E>{
        E data;
        Node<E> left;
        Node<E> right;


        public Node(E data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public ArrayList<Integer> BFS(Node<Integer> root){
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Node<Integer>> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            Node<Integer> temp = queue.poll();
            ans.add(temp.data);
            if (temp.left != null) queue.offer(temp.left);
            if (temp.right != null) queue.offer(temp.right);
        }
        return ans;

    }
    public static void main(String[] args) {
        
    }
}
