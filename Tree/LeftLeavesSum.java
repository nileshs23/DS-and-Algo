public class LeftLeavesSum {

    public static void main(String[] args) {

        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(7);

        root.left.left = new Node(6);
        root.left.left.left = new Node(8);

        int res = sumOfLeftLeaves(root);
        System.out.println(res);

    }

    public static int sumOfLeftLeaves(Node root) {
        int total = 0;

        if (root != null) {

            if (checkLeaf(root.left)) {
                total += root.left.data;
            } else {
                total += sumOfLeftLeaves(root.left);
            }

            total += sumOfLeftLeaves(root.right);

        }

        return total;
    }

    public static boolean checkLeaf(Node root) {
        if (root == null)
            return false;

        if (root.left == null && root.right == null)
            return true;
        return false;
    }
}
