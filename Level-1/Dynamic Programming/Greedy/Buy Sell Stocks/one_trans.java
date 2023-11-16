import java.util.*;

public class one_trans {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        arr[i] = scn.nextInt();

        int leastp = Integer.MAX_VALUE;
        int profit = 0;

        for(int val : arr){

            leastp = Math.min(leastp, val);

            int currp = val - leastp;

            profit = Math.max(currp, profit);
        }

        System.out.println(profit);
        
        scn.close();
    }

}