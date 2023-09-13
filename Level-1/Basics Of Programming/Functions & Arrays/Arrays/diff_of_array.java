import java.util.Scanner;

public class diff_of_array {

    public static void calcDiff(int[] a, int[] b) {

        int i = a.length - 1;
        int j = b.length - 1;
        int[] diff = new int[j + 1];
        int k = diff.length - 1;

        int carry = 0;

        while (k >= 0) {

            int digit = 0;

            int aval = i >= 0 ? a[i] : 0;

            if (b[j] + carry >= aval) {

                digit = b[j] + carry - aval;
                carry = 0;
            }

            else {

                digit = b[j] + carry + 10 - aval;
                carry = -1;
            }

            diff[k] = digit;

            i--;
            j--;
            k--;
        }

        int idx = 0;

        while (idx < diff.length) {

            if (diff[idx] == 0)
                idx++;

            else
                break;
        }

        for (int p = idx; p < diff.length; p++)
            System.out.print(diff[p]);

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

        calcDiff(a, b);

        scn.close();
    }

}
