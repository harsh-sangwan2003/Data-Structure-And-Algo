import java.util.*;

public class with_cool_down {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int obsp = -arr[0], ossp = 0, ocsp = 0;

        for (int i = 1; i < arr.length; i++) {

            int nbsp = 0, nssp = 0, ncsp = 0;

            if (ocsp - arr[i] > obsp)
                nbsp = ocsp - arr[i];

            else
                nbsp = obsp;

            if (obsp + arr[i] > ossp)
                nssp = obsp + arr[i];

            else
                nssp = ossp;

            if (ossp > ocsp)
                ncsp = ossp;

            else
                ncsp = ocsp;

            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }

        System.out.println(ocsp);
        scn.close();
    }

}