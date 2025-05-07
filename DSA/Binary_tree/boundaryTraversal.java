class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }

}
public class boundaryTraversal {

    public static void printLeaves(Node root) {
        if (root == null)
            return;

        printLeaves(root.left);

        if (root.left == null && root.right == null)
            System.out.print(root.data + " ");

        printLeaves(root.right);
    }

    public static void boundaryTraversal(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        printLeaves(root.left);
        printLeaves(root.right);
    }
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("\nBoundary traversal of the tree");
        boundaryTraversal(root);
    }
}
