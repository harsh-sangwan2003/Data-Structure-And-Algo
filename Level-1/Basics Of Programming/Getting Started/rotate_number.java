import java.util.Scanner;

public class rotate_number {

    public static int countDigits(int num) {

        int count = 0;

        while (num != 0) {

            count++;
            num /= 10;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int k = scn.nextInt();

        int nod = countDigits(num);

        if (k < 0)
            k += nod;

        k %= nod;

        int div = (int) Math.pow(10, k);
        int mul = (int) Math.pow(10, nod - k);
        int rem = num % div;
        int quo = num / div;

        int res = rem * mul + quo;
        System.out.println(res);
        scn.close();
    }
}