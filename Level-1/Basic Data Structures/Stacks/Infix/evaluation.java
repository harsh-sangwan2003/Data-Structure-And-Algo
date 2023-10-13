import java.io.*;
import java.util.*;

public class evaluation {

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
        Stack<Integer> oprnds = new Stack<>();
        Stack<Character> optors = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            if (ch == '(')
                optors.push(ch);

            else if (Character.isDigit(ch))
                oprnds.push(ch - '0');

            else if (ch == ')') {

                while (optors.size() != 0 && optors.peek() != '(') {

                    char optor = optors.pop();
                    int val2 = oprnds.pop();
                    int val1 = oprnds.pop();

                    int res = operation(val1, val2, optor);
                    oprnds.push(res);
                }
            }

            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

                while (optors.size() != 0 && optors.peek() != '(' && precedence(ch) >= precedence(optors.peek())) {

                    char optor = optors.pop();
                    int val2 = oprnds.pop();
                    int val1 = oprnds.pop();

                    int res = operation(val1, val2, optor);
                    oprnds.push(res);
                }

                optors.push(ch);
            }
        }

        while (optors.size() != 0) {

            char optor = optors.pop();
            int val2 = oprnds.pop();
            int val1 = oprnds.pop();

            int res = operation(val1, val2, optor);
            oprnds.push(res);
        }

        System.out.println(oprnds.pop());
    }
}