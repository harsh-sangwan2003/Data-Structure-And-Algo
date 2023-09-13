import java.util.Scanner;

public class find_element {

    public static int findIdx(int[] arr, int ele) {

        int idx = 0;

        for (int val : arr) {
            if (val == ele)
                return idx;

            idx++;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();

        int ele = scn.nextInt();

        int res = findIdx(arr, ele);
        System.out.println(res);

        scn.close();
    }
}