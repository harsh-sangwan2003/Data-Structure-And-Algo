import java.util.Scanner;

public class max_of_array {

    public static int maxOfArray(int[] arr, int idx) {

        if (idx == arr.length - 1)
            return arr[idx];

        int rres = maxOfArray(arr, idx + 1);
        int res = Math.max(arr[idx], rres);

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int ans = maxOfArray(arr, 0);
        System.out.println(ans);

        scn.close();
    }
}