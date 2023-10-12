import java.util.*;

public class sol_1 {

    public static void printArray(int[] arr) {

        for (int val : arr)
            System.out.print(val + " ");
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);
        int[] nge = new int[n];
        nge[n - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {

            while (st.size() != 0 && arr[i] >= st.peek())
                st.pop();

            if (st.size() == 0)
                nge[i] = -1;

            else
                nge[i] = st.peek();

            st.push(arr[i]);
        }

        printArray(nge);
        scn.close();
    }
}