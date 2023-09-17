import java.util.ArrayList;
import java.util.Scanner;

public class get_maze_path_jumps {

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if (sr < 0 || sc < 0 || sr > dr || sc > dc) {
            return new ArrayList<String>();
        }

        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths = new ArrayList<>();

        // horizontal paths
        for (int ms = 1; ms <= dc - sc; ms++) {

            ArrayList<String> hpaths = getMazePaths(sr, sc + ms, dr, dc);

            for (String hpath : hpaths) {
                paths.add("h" + ms + hpath);
            }
        }
        
        // vertical paths
        for (int ms = 1; ms <= dr - sr; ms++) {

            ArrayList<String> vpaths = getMazePaths(sr + ms, sc, dr, dc);

            for (String vpath : vpaths) {
                paths.add("v" + ms + vpath);
            }
        }

        // diagonal paths
        for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) {

            ArrayList<String> dpaths = getMazePaths(sr + ms, sc + ms, dr, dc);

            for (String dpath : dpaths) {
                paths.add("d" + ms + dpath);
            }
        }

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
