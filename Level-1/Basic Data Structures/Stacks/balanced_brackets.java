import java.util.*;

public class balanced_brackets {

    public static boolean handleClosing(Stack<Character> st, char ch) {

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

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            boolean flag = true;

            if (ch == '(' || ch == '{' || ch == '[')
                st.push(ch);

            else if (ch == ')') {

                flag = handleClosing(st, '(');

                if (!flag) {

                    System.out.println(false);
                    System.exit(0);
                }
            }

            else if (ch == '}') {

                flag = handleClosing(st, '{');

                if (!flag) {

                    System.out.println(false);
                    System.exit(0);
                }
            }

            else if (ch == ']') {

                flag = handleClosing(st, '[');

                if (!flag) {

                    System.out.println(false);
                    System.exit(0);
                }
            }

        }

        if (st.size() != 0)
            System.out.println(false);

        else
            System.out.println(true);

        scn.close();
    }
}
