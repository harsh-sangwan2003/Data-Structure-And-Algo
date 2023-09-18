import java.util.Scanner;

public class print_subsequence {

    public static void printSS(String str, String ans) {

        if (str.length() == 0) {

            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        printSS(ros, ans + "");
        printSS(ros, ans + ch);

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        printSS(str, "");

        scn.close();
    }

}