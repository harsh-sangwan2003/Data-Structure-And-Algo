import java.util.Scanner;

public class subsets {

    public static void printSubsets(int[] arr) {

        for (int i = 0; i < Math.pow(2, arr.length); i++) {

            int temp = i;
            String set = "";

            for (int j = arr.length-1; j >=0; j--) {

                int rem = temp % 2;
                temp /= 2;

                if (rem == 0)
                    set = "-" + " " + set;

                else
                    set = arr[j] + " " + set;

            }

            System.out.println(set);
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        printSubsets(arr);
        scn.close();
    }

}
