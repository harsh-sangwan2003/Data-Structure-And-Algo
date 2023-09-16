import java.util.Scanner;

public class printDecrIncr {

    public static void pdi(int n) {

        if (n <= 0)
            return;

        System.out.println(n);
        pdi(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        pdi(n);

        scn.close();
    }
}