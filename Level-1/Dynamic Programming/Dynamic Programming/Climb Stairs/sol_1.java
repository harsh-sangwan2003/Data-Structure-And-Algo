import java.util.*;

public class sol_1 {

    public static int countStairs(int n) {

        if (n < 0)
            return 0;

        if (n == 0)
            return 1;

        int n_1 = countStairs(n - 1);
        int n_2 = countStairs(n - 2);
        int n_3 = countStairs(n - 3);

        return n_1 + n_2 + n_3;
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int res = countStairs(n);
        System.out.println(res);

        scn.close();
    }

}