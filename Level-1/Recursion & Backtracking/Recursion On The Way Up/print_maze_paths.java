import java.util.Scanner;

public class print_maze_paths {

    public static void printMazePaths(int sr, int sc, int dr, int dc, String ans) {

        if (sr < 0 || sc < 0 || sr > dr || sc > dc)
            return;

        if (sr == dr && sc == dc) {

            System.out.println(ans);
            return;
        }

        printMazePaths(sr, sc + 1, dr, dc, ans + "h");
        printMazePaths(sr + 1, sc, dr, dc, ans + "v");
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        printMazePaths(0, 0, n - 1, m - 1, "");

        scn.close();
    }

}
