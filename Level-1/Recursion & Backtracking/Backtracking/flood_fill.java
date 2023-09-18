import java.util.Scanner;

public class flood_fill {

    public static void floodFill(int[][] arr, int sr, int sc, String psf, boolean[][] visited) {

        if (sr < 0 || sc < 0 || sr >= arr.length || sc >= arr[0].length || arr[sr][sc] == 1 || visited[sr][sc])
            return;

        if (sr == arr.length - 1 && sc == arr[0].length - 1) {

            System.out.println(psf);
            return;
        }

        visited[sr][sc] = true;

        floodFill(arr, sr - 1, sc, psf + "t", visited);
        floodFill(arr, sr, sc - 1, psf + "l", visited);
        floodFill(arr, sr + 1, sc, psf + "d", visited);
        floodFill(arr, sr, sc + 1, psf + "r", visited);

        visited[sr][sc] = false;
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

        boolean[][] visited = new boolean[n][m];

        floodFill(arr, 0, 0, "", visited);

        scn.close();
    }
}