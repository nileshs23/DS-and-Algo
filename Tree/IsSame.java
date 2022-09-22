public class IsSame {
    
    public static void main(String[] args) {
        
        Node root1 = new Node(10);
        root1.left = new Node(5);
        root1.right = new Node(7);

        root1.right.left = new Node(15);

        Node root2 = new Node(10);
        root2.left = new Node(5);
        root2.right = new Node(7);

        root2.right.left = new Node(15);

        boolean result = equals(root1, root2);
        System.out.println(result);
    }

    public static boolean equals(Node root1, Node root2) {

        if(root1 == null && root2 == null) return true;

        if(root1==null || root2 == null) return false;


        return (root1.data == root2.data)
                && equals(root1.left, root2.left)
                && equals(root1.right, root2.right);
        
    }

}
