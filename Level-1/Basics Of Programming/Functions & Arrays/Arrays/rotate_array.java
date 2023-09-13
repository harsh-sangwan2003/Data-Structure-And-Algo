import java.util.Scanner;

public class rotate_array {

    public static void reverseArray(int[] arr, int lo, int hi) {

        while (lo <= hi) {

            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;

            lo++;
            hi--;
        }

    }

    public static void printArray(int[] arr) {

        for (int val : arr)
            System.out.print(val + " ");
    }

    public static void rotateArray(int[] arr, int rot) {

        reverseArray(arr, 0, arr.length - rot - 1);
        reverseArray(arr, arr.length - rot, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        int rot = scn.nextInt();

        rot %= arr.length;

        if (rot < 0)
            rot += arr.length;

        rotateArray(arr, rot);
        printArray(arr);

        scn.close();
    }
}
