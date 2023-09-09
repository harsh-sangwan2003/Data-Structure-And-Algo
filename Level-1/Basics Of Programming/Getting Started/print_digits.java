import java.util.Scanner;

public class print_digits {

    public static int countDigits(int num) {

        int count = 0;

        while (num != 0) {

            num /= 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int nod = countDigits(num);

        int div = (int) Math.pow(10, nod - 1);
        while (div != 0) {

            int digit = num / div;
            System.out.println(digit);
            num %= div;
            div /= 10;
        }

        scn.close();
    }
}
