public class binary_search {

    public static int binarySearch(int[] arr, int tar) {

        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == tar)
                return mid;

            else if (arr[mid] < tar)
                lo = mid + 1;

            else
                hi = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int ele = 71;

        int res = binarySearch(arr, ele);
        System.out.println(res);
    }

}
