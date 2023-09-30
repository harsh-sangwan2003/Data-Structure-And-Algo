import java.io.*;
import java.util.*;

public class infix_evaluation {

    public static int precendence(char optor) {

        if (optor == '+')
            return 1;

        if (optor == '-')
            return 1;

        return 2;
    }

    public static int operation(int v1, int v2, char ch) {

        if (ch == '+')
            return v1 + v2;

        else if (ch == '-')
            return v1 - v2;

        else if (ch == '*')
            return v1 * v2;

        return v1 / v2;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        Stack<Integer> opnds = new Stack<>();
        Stack<Character> optors = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            if (ch == '(')
                optors.push(ch);

            else if (Character.isDigit(ch))
                opnds.push(ch - '0');

            else if (ch == ')') {

                while (opnds.peek() != '(') {
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();
                    char optor = optors.pop();

                    opnds.push(operation(v1, v2, optor));
                }

                if(opnds.size()>0)
                opnds.pop();

            }

            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

                while (optors.size() != 0 && optors.peek() != '(' && precendence(ch) <= optors.peek()) {
                    int v2 = opnds.pop();
                    int v1 = opnds.pop();
                    char optor = optors.pop();

                    opnds.push(operation(v1, v2, optor));

                }

                optors.push(ch);
            }
        }

        while (opnds.peek() != 0) {

            int v2 = opnds.pop();
            int v1 = opnds.pop();
            char optor = optors.pop();

            opnds.push(operation(v1, v2, optor));
        }

        System.out.println(opnds.peek());

        br.close();
    }
}