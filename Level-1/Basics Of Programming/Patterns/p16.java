import java.util.Scanner;

public class p16 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1, nsp = 2 * n - 3;

        for (int r = 1; r <= n; r++) {

            int count = 1;

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(count + " ");
                count++;
            }

            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("  ");

            if (r == n)
                System.out.print(count + " ");

            count--;
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(count + " ");
                count--;
            }

            System.out.println();

            if (r < n - 1) {

                nst++;
                nsp -= 2;
            }

            else if (r == n - 1) {

                nsp -= 2;
            }
        }

        scn.close();
    }
}
