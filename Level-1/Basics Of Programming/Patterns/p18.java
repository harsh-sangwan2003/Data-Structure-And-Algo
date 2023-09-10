import java.util.Scanner;

public class p18 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int osp = 0, isp = n - 2;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= osp; csp++)
                System.out.print("  ");

            System.out.print("*" + " ");

            for (int csp = 1; csp <= isp; csp++) {
                if (r == 1 || r > n / 2 + 1)
                    System.out.print("*" + " ");

                else
                    System.out.print("  ");
            }

            if (r != n / 2 + 1)
                System.out.print("*" + " ");

            System.out.println();

            if (r <= n / 2) {

                osp++;
                isp -= 2;
            }

            else {

                osp--;
                isp += 2;
            }
        }

        scn.close();
    }
}
