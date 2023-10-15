import java.io.*;
import java.util.*;

public class merge_overlapping {

    public static void main(String[] args) throws Exception {

        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time
        Pair[] pairs = new Pair[arr.length];
        for (int i = 0; i < arr.length; i++) {

            pairs[i] = new Pair(arr[i][0], arr[i][1]);
        }

        Arrays.sort(pairs);

        Stack<Pair> st = new Stack<>();

        for (int i = 0; i < pairs.length; i++) {

            if (i == 0)
                st.push(pairs[i]);

            else {

                if (pairs[i].st <= st.peek().et)
                    st.peek().et = Math.max(st.peek().et, pairs[i].et);

                else
                    st.push(pairs[i]);
            }
        }

        Stack<Pair> res = new Stack<>();

        while (st.size() != 0) {

            res.push(st.pop());
        }

        while (res.size() != 0) {

            Pair p = res.pop();
            System.out.println(p.st + " " + p.et);
        }
    }

    public static class Pair implements Comparable<Pair> {

        int st;
        int et;

        Pair(int st, int et) {
            this.st = st;
            this.et = et;
        }

        public int compareTo(Pair o) {

            if (this.st != o.st)
                return this.st - o.st;

            else
                return this.et - o.et;
        }
    }

}