import java.util.Scanner;

public class string_compression {

    public static void stringCompression1(String str) {

        String s = "" + str.charAt(0);

        for (int i = 1; i < str.length(); i++) {

            char prev = str.charAt(i - 1);
            char curr = str.charAt(i);

            if (curr != prev)
                s += curr;
        }

        System.out.println(s);
    }

    public static void stringCompression2(String str) {

        String s = "" + str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            char prev = str.charAt(i - 1);
            char curr = str.charAt(i);

            if (prev == curr) {

                count++;
            }

            else {

                if (count > 1)
                    s += count;

                count = 1;
                s += curr;
            }
        }

        System.out.println(s);
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        stringCompression1(str);
        stringCompression2(str);

        scn.close();
    }
}