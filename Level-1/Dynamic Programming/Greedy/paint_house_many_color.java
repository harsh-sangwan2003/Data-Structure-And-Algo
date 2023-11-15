import java.util.*;

public class paint_house_many_color {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int c = scn.nextInt();

        int[][] arr = new int[n][c];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < c; j++) {

                arr[i][j] = scn.nextInt();
            }
        }

        int[][] dp = new int[arr.length][arr[0].length];
        int least = Integer.MAX_VALUE, sleast = Integer.MAX_VALUE;

        for (int j = 0; j < arr[0].length; j++) {
            dp[0][j] = arr[0][j];

            if (arr[0][j] < least) {
                sleast = least;
                least = arr[0][j];
            }

            else if (arr[0][j] < sleast)
                sleast = arr[0][j];
        }

        for (int i = 0; i < n; i++) {

            int nleast = Integer.MAX_VALUE;
            int nsleast = Integer.MIN_VALUE;

            for (int j = 0; j < c; j++) {

                if (least == dp[i - 1][j])
                    dp[i][j] = sleast + arr[i][j];

                else
                    dp[i][j] = least + arr[i][j];

                if (dp[0][j] < nleast) {
                    nsleast = nleast;
                    nleast = arr[0][j];
                }

                else if (dp[0][j] < nsleast)
                    nsleast = arr[0][j];
            }

            least = nleast;
            sleast = nsleast;

        }

        System.out.println(least);
        scn.close();
    }
}