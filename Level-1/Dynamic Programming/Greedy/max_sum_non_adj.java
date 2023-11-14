import java.util.*;

public class max_sum_non_adj {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = scn.nextInt();
        }

        int inc = arr[0], exc = 0;

        for (int i = 1; i < arr.length; i++) {

            int newinc = exc + arr[i];
            int newexc = Math.max(inc, exc);

            inc = newinc;
            exc = newexc;
        }

        System.out.println(Math.max(inc, exc));

        scn.close();
    }
}