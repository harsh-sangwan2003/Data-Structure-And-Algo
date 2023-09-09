import java.util.Scanner;

public class pyth_triplets {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();

        int a = Math.max(x, Math.max(y, z));
        int b, c;

        if (a == x) {

            b = y;
            c = z;
        }

        else if (a == y) {

            b = x;
            c = z;
        }

        else {

            b = x;
            c = z;
        }

        if (a * a == (b * b + c * c))
            System.out.println("true");

        else
            System.out.println("false");

        scn.close();
    }

}
