import java.util.Scanner;

public class last_index {

    public static int lastIndex(int[] arr, int idx, int tar) {

        if (idx == arr.length)
            return -1;

        int rres = lastIndex(arr, idx + 1, tar);

        if (rres == -1 && arr[idx] == tar)
            return idx;

        else
            return rres;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int tar = scn.nextInt();

        int res = lastIndex(arr, 0, tar);
        System.out.println(res);

        scn.close();
    }
}