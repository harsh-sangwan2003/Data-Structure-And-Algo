import java.io.*;

public class no_of_islands {

    public static void dfs(int[][] arr, int i, int j, boolean[][] visited) {

        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == 1 || visited[i][j])
            return;

        visited[i][j] = true;

        dfs(arr, i - 1, j, visited);
        dfs(arr, i, j + 1, visited);
        dfs(arr, i, j - 1, visited);
        dfs(arr, i + 1, j, visited);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            String parts = br.readLine();
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
            }
        }

        // write your code here
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        int count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (!visited[i][j] && arr[i][j] == 0) {

                    dfs(arr, i, j, visited);
                    count++;
                }
            }
        }

        System.out.println(count);
    }

}