import java.util.Scanner;
import java.util.Stack;

public class duplicate_brackets {

    public static void scanDuplicate(String str) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ')') {

                if (st.peek() == '(') {

                    System.out.println(true);
                    return;
                }

                else {

                    while (st.peek() != '(')
                        st.pop();

                    st.pop();
                }
            }

            else
                st.push(ch);
        }

        System.out.println(false);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        scanDuplicate(str);

        scn.close();
    }

}
