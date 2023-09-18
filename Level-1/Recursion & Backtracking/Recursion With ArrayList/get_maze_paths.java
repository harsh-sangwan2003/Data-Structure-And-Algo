import java.util.ArrayList;
import java.util.Scanner;

public class get_maze_paths {

    public static ArrayList<String> getMazePaths(int r, int c, int dr, int dc) {

        if (r < 0 || r > dr || c < 0 || c > dc)

            return new ArrayList<String>();

        if (r == dr && c == dc) {

            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }

        ArrayList<String> hpaths = getMazePaths(r, c + 1, dr, dc);
        ArrayList<String> vpaths = getMazePaths(r + 1, c, dr, dc);

        ArrayList<String> paths = new ArrayList<String>();

        for (String s : hpaths)
            paths.add("h" + s);

        for (String s : vpaths)
            paths.add("v" + s);

        return paths;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> res = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(res);

        scn.close();
    }
}
