import java.util.Scanner;

public class diagonal_traversal {

    public static void diagonalTraversal(int[][] arr) {

        for (int g = 0; g < arr.length; g++) {

            for (int i = 0, j = g; j < arr.length; i++, j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        diagonalTraversal(arr);

        scn.close();
    }
}