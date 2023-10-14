import java.io.*;
import java.util.*;

public class conversion {

    public static int operation(int val1, int val2, char ch) {

        if (ch == '+')
            return val1 + val2;

        else if (ch == '-')
            return val2 - val1;

        else if (ch == '*')
            return val1 * val2;

        else
            return val2 / val1;
    }

    public static int precedence(char ch) {

        if (ch == '+' || ch == '-')
            return 1;

        else
            return 2;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            if (ch == '(')
                ops.push(ch);

            else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                pre.push(ch + "");
                post.push(ch + "");
            }

            else if (ch == ')') {

                while (ops.size() != 0 && ops.peek() != '(') {

                    char op = ops.pop();

                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    String postv = postv2 + postv1 + op;
                    post.push(postv);

                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    String prev = op + prev1 + prev2;
                    post.push(prev);

                }

                ops.pop();
            }

            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

                while (ops.size() != 0 && ops.peek() != '(' && precedence(ch) <= precedence(ops.peek())) {

                    char op = ops.pop();

                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    String postv = postv2 + postv1 + op;
                    post.push(postv);

                    String prev2 = pre.pop();
                    String prev1 = pre.pop();
                    String prev = op + prev1 + prev2;
                    post.push(prev);

                }

                ops.push(ch);
            }
        }

        while (ops.size() != 0) {

            char op = ops.pop();

            String postv2 = post.pop();
            String postv1 = post.pop();
            String postv = postv2 + postv1 + op;
            post.push(postv);

            String prev2 = pre.pop();
            String prev1 = pre.pop();
            String prev = op + prev1 + prev2;
            post.push(prev);
        }

        System.out.println(post.pop());
        System.out.println(pre.pop());
    }
}