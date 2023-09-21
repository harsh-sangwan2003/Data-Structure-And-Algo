import java.util.Scanner;

public class quick_select {

    public static int quickSelect(int[] arr, int lo, int hi, int k) {

        int pivot = arr[hi];
        int pi = partitionArray(arr, lo, hi, pivot);

        if (k > pi) {

            return quickSelect(arr, pi + 1, hi, k);
        }

        else if (k < pi) {

            return quickSelect(arr, lo, pi - 1, k);
        }

        else{

            return arr[pi];
        }

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

        int select = scn.nextInt();

        int res = quickSelect(arr, 0, arr.length - 1, select-1);
        System.out.println(res);

        scn.close();
    }
}