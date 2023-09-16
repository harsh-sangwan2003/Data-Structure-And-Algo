import java.util.Scanner;

public class power_log {

    public static int pow(int x, int n) {

        if (n == 0)
            return 1;

        if (n == 1)
            return x;

        int x_n_2 = pow(x, n / 2);
        int res = 1;

        if (n % 2 == 0)
            res = x_n_2 * x_n_2;

        else
            res = x * x_n_2 * x_n_2;

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int n = scn.nextInt();

        int res = pow(x, n);
        System.out.println(res);

        scn.close();
    }
}
