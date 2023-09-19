import java.util.Scanner;

public class insertion_sort {

    public static void bubbleSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            for (int j = i - 1; j >= 0; j--) {

                if (isGreater(arr, j, j + 1)) {

                    swap(arr, j, j + 1);
                }

                else {

                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isGreater(int[] arr, int j, int i) {

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