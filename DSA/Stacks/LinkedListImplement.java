class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedListImplement {
    Node head;
  public int size=0;
    LinkedListImplement() {
        head = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void Push(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int Pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }

    public void printStack() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListImplement stack = new LinkedListImplement();
        stack.Push(10);
        stack.Push(20);
        stack.Push(30);
        stack.Push(40);
        stack.Push(50);
        stack.printStack();
        System.out.println(stack.size);
        System.out.println("Popped element is " + stack.Pop());
        System.out.println("Top element is " + stack.peek());
        System.out.println("Stack elements are: ");
        System.out.println(stack.size);
        stack.printStack();
    }
}
