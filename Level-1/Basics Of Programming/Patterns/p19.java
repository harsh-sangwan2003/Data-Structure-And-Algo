import java.util.Scanner;

public class p19 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int r = 1; r <= n; r++) {

            for (int c = 1; c <= n; c++) {

                if (r == 1) {

                    if (c <= n / 2 + 1 || c == n)
                        System.out.print("*" + " ");

                    else
                        System.out.print("  ");
                }

                else if (r > 1 && r <= n / 2) {

                    if (c == n / 2 + 1 || c == n)
                        System.out.print("*" + " ");

                    else
                        System.out.print("  ");
                }

                else if (r == n / 2 + 1) {

                    System.out.print("*" + " ");
                }

                else if (r > n / 2 + 1 && r < n) {

                    if (c == 1 || c == n / 2 + 1)
                        System.out.print("*" + " ");

                    else
                        System.out.print("  ");
                }

                else {

                    if (c == 1 || c >= n / 2 + 1)
                        System.out.print("*" + " ");

                    else
                        System.out.print("  ");
                }
            }

            System.out.println();
        }

        scn.close();
    }
}
