import java.util.Scanner;

public class radix_sort {

    public static void radixSort(int[] arr) {

        int exp = 1;
        int max = Integer.MIN_VALUE;

        for (int val : arr)
            max = Math.max(val, max);

        while (exp <= max) {

            countSort(arr, exp);
            exp *= 10;
        }

    }

    public static void countSort(int[] arr, int exp) {
        // write your code here

        int[] farr = new int[10];

        for (int i = 0; i < arr.length; i++) {

            farr[arr[i] / exp % 10]++;
        }

        for (int i = 1; i < farr.length; i++)
            farr[i] = farr[i - 1] + farr[i];

        int[] ans = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            int pos = farr[arr[i] / exp % 10] - 1;
            ans[pos] = arr[i];
            farr[arr[i] / exp % 10]--;
        }

        for (int i = 0; i < arr.length; i++)
            arr[i] = ans[i];

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        radixSort(arr);
        print(arr);

        scn.close();
    }

}