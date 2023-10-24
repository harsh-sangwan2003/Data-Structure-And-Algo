import java.util.*;

public class lcs {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int val : arr)
            map.put(val, true);

        for (int val : arr) {

            if (map.containsKey(val - 1))
                map.put(val, false);
        }

        int msp = 0, ml = 0;

        for (int val : arr) {

            if (map.get(val)) {

                int tsp = val;
                int tl = 1;

                while (map.containsKey(tsp + tl))
                    tl++;

                if (tl > ml) {
                    msp = tsp;
                    ml = tl;
                }
            }
        }

        for (int i = 0; i < ml; i++) {

            System.out.print(msp + i + " ");
        }

        scn.close();
    }

}