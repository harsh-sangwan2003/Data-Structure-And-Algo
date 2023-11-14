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

        int[] dp = new int[cap + 1];
        dp[0] = 0;

        for (int c = 1; c <= cap; c++) {

            int max = 0;
            for (int i = 0; i < vals.length; i++) {

                if (wts[i] <= c) {

                    int rbagc = c - wts[i];
                    int rbagv = dp[rbagc];
                    int tbagv = rbagv + vals[i];

                    if (tbagv > max)
                        max = tbagv;
                }
            }

            dp[c] = max;
        }

        System.out.println(dp[cap]);
        
        scn.close();
    }
}