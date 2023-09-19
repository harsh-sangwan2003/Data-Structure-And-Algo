import java.util.Scanner;

public class merge_sorted_arrays {

    public static int[] mergeSortedArrays(int[] arr, int[] arr2) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] res = new int[arr.length + arr2.length];

        while (i < arr.length && j < arr2.length) {

            if (arr[i] < arr2[j]) {

                res[k] = arr[i];
                i++;
            }

            else {

                res[k] = arr2[j];
                j++;
            }

            k++;
        }

        while (i < arr.length) {

            res[k] = arr[i];
            i++;
            k++;
        }

        while (j < arr2.length) {

            res[k] = arr2[j];
            j++;
            k++;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] arr = new int[n1];

        for (int i = 0; i < n1; i++)
            arr[i] = scn.nextInt();

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < n2; i++)
            arr2[i] = scn.nextInt();

        int[] res = mergeSortedArrays(arr, arr2);

        for (int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");

        scn.close();
    }
}