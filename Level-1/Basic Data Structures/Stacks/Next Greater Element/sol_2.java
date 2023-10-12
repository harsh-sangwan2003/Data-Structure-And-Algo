import java.util.*;

public class sol_2 {

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
        st.push(0);
        int[] nge = new int[n];
        

        for (int i = arr.length - 2; i >= 0; i--) {

            while (st.size() != 0 && arr[i] >= arr[st.peek()]){

                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }

            st.push(i);
        }

        while(st.size()!=0){

            nge[st.peek()] = -1;
            st.pop();
        }

        printArray(nge);
        scn.close();
    }
}