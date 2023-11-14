import java.util.*;

public class count_binary {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int oldzero = 1;
        int oldone = 1;

        for (int i = 2; i <= n; i++) {

            int newzero = oldone;
            int newone = oldzero + oldone;

            oldzero = newzero;
            oldone = newone;
        }

        System.out.println(oldzero + oldone);

        scn.close();
    }

}