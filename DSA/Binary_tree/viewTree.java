import java.util.LinkedList;
import java.util.Queue;
class Node {
    int data;
    Node left, right;
    Node(int item){
        this.data = item;
        left = right = null;
    }
}
public class viewTree {
    // public static void leftview(Node root) {
    //     if (root == null)
    //         return;
    //     System.out.print(root.data + " ");
    //     leftview(root.left);
    // }

    // public static void rightview(Node root) {
    //     if (root == null)
    //         return;
    //     System.out.print(root.data + " ");
    //     rightview(root.right);
    // }
    //using BFS
    public static void leftviewBFS(Node root) {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                Node node = queue.poll();
                if (i == 0) {
                    System.out.print(node.data + " ");
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
    }

    public static void rightviewBFS(Node root) {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                Node node = queue.poll();
                if (i == n - 1) {
                    System.out.print(node.data + " ");
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
    }

    //using BFS arrayList
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);


        System.out.println("\nLeft view of the tree using BFS:");
        leftviewBFS(root);
        System.out.println("\nRight view of the tree using BFS:");
        rightviewBFS(root);
    }
}
