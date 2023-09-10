import java.util.Scanner;

public class p11 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nst = 1,cnt=1;

        for (int r = 1; r <= n; r++) {

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(cnt + " ");
                cnt++;
            }

            System.out.println();

            nst++;

        }

        scn.close();
    }
}