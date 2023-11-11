import java.util.*;

public class sol_1 {

    public static int fib(int n) {

        if (n == 0 || n == 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int res = fib(n);
        System.out.println(res);

        scn.close();
    }

}