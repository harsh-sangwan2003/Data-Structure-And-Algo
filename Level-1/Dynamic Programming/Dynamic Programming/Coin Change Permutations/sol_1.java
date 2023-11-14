import java.util.*;

public class sol_1 {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] coins = new int[n];

        for (int i = 0; i < n; i++)
            coins[i] = scn.nextInt();

        int tar = scn.nextInt();

        int[] dp = new int[tar + 1];
        dp[0] = 1;

        for (int amt = 1; amt <= tar; amt++) {

            for (int coin : coins) {

                if (coin <= amt) {

                    int ramt = amt - coin;
                    dp[amt] += dp[ramt];
                }
            }
        }

        System.out.println(dp[tar]);

        scn.close();
    }
}