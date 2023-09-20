import java.util.Scanner;

public class quick_sort {

    public static void quickSort(int[] arr, int lo, int hi) {

        if (lo >= hi)
            return;

        int pivot = arr[hi];
        int pi = partitionArray(arr, lo, hi, pivot);

        quickSort(arr, lo, pi - 1);
        quickSort(arr, pi + 1, hi);

    }

    public static int partitionArray(int[] arr, int lo, int hi, int pivot) {

        int i = lo, j = lo;

        while (i <= hi) {

            if (arr[i] > pivot)
                i++;

            else {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j++;
            }
        }

        return (j - 1);

    }

    public static void printArray(int[] arr) {

        for (int val : arr)
            System.out.print(val + " ");
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        quickSort(arr, 0, arr.length - 1);
        printArray(arr);

        scn.close();
    }
}