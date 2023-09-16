import java.util.Scanner;

public class printIncreasing {

    public static void increasing(int n) {

        if (n <= 0)
            return;

        increasing(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        increasing(n);

        scn.close();
    }
}