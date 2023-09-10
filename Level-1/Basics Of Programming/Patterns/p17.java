import java.util.Scanner;

public class p17 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1, nsp = n / 2;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= nsp; csp++) {
                if (r == n / 2 + 1)
                    System.out.print("*" + " ");

                else
                    System.out.print("  ");
            }

            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*" + " ");

            System.out.println();

            if (r <= n / 2) {

                nst++;
            }

            else {

                nst--;
            }
        }

        scn.close();
    }
}
