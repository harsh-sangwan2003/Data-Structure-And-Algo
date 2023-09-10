import java.util.Scanner;

public class p13 {

    public static int factoriral(int n) {

        int res = 1;

        for (int i = 1; i <= n; i++)
            res *= i;

        return res;
    }

    public static int nCr(int n, int r) {

        int ans = factoriral(n) / (factoriral(r) * factoriral(n - r));

        return ans;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1, cnt = 0;
        ;

        for (int r = 0; r < n; r++) {

            for (int cst = 0; cst < nst; cst++) {

                System.out.print(nCr(cnt, cst) + " ");
            }

            System.out.println();

            nst++;
            cnt++;
        }

        scn.close();
    }
}
