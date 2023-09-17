import java.util.ArrayList;
import java.util.Scanner;

public class stair_path {

    public static ArrayList<String> getStairPaths(int n) {

        if (n == 0) {

            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        if (n < 0)
            return new ArrayList<>();

        ArrayList<String> path1 = getStairPaths(n - 1);
        ArrayList<String> path2 = getStairPaths(n - 2);
        ArrayList<String> path3 = getStairPaths(n - 3);
        ArrayList<String> paths = new ArrayList<>();

        for (String rres : path1)
            paths.add("1" + rres);

        for (String rres : path2)
            paths.add("2" + rres);

        for (String rres : path3)
            paths.add("3" + rres);

        return paths;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        ArrayList<String> res = getStairPaths(n);
        System.out.println(res);

        scn.close();
    }

}
