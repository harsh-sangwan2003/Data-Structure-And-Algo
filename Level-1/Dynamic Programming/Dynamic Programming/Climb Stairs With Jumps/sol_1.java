import java.util.*;

public class sol_1 {

    public static int countStairs(int n, int[] arr) {

        int[] dp = new int[n + 1];
        dp[n] = 1;

        for (int i = n - 1; i >= 0; i--) {

            for (int j = 1; j < arr[i] && i + j < dp.length; j++) {

                dp[i] += dp[i + j];
            }
        }

        return dp[0];
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {

            arr[i] = scn.nextInt();
        }

        int res = countStairs(n, arr);
        System.out.println(res);

        scn.close();
    }

}