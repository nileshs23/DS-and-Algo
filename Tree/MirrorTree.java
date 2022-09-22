public class MirrorTree {
    
    public static void main(String[] args) {
        
        Node root1 = new Node(10);
        root1.left = new Node(5);
        root1.right = new Node(7);

        root1.right.left = new Node(15);


        Node res = mirror(root1);
        System.out.println(res);

    }

    public static Node mirror(Node root) {

        if(root == null) return null;

        swap(root);

        mirror(root.left);
        mirror(root.right);

        return root;        
    }

    public static void swap(Node n1) {
        Node temp = n1.left;
        n1.left = n1.right;
        n1.right = temp;
    }

}
