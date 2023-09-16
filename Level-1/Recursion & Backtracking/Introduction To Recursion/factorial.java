import java.util.Scanner;

public class factorial {

    public static int fact(int num) {

        if (num == 0 || num == 1)
            return 1;

        int n_1 = fact(num - 1);
        int res = num * n_1;

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        int res = fact(num);
        System.out.println(res);

        scn.close();
    }

}
