import java.util.*;

public class sol_1 {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int tar = scn.nextInt();

        boolean[][] dp = new boolean[n + 1][tar + 1];
        for (int i = 0; i < dp.length; i++) {

            for (int j = 0; j < dp[0].length; j++) {

                if (j == 0)
                    dp[i][j] = true;

                else if (i == 0)
                    dp[i][j] = false;

                else {

                    if (dp[i - 1][j])
                        dp[i][j] = true;

                    else {

                        int val = arr[i - 1];
                        if (j >= val)
                            dp[i][j] = dp[i - 1][j - val];
                    }
                }

            }
        }

        System.out.println(dp[arr.length][tar]);
        scn.close();
    }
}