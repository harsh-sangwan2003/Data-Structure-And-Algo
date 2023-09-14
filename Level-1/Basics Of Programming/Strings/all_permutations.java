import java.util.Scanner;

public class all_permutations {

    public static int factorial(int num) {

        int rv = 1;

        for (int i = 1; i <= num; i++)
            rv *= i;

        return rv;
    }

    public static void printPermutations(StringBuilder sb) {

        for (int i = 0; i < factorial(sb.length()); i++) {

            StringBuilder str = new StringBuilder(sb);
            int temp = i;

            for (int div = sb.length(); div >= 1; div--) {

                int q = temp / div;
                int r = temp % div;

                System.out.print(str.charAt(r));
                str.deleteCharAt(r);

                temp = q;
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scn.nextLine());

        printPermutations(sb);

        scn.close();
    }

}
