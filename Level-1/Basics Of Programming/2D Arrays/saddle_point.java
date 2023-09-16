import java.util.Scanner;

public class saddle_point {

    public static void saddlePoint(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            int svj = 0;
            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] < arr[i][svj])
                    svj = j;
            }

            boolean flag = true;
            for (int k = 0; k < arr.length; k++) {

                if (arr[k][svj] > arr[i][svj]) {

                    flag = false;
                    break;
                }
            }

            if (flag) {

                System.out.println(arr[i][svj]);
                return;
            }

        }

        System.out.println("Invalid input");
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

        saddlePoint(arr);

        scn.close();
    }
}