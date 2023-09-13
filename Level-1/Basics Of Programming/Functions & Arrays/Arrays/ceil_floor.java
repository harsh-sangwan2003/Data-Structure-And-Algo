public class ceil_floor {

    public static void binarySearch(int[] arr, int tar) {

        int lo = 0, hi = arr.length - 1, ceil = 0, floor = 0;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == tar) {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }

            else if (arr[mid] < tar) {
                lo = mid + 1;
                floor = arr[mid];
            }

            else {
                hi = mid - 1;
                ceil = arr[mid];
            }
        }

        System.out.println(ceil);
        System.out.println(floor);
    }

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int ele = 71;

        binarySearch(arr, ele);
    }

}
