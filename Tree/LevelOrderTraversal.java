import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
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
            System.out.println(li);

        }

    }

}

/*
 * For OJ or LeetCote Try This
 * 
 * 
 * 
 * class TreeNode{
 * int data;
 * TreeNode left;
 * TreeNode right;
 * 
 * TreeNode(int data){
 * this.data = data;
 * this.left = null;
 * this.right = null;
 * }
 * }
 * class Solution {
 * 
 * List<List<Integer>> list2 = new ArrayList<>();
 * 
 * public List<List<Integer>> levelorderTraversal(TreeNode root){
 * //write your code here.
 * 
 * Queue<TreeNode> q = new ArrayDeque<>();
 * 
 * q.add(root);
 * 
 * while(q.isEmpty() != true){
 * List<Integer> li = new ArrayList<>();
 * int len = q.size();
 * 
 * for(int i=0;i<len;i++){
 * TreeNode temp = q.poll();
 * li.add(temp.data);
 * 
 * if (temp.left != null) {
 * q.add(temp.left);
 * }
 * 
 * if (temp.right != null) {
 * q.add(temp.right);
 * }
 * }
 * 
 * list2.add(li);
 * 
 * 
 * }
 * 
 * return list2;
 * }
 * }
 */