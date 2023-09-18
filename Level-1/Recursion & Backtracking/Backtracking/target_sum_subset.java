import java.util.Scanner;

public class target_sum_subset {

    public static void targetSumSubsets(int[] arr, int tar, int currSum, int idx, String psf) {

        if (idx == arr.length) {

            if (currSum == tar)
                System.out.println(psf);

            return;
        }

        targetSumSubsets(arr, tar, currSum + arr[idx], idx + 1, psf + arr[idx] + ", ");
        targetSumSubsets(arr, tar, currSum, idx + 1, psf);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int tar = scn.nextInt();

        targetSumSubsets(arr, tar, 0, 0, "");

        scn.close();
    }

}
