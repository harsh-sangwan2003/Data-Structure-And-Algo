import java.util.Scanner;

public class print_maze_paths_jumps {

    public static void printMazePathsJumps(int sr, int sc, int dr, int dc, String ans) {

        if (sr < 0 || sc < 0 || sr > dr || sc > dc)
            return;

        if (sr == dr && sc == dc) {

            System.out.println(ans);
            return;
        }

        for (int ms = 1; ms <= dc - sc; ms++)
            printMazePathsJumps(sr, sc + ms, dr, dc, ans + "h" + ms);

        for (int ms = 1; ms <= dr - sr; ms++)
            printMazePathsJumps(sr + ms, sc, dr, dc, ans + "v" + ms);

        for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++)
            printMazePathsJumps(sr + ms, sc + ms, dr, dc, ans + "d" + ms);

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        printMazePathsJumps(0, 0, n - 1, m - 1, "");

        scn.close();
    }

}
