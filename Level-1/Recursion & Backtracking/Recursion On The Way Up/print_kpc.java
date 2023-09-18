import java.util.Scanner;

public class print_kpc {

    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKPC(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        for (int i = 0; i < codes[ch - '0'].length(); i++) {

            printKPC(ros, ans + codes[ch - '0'].charAt(i));
        }

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        printKPC(str, "");

        scn.close();
    }

}
