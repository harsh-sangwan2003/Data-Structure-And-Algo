import java.util.Scanner;

public class gcd_lcm {

    public static int GCD(int a, int b) {

        while (b % a != 0) {

            int rem = b % a;
            a = b;
            b = rem;
        }

        return b;
    }

    public static int LCM(int gcd, int a, int b) {

        return (a * b) / gcd;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int gcd = GCD(num1, num2);
        int lcm = LCM(gcd, num1, num2);

        System.out.println(gcd);
        System.out.println(lcm);

        scn.close();
    }
}
