
class Node{
    int data;
    Node left, right;
    Node(int item){
        this.data = item;
        left = right = null;
    }
}
public class sizeOfTree {
    Node root;
   public static int size(Node node){
        if (node == null)
            return 0;
        else
            return(size(node.left) + 1 + size(node.right));
    }
    public static int sum(Node node){
        if (node == null)
            return 0;
        else
            return(sum(node.left) + node.data + sum(node.right));
    }

    public static boolean findvalue(Node node, int value){
        if (node == null)
            return false;
        else if(node.data == value)
            return true;
        else
            return(findvalue(node.left, value) || findvalue(node.right, value));
    }


    public static int height(Node node){
        if (node == null)
            return 0;
        else
            return(1 + Math.max(height(node.left), height(node.right)));
    }
    // public static int height2(Node node){
    //     //without max or min

    // }
    //balanced
    public static boolean balanced(Node node){
        
        if (node == null)
            return true;
        int leftheight = height(node.left);
        int rightheight = height(node.right);
        if (Math.abs(leftheight - rightheight) <= 1 && balanced(node.left) && balanced(node.right))
            return true;
        else
            return false;
    }
    public static int edgeheight(Node node){
        if (node == null)
            return 0;
        else
            return( Math.max(edgeheight(node.left), edgeheight(node.right)));
    } 
    public static int max(Node node){
        if (node == null)
            return Integer.MIN_VALUE;
        else
            return Math.max(node.data, Math.max(max(node.left), max(node.right)));
    }
    public static int min(Node node){
        if (node == null)
            return Integer.MAX_VALUE;
        else
            return Math.min(node.data, Math.min(min(node.left), min(node.right)));
    }
    public static void main(String args[]){
        sizeOfTree tree = new sizeOfTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);
        tree.root.right.left.left = new Node(10);
        tree.root.right.left.right = new Node(11);
        System.out.println("Size of the tree is: " + size(tree.root));
        System.out.println("Sum of the tree is: " + sum(tree.root));
        System.out.println("Height of the tree is: " + height(tree.root));
        System.out.println("Edge height of the tree is: " + edgeheight(tree.root));
        System.out.println("Max of the tree is: " + max(tree.root));
        System.out.println("Min of the tree is: " + min(tree.root));
        int value = 5;
        if (findvalue(tree.root, value))
            System.out.println("Value " + value + " is present in the tree");
        else
            System.out.println("Value " + value + " is not present in the tree");
        
        
}
}
