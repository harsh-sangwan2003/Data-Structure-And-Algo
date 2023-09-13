import java.util.Scanner;

public class reverse_array {

    public static void reverseArray(int[] arr) {

        int i = 0, j = arr.length - 1;

        while (i <= j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
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
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        reverseArray(arr);
        printArray(arr);

        scn.close();
    }

}
