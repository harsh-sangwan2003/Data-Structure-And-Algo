import java.util.*;

public class sol_3 {

    public static int fib(int n) {

        int a = 0, b = 1;

        for(int i=0; i<n; i++){

            int c = a+b;
            a = b;
            b = c;
        }

        return a;
        
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