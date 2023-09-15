import java.util.Scanner;

public class matrix_mul {

    public static void matrixMul(int[][] mat1, int[][] mat2) {

        int r1 = mat1.length;
        int r2 = mat2[0].length;
        int r3 = mat1[0].length;

        int[][] prdt = new int[r1][r2];
        for (int i = 0; i < r1; i++) {

            for (int j = 0; j < r2; j++) {

                for (int k = 0; k < r3; k++) {

                    prdt[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        printMatrix(prdt);
    }

    public static void printMatrix(int[][] mat) {

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[0].length; j++)
                System.out.print(mat[i][j] + " ");

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int m1 = scn.nextInt();

        int[][] mat1 = new int[n1][m1];
        for (int i = 0; i < n1; i++) {

            for (int j = 0; j < m1; j++)
                mat1[i][j] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int m2 = scn.nextInt();

        int[][] mat2 = new int[n2][m2];
        for (int i = 0; i < n2; i++) {

            for (int j = 0; j < m2; j++)
                mat2[i][j] = scn.nextInt();
        }

        if (m1 != n2)
            System.out.println("Matrices cannot be multiplied.");

        else
            matrixMul(mat1, mat2);

        scn.close();
    }
}