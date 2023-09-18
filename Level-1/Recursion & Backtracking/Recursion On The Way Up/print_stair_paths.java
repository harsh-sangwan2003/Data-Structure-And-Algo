import java.util.Scanner;

public class print_stair_paths {

    public static void printStairPaths(int n, String ans) {

        if (n < 0)
            return;

        if (n == 0) {

            System.out.println(ans);
            return;
        }

        printStairPaths(n - 1, ans + "1");
        printStairPaths(n - 2, ans + "2");
        printStairPaths(n - 3, ans + "3");

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        printStairPaths(n, "");

        scn.close();
    }
}
