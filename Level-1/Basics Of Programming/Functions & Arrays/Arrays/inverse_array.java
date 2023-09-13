import java.util.Scanner;

public class inverse_array {

    public static int[] inverseArray(int[] arr) {

        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            newArr[arr[i]] = i;
        }

        return newArr;
    }

    public static void printArray(int[] arr) {

        for (int val : arr) {

            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        int[] res = inverseArray(arr);
        printArray(res);

        scn.close();
    }
}
