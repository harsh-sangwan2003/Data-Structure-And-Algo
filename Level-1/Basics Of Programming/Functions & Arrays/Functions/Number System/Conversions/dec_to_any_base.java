import java.util.Scanner;

public class dec_to_any_base {

    public static int decToBase(int num, int b) {

        int mul = 1;
        int res = 0;

        while (num != 0) {

            int rem = num % b;
            num /= b;

            res += rem * mul;
            mul *= 10;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int b = scn.nextInt();

        int res = decToBase(num, b);
        System.out.println(res);

        scn.close();
    }
}