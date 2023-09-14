import java.util.Scanner;

public class ascii_diff {

    public static String sol(StringBuilder sb) {

        StringBuilder str = new StringBuilder("");
        str.append(sb.charAt(0));

        for (int i = 1; i < sb.length(); i++) {

            char curr = sb.charAt(i);
            char prev = sb.charAt(i - 1);
            int gap = curr - prev;

            str.append(gap);
            str.append(curr);
        }

        return str.toString();
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scn.nextLine());

        String res = sol(sb);
        System.out.println(res);

        scn.close();
    }
}