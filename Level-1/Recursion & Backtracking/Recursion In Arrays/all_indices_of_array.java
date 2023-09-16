import java.util.Scanner;

public class all_indices_of_array {

    public static int[] allIndices(int[] arr, int idx, int tar, int fsf) {

        if (idx == arr.length)
            return new int[fsf];

        int[] res;

        if (arr[idx] == tar) {

            res = allIndices(arr, idx + 1, tar, fsf + 1);
            res[fsf] = idx;
        }

        else
            res = allIndices(arr, idx + 1, tar, fsf);

        return res;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int tar = scn.nextInt();

        int[] res = allIndices(arr, 0, tar, 0);

        for (int val : res)
            System.out.print(val + " ");

        scn.close();
    }
}