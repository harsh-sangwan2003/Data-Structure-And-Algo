import java.util.Scanner;

public class subtraction {

    public static int sub(int base, int n1, int n2) {

        int res = 0;
        int c = 0;
        int mul = 1;

        while (n2 != 0) {

            int d1 = n1 % 10;
            int d2 = n2 % 10;

            n1 /= 10;
            n2 /= 10;

            int d = 0;
            d2 += c;

            if (d2 > d1) {
                c = 0;
                d = d2 - d1;
            }

            else {

                c = -1;
                d = d2 + base - d1;
            }

            res += d * mul;
            mul *= 10;

        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int base = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int res = sub(base, n1, n2);
        System.out.println(res);

        scn.close();
    }
}
