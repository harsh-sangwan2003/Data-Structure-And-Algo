import java.util.Scanner;

public class string {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String s = scn.nextLine();
        System.out.println(s.length());

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            System.out.println(ch);
        }

        System.out.println(s.substring(1, 3));

        scn.close();
    }
}