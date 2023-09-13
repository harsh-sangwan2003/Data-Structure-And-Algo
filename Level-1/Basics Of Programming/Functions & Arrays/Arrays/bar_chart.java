import java.util.Scanner;

public class bar_chart {

    public static int findMax(int[] arr) {

        int max_val = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max_val)
                max_val = arr[i];
        }

        return max_val;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int max_val = findMax(arr);

        for (int r = max_val; r >= 0; r--) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[j] > r)
                    System.out.print("*" + " ");

                else
                    System.out.print("  ");
            }

            System.out.println();
        }

        scn.close();
    }

}
