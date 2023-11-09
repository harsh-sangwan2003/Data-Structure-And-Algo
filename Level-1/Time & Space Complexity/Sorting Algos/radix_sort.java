import java.util.*;

public class radix_sort {

    public static void radixSort(int[] arr) {
        // write code here
        int max = Integer.MIN_VALUE;

        for (int val : arr)
            max = Math.max(max, val);

        int exp = 1;
        while (exp <= max) {

            countSort(arr, exp);
            exp *= 10;
        }
    }

    public static void countSort(int[] arr, int exp) {
        // write your code here
        int[] farr = new int[10];

        for (int i = 0; i < arr.length; i++) {

            int idx = arr[i] / exp % 10;
            farr[idx]++;
        }

        for (int i = 1; i < farr.length; i++)
            farr[i] += farr[i - 1];

        int[] ans = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            int pos = farr[arr[i] / exp % 10];
            int idx = pos - 1;
            ans[idx] = arr[i];
            farr[arr[i] / exp % 10]--;
        }

        for (int i = 0; i < arr.length; i++)
            arr[i] = ans[i];

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        radixSort(arr);
        print(arr);

        scn.close();
    }

}