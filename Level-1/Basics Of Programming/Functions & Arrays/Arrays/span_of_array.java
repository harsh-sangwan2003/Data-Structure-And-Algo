import java.util.Scanner;

public class span_of_array {

    public static int span(int[] arr) {

        if (arr == null)
            return -1;

        int max_value = arr[0];
        int min_value = arr[0];

        for (int val : arr) {

            if (val > max_value)
                max_value = val;

            if (val < min_value)
                min_value = val;
        }

        return max_value - min_value;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        int res = span(arr);
        System.out.println(res);

        scn.close();
    }
}