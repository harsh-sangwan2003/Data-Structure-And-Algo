import java.util.Scanner;

public class sum_of_array {

    public static void calcSum(int[] a, int[] b) {

        int i = a.length - 1;
        int j = b.length - 1;
        int[] sum = new int[i > j ? i + 1 : j + 1];
        int k = sum.length - 1;

        int carry = 0;

        while (k >= 0) {

            int digit = carry;

            int d1 = i >= 0 ? a[i] : 0;
            int d2 = j >= 0 ? b[j] : 0;

            digit += d1 + d2;

            carry = digit / 10;
            digit %= 10;

            sum[k] = digit;

            i--;
            j--;
            k--;
        }

        if (carry != 0)
            System.out.println(carry);

        for (int val : sum)
            System.out.println(val);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i < a.length; i++)
            a[i] = scn.nextInt();

        int n2 = scn.nextInt();
        int[] b = new int[n2];
        for (int i = 0; i < b.length; i++)
            b[i] = scn.nextInt();

        calcSum(a, b);

        scn.close();
    }

}
