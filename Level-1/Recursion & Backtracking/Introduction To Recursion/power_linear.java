import java.util.Scanner;

public class power_linear {

    public static int pow(int x, int n) {

        if (n == 0)
            return 1;

        if (n == 1)
            return x;

        int x_n_1 = pow(x, n - 1);
        int res = x * x_n_1;

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
