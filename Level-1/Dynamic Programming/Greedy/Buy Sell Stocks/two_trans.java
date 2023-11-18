import java.util.*;

public class two_trans {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int mpist = 0, leastsf = 0;
        int[] dpl = new int[arr.length];

        for(int i=0; i<arr.length; i++){

            if(arr[i]<leastsf)
            leastsf = arr[i];

            mpist = arr[i]-leastsf;

            if(mpist>dpl[i-1])
            dpl[i] = mpist;

            else
            dpl[i] = dpl[i-1];
        }

        int mpibt = 0, maxat = arr[arr.length-1];
        int[] dpr = new int[arr.length];

        for(int i=arr.length-2; i>=0; i--){

            if(arr[i]>maxat)
            maxat = arr[i];

            mpibt = maxat-arr[i];

            if(mpibt>dpr[i+1])
            dpr[i] = mpibt;

            else 
            dpr[i] = dpr[i+1];
        }

        int op = 0;

        for(int i=0; i<arr.length; i++){

            if(dpl[i]+dpr[i]>op)
            op = dpl[i]+dpr[i];
        }

        System.out.println(op);

        scn.close();
    }

}