import java.util.*;

public class stack3 {

    public static String removeDuplicates(String s, int k) {
        Stack<int[]> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek()[0] == ch) {
                stack.peek()[1]++;
                if (stack.peek()[1] == k) {
                    stack.pop(); // remove k adjacent duplicates
                }
            } else {
                stack.push(new int[]{ch, 1});
            }
        }

        // Build final string
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String s = sc.next();
        int k = sc.nextInt();

        // Output
        System.out.println(removeDuplicates(s, k));

        sc.close();
    }
}
