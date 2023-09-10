import java.util.Scanner;

public class p15 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1, nsp = n / 2;

        for (int r = 1; r <= n; r++) {

            int cnt = r;

            if (r > n / 2)
                cnt = n - r + 1;

            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("  ");

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(cnt + " ");

                if (cst <= nst / 2)
                    cnt++;

                else
                    cnt--;
            }

            System.out.println();

            if (r <= n / 2) {

                nsp--;
                nst += 2;
            }

            else {

                nsp++;
                nst -= 2;
            }
        }

        scn.close();
    }
}
