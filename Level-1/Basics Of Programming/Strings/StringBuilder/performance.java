import java.util.Scanner;

public class performance {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        long start = System.currentTimeMillis();
        // String str = "";
        // int n = 10000;

        // for (int i = 0; i <= n; i++)
        // str += i;
        StringBuilder sb = new StringBuilder();
        int n = 1000000;

        for (int i = 0; i <= n; i++)
            sb.append(i);

        long end = System.currentTimeMillis();

        System.out.println(end - start);

        scn.close();
    }
}