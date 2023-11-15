import java.util.*;

public class paint_fence {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        long same = k;
        long diff = k * (k - 1);
        long total = same + diff;

        for (int i = 3; i <= n; i++) {

            same = diff * 1;
            diff = total * (k - 1);
            total = same + diff;
        }

        System.out.println(total);

        scn.close();

    }
}