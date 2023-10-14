import java.io.*;
import java.util.*;

public class conversion_evaluation {

    public static int operation(int v1, int v2, char ch) {

        if (ch == '+')
            return v1 + v2;

        else if (ch == '-')
            return v1 - v2;

        else if (ch == '*')
            return v1 * v2;

        else
            return v1 / v2;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        Stack<Integer> val = new Stack<>();
        Stack<String> is = new Stack<>();
        Stack<String> ps = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

                int v2 = val.pop();
                int v1 = val.pop();
                int value = operation(v1, v2, ch);
                val.push(value);

                String iv2 = is.pop();
                String iv1 = is.pop();
                String iv = "(" + iv1 + ch + iv2 + ")";
                is.push(iv);

                String psv2 = ps.pop();
                String psv1 = ps.pop();
                String psv = ch + psv1 + psv2;
                ps.push(psv);
            }

            else {

                val.push(ch - '0');
                is.push(ch + "");
                ps.push(ch + "");
            }
        }

        System.out.println(val.pop());
        System.out.println(is.pop());
        System.out.println(ps.pop());
    }
}