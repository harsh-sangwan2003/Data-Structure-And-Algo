import java.util.*;

public class count_ABC {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        int a = 0, ab = 0, abc = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a')
                a = 2 * a + 1;

            else if (ch == 'b')
                ab = 2 * ab + a;

            else
                abc = 2 * abc + ab;
        }

        System.out.println(abc);

        scn.close();
    }
}