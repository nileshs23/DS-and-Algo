public class Tree {
    public static void main(String[] args) {
            Node n1 = new Node(10);
            n1.left = new Node(20);
            n1.right = new Node(30);

            n1.left.left = new Node(40);
            n1.left.right = new Node(50);

            n1.right.left = new Node(60);
            n1.right.right = new Node(70);

            System.out.println(n1);
    }

}