import java.util.Scanner;

public class first_index {

    public static int firstIndex(int[] arr, int idx, int tar) {

        if (idx == arr.length)
            return -1;

        if (arr[idx] == tar)
            return idx;

        return firstIndex(arr, idx + 1, tar);

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int tar = scn.nextInt();

        int res = firstIndex(arr, 0, tar);
        System.out.println(res);

        scn.close();
    }
}