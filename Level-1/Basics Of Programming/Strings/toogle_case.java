import java.util.Scanner;

public class toogle_case {

    public static void toogleCase(StringBuilder str) {

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                ch = (char) ('A' + ch - 'a');
                str.setCharAt(i, ch);
            }

            else {

                ch = (char) ('a' + ch - 'A');
                str.setCharAt(i, ch);
            }
        }

        System.out.println(str);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        StringBuilder str = new StringBuilder(scn.nextLine());

        toogleCase(str);

        scn.close();
    }
}
