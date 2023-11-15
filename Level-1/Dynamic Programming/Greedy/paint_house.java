import java.util.*;

public class paint_house {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 3; j++) {

                arr[i][j] = scn.nextInt();
            }
        }

        int[][] dp = new int[n][3];
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        for (int i = 1; i < arr.length; i++) {

            dp[i][0] = arr[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = arr[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = arr[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }

        int res = Integer.MAX_VALUE;
        for (int j = 0; j < 3; j++)
            res = Math.min(res, dp[n - 1][j]);

        System.out.println(res);

        scn.close();
    }
}