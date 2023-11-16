import java.util.*;

public class infinite_trans {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        arr[i] = scn.nextInt();

        int bd = 0, sd = 0, p = 0;;

        for(int i=0; i<arr.length; i++){

            if(arr[i]>=arr[i-1])
            sd++;

            else{

                p+=arr[sd]-arr[bd];
                bd = sd = i;
            }
        }
        
        System.out.println(p);
        
        scn.close();
    }

}