import java.util.Stack;
/*
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
*/ //1209 leetcode 
class Solution {
    public String removeDuplicates(String s, int k) {
        // Stack stores character and its frequency
        Stack<int[]> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek()[0] == ch) {
                stack.peek()[1]++;
                if (stack.peek()[1] == k) {
                    stack.pop(); // remove k duplicates
                }
            } else {
                stack.push(new int[]{ch, 1});
            }
        }

        // Build result
        StringBuilder sb = new StringBuilder();
        for (int[] pair : stack) {
            char c = (char) pair[0];
            int count = pair[1];
            while (count-- > 0) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}

