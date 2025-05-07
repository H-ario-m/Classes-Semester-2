import java.util.Stack;

public class reverseList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to reverse the linked list using a stack
 public static Node reverse(Node head){
    Stack<Node> stack = new Stack<>();
    while(head!=null){
        stack.push(head);
        head=head.next;
    }

    Node newHead = stack.pop();
    Node current = newHead;
    while(!stack.isEmpty()){
        current.next = stack.pop();
        current = current.next;
    }
    current.next = null;
    return newHead;
}

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.print("Original list: ");
        printList(head);

        Node reversedHead = reverse(head);

        System.out.print("Reversed list: ");
        printList(reversedHead);
 }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
