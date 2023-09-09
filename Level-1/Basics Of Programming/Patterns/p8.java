import java.util.Scanner;

public class p8 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nsp = n - 1;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("  ");

            System.out.println("*");

            nsp--;
        }

        scn.close();
    }
}