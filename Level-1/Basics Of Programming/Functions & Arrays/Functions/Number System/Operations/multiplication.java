import java.util.Scanner;

public class multiplication {

    public static int product(int base, int n1, int n2) {

        int res = 0;
        int mul = 1;

        while (n2 > 0) {

            int d2 = n2 % 10;
            n2 /= 10;

            int sprd = mulWithDigit(base, n1, d2);
            res = addNumbers(base, res, sprd * mul);
            mul *= 10;
        }

        return res;
    }

    public static int mulWithDigit(int base, int num, int digit) {

        int carry = 0;
        int res = 0;
        int mul = 1;

        while (num != 0 || carry != 0) {

            int ld = num % 10;
            num /= 10;

            int d = ld * digit + carry;
            carry = d / base;
            d %= base;

            res += d * mul;
            mul *= 10;
        }

        return res;
    }

    public static int addNumbers(int base, int n1, int n2) {

        int carry = 0;
        int res = 0;
        int mul = 1;

        while (n1 != 0 || n2 != 0 || carry != 0) {

            int a = n1 % 10;
            int b = n2 % 10;

            n1 /= 10;
            n2 /= 10;

            int digit = a + b + carry;
            carry = digit / base;
            digit %= base;

            res += digit * mul;
            mul *= 10;
        }

        return res;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int base = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int ans = product(base, n1, n2);
        System.out.println(ans);

        scn.close();

    }
}
