import java.util.Scanner;

public class selection_sort {

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int mi = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (isSmaller(arr, j, mi))
                    mi = j;
            }

            swap(arr, mi, i);
        }
    }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isSmaller(int[] arr, int i, int j) {

        if (arr[i] < arr[j])
            return true;

        return false;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        scn.close();
    }
}