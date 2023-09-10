import java.util.Scanner;

public class p12 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1, a = 0, b = 1;

        for (int r = 1; r <= n; r++) {

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(a + " ");

                int c = a + b;
                a = b;
                b = c;
            }

            System.out.println();

            nst++;
        }

        scn.close();
    }
}