import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                int result = applyOperation(a, b, token);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.pop();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private int applyOperation(int a, int b, String op) {
        switch(op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b; // Integer division
            default: throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] tokens = {"2","1","+","3","*"}; // Example
        System.out.println(sol.evalRPN(tokens)); // Output: 9
    }
}
