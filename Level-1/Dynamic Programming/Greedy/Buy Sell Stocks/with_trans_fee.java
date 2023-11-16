import java.util.*;

public class with_trans_fee {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int fee = scn.nextInt();

        int obsp = -arr[0], ossp = 0;

        for (int i = 1; i < arr.length; i++) {

            int nbsp = 0, nssp = 0;

            if (ossp - arr[i] > obsp)
                nbsp = ossp - arr[i];

            else
                nbsp = obsp;

            if (obsp + arr[i] - fee > ossp)
                nssp = obsp + arr[i] - fee;

            else
                nssp = ossp;

            obsp = nbsp;
            ossp = nssp;
        }

        scn.close();
    }

}