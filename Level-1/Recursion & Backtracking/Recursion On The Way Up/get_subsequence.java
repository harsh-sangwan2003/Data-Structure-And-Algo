import java.util.ArrayList;
import java.util.Scanner;

public class get_subsequence {

    public static ArrayList<String> getSubsequence(String str) {

        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> recRes = getSubsequence(ros);
        ArrayList<String> myRes = new ArrayList<>();

        for (String s : recRes) {
            myRes.add(s);
        }

        for (String s : recRes) {
            myRes.add(ch + s);
        }

        return myRes;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        ArrayList<String> res = getSubsequence(str);
        System.out.println(res);
        scn.close();
    }
}