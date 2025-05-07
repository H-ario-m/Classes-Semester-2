import java.util.Stack;
public class ReverseStringStack {
    public static void main(String[] args) {
        String str = "chal hatt nhi bhej raha code";
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        String reverse="";
        while(!stack.isEmpty()) {
           reverse+=stack.pop();

        }

        // StringBuilder reversedStr = new StringBuilder();
        // while (!stack.isEmpty()) {
        //     reversedStr.append(stack.pop());
        // }

        // System.out.println("Reversed String: " + reversedStr.toString());
        
        System.out.println("Reversed String: " + reverse);
    }
}
