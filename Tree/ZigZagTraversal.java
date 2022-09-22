import java.util.*;


public class ZigZagTraversal {
    public static void main(String[] args) {

        Node n1 = new Node(2);

        n1.left = new Node(5);
        n1.right = new Node(8);

        n1.left.left = new Node(12);
        n1.left.right = new Node(7);

        n1.right.left = new Node(40);
        n1.right.right = new Node(50);

        n1.left.left.left = new Node(3);

        // System.out.println(n1);
        traversal(n1);
    }

    public static void traversal(Node root) {

        Queue<Node> q = new ArrayDeque<>();

        q.add(root);
        int level = 0;

        while (q.isEmpty() != true) {
            List<Integer> li = new LinkedList<Integer>();
            int len = q.size();

            for (int i = 0; i < len; i++) {

                Node temp = q.poll();
                li.add(temp.data);

                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            if(level % 2 != 0) {
                Collections.reverse(li);
            }
            System.out.println(li);
            ++level ;

        }

    }

}