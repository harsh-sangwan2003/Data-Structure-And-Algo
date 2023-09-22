import java.util.Scanner;

public class sort_dates {

    public static void sortDates(String[] arr) {

        countSort(arr, 1000000, 100, 32);
        countSort(arr, 10000, 100, 13);
        countSort(arr, 1, 10000, 2501);
        
    }

    public static void countSort(String[] arr, int mod, int div, int range) {
        // write your code here

        int[] farr = new int[range];

        for (int i = 0; i < arr.length; i++) {

            farr[Integer.parseInt(arr[i], 10) / div % mod]++;
        }

        for (int i = 1; i < farr.length; i++)
            farr[i] = farr[i - 1] + farr[i];

        String[] ans = new String[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            int pos = farr[Integer.parseInt(arr[i], 10) / div % mod] - 1;
            ans[pos] = arr[i];
            farr[Integer.parseInt(arr[i], 10) / div % mod]--;

        }

        for (int i = 0; i < arr.length; i++)
            arr[i] = ans[i];

    }

    public static void print(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        String[] arr = new String[n];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            arr[i] = scn.nextLine();

            max = Math.max(max, Integer.parseInt(arr[i], 10));
            min = Math.min(min, Integer.parseInt(arr[i], 10));
        }

        sortDates(arr);
        print(arr);

        scn.close();
    }

}