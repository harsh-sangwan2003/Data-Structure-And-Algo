import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class largest_histogram {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // code
        Stack<Integer> st = new Stack<>();

        int[] rb = new int[arr.length];
        rb[arr.length - 1] = arr.length;
        st.push(arr.length - 1);

        for (int i = arr.length - 2; i >= 0; i--) {

            while (st.size() != 0 && arr[i] < arr[st.peek()])
                st.pop();

            if (st.size() == 0)
                rb[i] = arr.length;

            else
                rb[i] = st.peek();

            st.push(i);
        }

        int[] lb = new int[arr.length];
        lb[0] = -1;
        st = new Stack<>();
        st.push(0);

        for (int i = 1; i < arr.length; i++) {

            while (st.size() != 0 && arr[i] < arr[st.peek()])
                st.pop();

            if (st.size() == 0)
                lb[i] = -1;

            else
                lb[i] = st.peek();

            st.push(i);
        }

        int max_area = 0;
        for (int i = 0; i < arr.length; i++) {

            int width = rb[i] - lb[i] - 1;
            int area = width * arr[i];

            max_area = Math.max(max_area, area);
        }

        System.out.println(max_area);
    }
}