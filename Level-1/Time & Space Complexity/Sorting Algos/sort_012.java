import java.util.Scanner;

public class sort_012 {

    public static void sort012(int[] arr) {

        int i = 0, j = 0, k = arr.length - 1;

        while (i <= k) {

            if (arr[i] == 2) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;

                k--;
            }

            else if (arr[i] == 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j++;
            }

            else {

                i++;
            }
        }

        printArr(arr);
    }

    public static void printArr(int[] arr) {

        for (int val : arr)
            System.out.print(val + " ");
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        sort012(arr);

        scn.close();
    }

}
