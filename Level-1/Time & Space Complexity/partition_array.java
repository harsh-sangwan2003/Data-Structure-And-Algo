import java.util.Scanner;

public class partition_array {

    public static void partitionArray(int[] arr, int pivot) {

        int i = 0;
        int j = 0;

        while (i < arr.length) {

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

        int pivot = scn.nextInt();

        partitionArray(arr, pivot);
        printArray(arr);

        scn.close();
    }
}