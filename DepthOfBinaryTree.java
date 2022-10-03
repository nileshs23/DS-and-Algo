public class DepthOfBinaryTree {

    public static void main(String[] args) {

        Node n1 = new Node(10);
        n1.left = new Node(20);
        n1.right = new Node(30);

        n1.left.left = new Node(40);
        n1.left.right = new Node(50);

        n1.right.left = new Node(60);
        n1.right.right = new Node(70);

        int res = maxDepth(n1);
        System.out.println(res);

    }

    public static int maxDepth(Node root) {

        if (root == null)
            return 0;

        if (root.left == null && root.right == null) {
            return 1;
        } else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }

    }

}