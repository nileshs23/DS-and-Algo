public class SymmetricBinaryTree {

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);

        root.left.left = new Node(3);
        root.left.right = new Node(4);

        root.right.left = new Node(4);
        root.right.right = new Node(3);

        // System.out.println(root);

        System.out.println(symmetric(root.left, root.right));
    }

    public static boolean symmetric(Node left, Node right) {

        if (left == null && right == null)
            return true;

        if (left == null || right == null)
            return false;

        return (left.data == right.data)
                && symmetric(left.left, right.right)
                && symmetric(left.right, right.left);

    }
}
