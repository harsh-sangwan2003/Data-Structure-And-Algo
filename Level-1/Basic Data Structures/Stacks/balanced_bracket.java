import java.util.Scanner;
import java.util.Stack;

public class balanced_bracket {

    public static void balancedBracket(String str) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '[' || ch == '{' || ch == '(')
                st.push(ch);

            else if (ch == ']') {

                boolean flag = handleBracket(st, '[');

                if (!flag) {
                    System.out.println(false);
                    return;
                }

            }

            else if (ch == '}') {

                boolean flag = handleBracket(st, '{');

                if (!flag) {
                    System.out.println(false);
                    return;
                }

            }

            else if (ch == ')') {

                boolean flag = handleBracket(st, '(');

                if (!flag) {
                    System.out.println(false);
                    return;
                }

            }
        }

        if (st.size() != 0) {
            System.out.println(false);
            return;
        }

        System.out.println(true);
    }

    public static boolean handleBracket(Stack<Character> st, char ch) {

        if (st.size() == 0)
            return false;

        if (st.peek() != ch)
            return false;

        st.pop();
        return true;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        balancedBracket(str);

        scn.close();
    }
}