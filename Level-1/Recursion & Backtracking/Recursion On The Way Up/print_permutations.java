import java.util.Scanner;

public class print_permutations {

    public static void printPermutations(String str, String ans) {

        if (str.length() == 0) {

            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            String left = str.substring(0, i);
            String right = str.substring(i + 1);

            char ch = str.charAt(i);

            printPermutations(left + right, ans + ch);
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        printPermutations(str, "");

        scn.close();
    }

}
