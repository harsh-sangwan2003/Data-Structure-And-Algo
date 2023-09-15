import java.util.Scanner;

public class spiral_traversal {

    public static void printSpiral(int[][] arr) {

        int minRow = 0;
        int maxRow = arr.length - 1;
        int minCol = 0;
        int maxCol = arr[0].length - 1;

        int ne = arr.length * arr[0].length;
        int count = 0;

        while (count < ne) {

            // left
            for (int row = minRow; row <= maxRow && count < ne; row++) {
                System.out.println(arr[row][minCol]);
                count++;
            }
            minCol++;

            // bottom
            for (int col = minCol; col <= maxCol && count < ne; col++) {
                System.out.println(arr[maxRow][col]);
                count++;
            }
            maxRow--;

            // right
            for (int row = maxRow; row >= minRow && count < ne; row--) {
                System.out.println(arr[row][maxCol]);
                count++;
            }
            maxCol--;

            // top
            for (int col = maxCol; col >= minCol && count < ne; col--) {
                System.out.println(arr[minRow][col]);
                count++;
            }
            minRow++;

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

        printSpiral(arr);

        scn.close();
    }

}
