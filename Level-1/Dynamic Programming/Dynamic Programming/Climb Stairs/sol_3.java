import java.util.*;

public class sol_3 {

    public static int countStairs(int n) {

        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i < dp.length; i++) {

            if (i == 1)
                dp[i] = dp[i - 1];

            else if (i == 2)
                dp[i] = dp[i - 1] + dp[i - 2];

            else
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[dp.length - 1];
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int res = countStairs(n);
        System.out.println(res);

        scn.close();
    }

}