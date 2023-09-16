import java.util.Scanner;

public class shell_rotate {

    public static void shellRotate(int[][] arr, int s, int r) {

        int[] oned = fillOnedFromShell(arr, s);
        rotate(oned, r);
        fillShellFromoned(oned, arr, s);
    }

    public static void fillShellFromoned(int[] oned, int[][] arr, int s) {

        int minR = s - 1;
        int minC = s - 1;
        int maxR = arr.length - s;
        int maxC = arr[0].length - s;

        int idx = 0;

        // lw
        for (int r = minR; r <= maxR; r++) {
            arr[r][minC] = oned[idx];
            idx++;
        }

        // bw
        for (int c = minC + 1; c <= maxC; c++) {
            arr[maxR][c] = oned[idx];
            idx++;
        }

        // rw
        for (int r = maxR - 1; r >= minR; r--) {
            arr[r][minC] = oned[idx];
            idx++;
        }

        // lw
        for (int c = maxC - 1; c >= minC + 1; c--) {
            arr[minR][c] = oned[idx];
            idx++;
        }

    }

    public static int[] fillOnedFromShell(int[][] arr, int s) {

        int minR = s - 1;
        int minC = s - 1;
        int maxR = arr.length - s;
        int maxC = arr[0].length - s;
        int sz = 2 * (maxR - minR + maxC - minC);

        int idx = 0;
        int[] oned = new int[sz];

        // lw
        for (int r = minR; r <= maxR; r++) {
            oned[idx] = arr[r][minC];
            idx++;
        }

        // bw
        for (int c = minC + 1; c <= maxC; c++) {
            oned[idx] = arr[maxR][c];
            idx++;
        }

        // rw
        for (int r = maxR - 1; r >= minR; r--) {
            oned[idx] = arr[r][minC];
            idx++;
        }

        // lw
        for (int c = maxC - 1; c >= minC + 1; c--) {
            oned[idx] = arr[minR][c];
            idx++;
        }

        return oned;

    }

    public static void rotate(int[] arr, int r) {

        r = r % arr.length;
        
        if (r < 0)
            r += arr.length;

        reverse(arr, 0, arr.length - r - 1);
        reverse(arr, arr.length - r, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int[] arr, int lo, int hi) {

        while (lo <= hi) {

            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;

            lo++;
            hi--;
        }
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

        int s = scn.nextInt();
        int r = scn.nextInt();

        shellRotate(arr, s, r);

        scn.close();
    }
}