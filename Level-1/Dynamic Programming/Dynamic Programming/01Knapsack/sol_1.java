import java.util.*;

public class sol_1 {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] vals = new int[n];
        int[] wts = new int[n];

        for (int i = 0; i < n; i++)
            vals[i] = scn.nextInt();

        for (int i = 0; i < n; i++)
            wts[i] = scn.nextInt();

        int cap = scn.nextInt();

        int[][] dp = new int[n + 1][cap + 1];
        for (int i = 1; i < dp.length; i++) {

            for (int j = 1; j < dp[0].length; j++) {

                if (j >= wts[i - 1]) {

                    int rcap = dp[i - 1][j - wts[i - 1]];

                    if (rcap + vals[i - 1] > dp[i - 1][j])
                        dp[i][j] = rcap + vals[i - 1];

                    else
                        dp[i][j] = dp[i - 1][j];
                } else {

                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        scn.close();
    }
}