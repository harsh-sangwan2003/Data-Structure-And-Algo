import java.util.Scanner;

public class p6 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = n / 2 + 1, nsp = 1;

        for (int r = 1; r <= n; r++) {

            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*" + " ");

            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("  ");

            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*" + " ");

            System.out.println();

            if (r <= n / 2) {

                nsp += 2;
                nst--;
            }

            else {

                nsp -= 2;
                nst++;
            }
        }

        scn.close();
    }
}