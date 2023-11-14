import java.util.*;

public class arrange_buildings {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        long oldb = 1;
        long olds = 1;

        for (int i = 2; i <= n; i++) {

            long newb = olds;
            long news = oldb + olds;

            oldb = newb;
            olds = news;
        }

        long total = oldb + olds;
        total = total * total;

        System.out.println(total);
        scn.close();
    }

}