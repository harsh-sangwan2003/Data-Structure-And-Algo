import java.util.Scanner;

public class factorial {

    public static int fact(int num) {

        int rv = 1;

        for (int i = 1; i <= num; i++)
            rv *= i;

        return rv;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int r = scn.nextInt();

        int nfact = fact(n);
        int rfact = fact(n - r);

        int res = nfact / rfact;
        System.out.println(res);

        scn.close();
    }
}