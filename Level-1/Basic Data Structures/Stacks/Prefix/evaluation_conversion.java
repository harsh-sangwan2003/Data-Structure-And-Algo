package Prefix;

import java.io.*;
import java.util.*;

public class evaluation_conversion {

    public static int operation(int val1, int val2, char ch) {

        if (ch == '+')
            return val1 + val2;

        else if (ch == '-')
            return val1 - val2;

        else if (ch == '*')
            return val1 * val2;

        else
            return val1 / val2;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        Stack<String> post = new Stack<>();
        Stack<String> in = new Stack<>();
        Stack<Integer> st = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {

            char ch = exp.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

                int v1 = st.pop();
                int v2 = st.pop();
                int val = operation(v1, v2, ch);
                st.push(val);

                String inv1 = in.pop();
                String inv2 = in.pop();
                String inv = "(" + inv1 + ch + inv2 + ")";
                in.push(inv);

                String postv1 = post.pop();
                String posv2 = post.pop();
                String postv = postv1 + posv2 + ch;
                post.push(postv);
            }

            else {

                st.push(ch - '0');
                post.push(ch + "");
                in.push(ch + "");
            }
        }

        System.out.println(st.pop());
        System.out.println(in.pop());
        System.out.println(post.pop());

    }
}