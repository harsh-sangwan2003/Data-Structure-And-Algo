import java.util.Scanner;

public class all_palindrome {

    public static boolean isPalindrome(String str) {

        int lo = 0, hi = str.length() - 1;

        while (lo <= hi) {

            char ch1 = str.charAt(lo);
            char ch2 = str.charAt(hi);

            if (ch1 != ch2)
                return false;

            lo++;
            hi--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {

                String s = str.substring(i, j);

                if (isPalindrome(s))
                    System.out.println(s);
            }
        }
        scn.close();
    }

}
