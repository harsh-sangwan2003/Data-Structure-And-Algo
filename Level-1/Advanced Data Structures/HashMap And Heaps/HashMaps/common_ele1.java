import java.util.*;

public class common_ele1 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++)
            a1[i] = scn.nextInt();

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++)
            a2[i] = scn.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a1.length; i++)
            map.put(a1[i], 0);

        for (int i = 0; i < a2.length; i++) {

            if (map.containsKey(a2[i])) {
                System.out.print(a2[i] + " ");
                map.remove(a2[i]);
            }
        }

        scn.close();
    }

}