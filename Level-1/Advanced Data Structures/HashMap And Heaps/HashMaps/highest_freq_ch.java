import java.util.*;

public class highest_freq_ch {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);

            else
                map.put(ch, 1);
        }

        int freq = 0;
        char ans = 'a';

        for (Character ch : map.keySet()) {

            int val = map.get(ch);

            if (val > freq) {

                freq = Math.max(freq, val);
                ans = ch;
            }
        }

        System.out.println(ans);

        scn.close();
    }

}