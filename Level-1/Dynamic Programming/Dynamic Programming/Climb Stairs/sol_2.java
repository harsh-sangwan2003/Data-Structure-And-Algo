import java.util.*;

public class sol_2 {

    public static int countStairs(int n, int[] qb) {

        if (n < 0)
            return 0;

        if (n == 0)
            return 1;

        if (qb[n] != 0)
            return qb[n];

        int n_1 = countStairs(n - 1, qb);
        int n_2 = countStairs(n - 2, qb);
        int n_3 = countStairs(n - 3, qb);

        return qb[n] = n_1 + n_2 + n_3;
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int res = countStairs(n, new int[n + 1]);
        System.out.println(res);

        scn.close();
    }

}