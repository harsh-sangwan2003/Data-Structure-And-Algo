import java.util.*;

public class sol_1 {

    public static int minMoves(int n, int[] arr) {

        Integer[] dp = new Integer[n + 1];
        dp[n] = 0;

        for (int i = n - 1; i >= 0; i--) {

            if (arr[i] != 0) {

                int min = Integer.MAX_VALUE;

                for (int j = 0; j <= arr[i] && i + j < dp.length; j++) {

                    if (dp[i + j] != null)
                        min = Math.min(min, dp[i + j]);
                }

                if (min != Integer.MAX_VALUE)
                    dp[i + j] = min + 1;
            }
        }

        return dp[0];
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int res = minMoves(n, arr);
        System.out.println(res);

        scn.close();
    }

}