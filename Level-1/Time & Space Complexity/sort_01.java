import java.util.Scanner;

public class sort_01 {

    public static void sort01(int[] arr) {

        int i = 0, j = 0;

        while (i < arr.length) {

            if (arr[i] == 1)
                i++;

            else {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j++;
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

        sort01(arr);

        scn.close();
    }

}
