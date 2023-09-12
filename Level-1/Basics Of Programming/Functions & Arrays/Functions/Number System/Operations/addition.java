import java.util.Scanner;

public class addition {

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

        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int res = addNumbers(b, n1, n2);
        System.out.println(res);

        scn.close();
    }
}