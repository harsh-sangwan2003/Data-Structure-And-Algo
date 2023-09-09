import java.util.Scanner;

public class p4 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = n, nsp = 0;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("  ");

            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*" + " ");

            System.out.println();

            nsp++;
            nst--;
        }

        scn.close();
    }
}