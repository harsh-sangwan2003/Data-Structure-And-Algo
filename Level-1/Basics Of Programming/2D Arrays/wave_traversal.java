import java.util.Scanner;

public class wave_traversal {

    public static void waveTraversal(int[][] arr) {

        int r = arr.length;
        int c = arr[0].length;

        for (int j = 0; j < c; j++) {

            if (j % 2 == 0) {

                for (int i = 0; i < r; i++) {

                    System.out.println(arr[i][j]);
                }
            }

            else {

                for (int i = r - 1; i >= 0; i--) {

                    System.out.println(arr[i][j]);
                }

            }

        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++)
                arr[i][j] = scn.nextInt();
        }

        waveTraversal(arr);

        scn.close();
    }
}
