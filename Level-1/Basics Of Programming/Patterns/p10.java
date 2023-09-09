import java.util.Scanner;

public class p10 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int osp = n / 2, isp = -1;

        for (int r = 1; r <= n; r++) {

            for (int csp = 1; csp <= osp; csp++)
                System.out.print("  ");

            System.out.print("*" + " ");

            for (int csp = 1; csp <= isp; csp++)
                System.out.print("  ");

            if (r != 1 && r != n)
                System.out.print("*" + " ");

            System.out.println();

            if (r <= n / 2) {

                osp--;
                isp += 2;
            }

            else {

                osp++;
                isp -= 2;
            }
        }

        scn.close();
    }
}