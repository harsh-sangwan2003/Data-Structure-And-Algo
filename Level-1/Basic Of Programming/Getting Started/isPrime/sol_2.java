package isPrime;

import java.util.Scanner;

public class sol_2 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int i = 1; i <= t; i++) {

            int num = scn.nextInt();
            boolean flag = true;

            for (int n = 2; n * n <= num; n++) {

                if (num % n == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag)
                System.out.println("prime");

            else
                System.out.println("not prime");
        }

        scn.close();
    }
}
