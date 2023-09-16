import java.util.Scanner;

public class twod_searching {

    public static void search2d(int[][] arr, int tar) {

        int r = 0, c = arr[0].length - 1;

        while (r < arr.length && c >= 0) {

            if (arr[r][c] == tar) {
                System.out.println(r + ", " + c);
                return;
            }

            else if (arr[r][c] > tar) {
                c--;
            }

            else
                r++;

        }

        System.out.println("Element not found");

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int tar = scn.nextInt();

        search2d(arr, tar);
        scn.close();
    }
}