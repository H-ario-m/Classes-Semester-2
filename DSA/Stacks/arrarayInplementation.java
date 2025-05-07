public class arrarayInplementation {
 
    private int maxSize;
    private int[] stack;
    private int top;
    public arrarayInplementation(int size){
        this.maxSize=size;
        stack=new int[maxSize];
        top=-1;
    }

    public boolean isFull(){
        return top==maxSize-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
   
    public void Push(int value){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        stack[++top]=value;
    }
    public int Pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }
   
    public int printStack(){


        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
        return 0;
    }

        public static void main(String[] args) {
            arrarayInplementation stack = new arrarayInplementation(5);
            stack.Push(10);
            stack.Push(20);
            stack.Push(30);
            stack.Push(40);
            stack.Push(50);
            stack.Push(60);
            System.out.println("Popped element is " + stack.Pop());
            System.out.println("Top element is " + stack.peek());
            System.out.println("Stack elements are: ");
            stack.printStack();
           
        }

    }
