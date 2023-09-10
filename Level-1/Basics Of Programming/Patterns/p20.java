import java.util.Scanner;

public class p20 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int r = 1; r <= n; r++) {

            for (int c = 1; c <= n; c++) {

                if (c == 1 || c == n)
                    System.out.print("*" + " ");

                else if (r >= n / 2 + 1) {

                    if (r == c || r + c == n + 1)
                        System.out.print("*" + " ");

                    else
                        System.out.print("  ");
                }

                else
                    System.out.print("  ");
            }

            System.out.println();
        }

        scn.close();
    }
}
