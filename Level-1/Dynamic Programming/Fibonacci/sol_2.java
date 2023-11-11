import java.util.*;

public class sol_2 {

    public static int fib(int n, int[] qb) {

        if (n == 0 || n == 1)
            return n;

        if(qb[n]!=0)
        return qb[n];

        qb[n] = fib(n - 1,qb) + fib(n - 2,qb);

        return qb[n];
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int res = fib(n,new int[n+1]);
        System.out.println(res);

        scn.close();
    }

}