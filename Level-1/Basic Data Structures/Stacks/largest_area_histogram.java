import java.io.*;
import java.util.*;

public class largest_area_histogram {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        // code
        Stack<Integer> st = new Stack<>();
        int[] lw = new int[a.length];
        lw[0] = -1;
        st.push(0);

        for (int i = 1; i < a.length; i++) {

            while (st.size() != 0 && a[i] <= a[st.peek()])
                st.pop();

            if (st.size() == 0)
                lw[i] = -1;

            else
                lw[i] = st.peek();

            st.push(i);
        }

        st = new Stack<>();
        int[] rw = new int[a.length];
        rw[rw.length - 1] = a.length;
        st.push(a.length - 1);

        for (int i = a.length - 2; i >= 0; i--) {

            while (st.size() != 0 && a[i] <= a[st.peek()])
                st.pop();

            if (st.size() == 0)
                rw[i] = a.length;

            else
                rw[i] = st.peek();

            st.push(i);
        }

        int max_area = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {

            int width = rw[i] - lw[i] - 1;
            int area = width * a[i];

            max_area = Math.max(max_area, area);
        }

        System.out.println(max_area);
    }
}