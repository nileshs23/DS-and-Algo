import java.util.*;

public class InOrderTraversal {

    List<Integer> listOfEle = new LinkedList<>();

    public static void main(String[] args) {

        Node n1 = new Node(10);
        n1.left = new Node(20);
        n1.right = new Node(30);

        n1.left.left = new Node(40);
        n1.left.right = new Node(50);

        n1.right.left = new Node(60);
        n1.right.right = new Node(70);

        // System.out.println(n1);
        List<Integer> res = traversal(n1, new InOrderTraversal().listOfEle);
        System.out.println(res);


    }

    public static List<Integer> traversal(Node root, List<Integer> listOfEle) {

        if (root == null) {
            return null;
        }

        traversal(root.left, listOfEle);
        listOfEle.add(root.data);
        traversal(root.right, listOfEle);

        return listOfEle;
    }

}
