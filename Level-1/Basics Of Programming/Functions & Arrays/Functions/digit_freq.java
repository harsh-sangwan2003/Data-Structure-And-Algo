import java.util.Scanner;

public class digit_freq {

    public static int calcDigit(int num, int digit) {

        int count = 0;

        while (num != 0) {

            int ld = num % 10;
            num /= 10;

            if (ld == digit)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int digit = scn.nextInt();

        int res = calcDigit(num, digit);
        System.out.println(res);

        scn.close();
    }
}
