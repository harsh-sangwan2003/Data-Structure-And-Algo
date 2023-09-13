public class first_last_idx {

    public static int firstIndex(int[] arr, int tar) {

        int lo = 0, hi = arr.length - 1, fi = 0;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == tar) {

                fi = mid;
                hi = mid - 1;
            }

            else if (arr[mid] < tar) {
                lo = mid + 1;

            }

            else {
                hi = mid - 1;

            }
        }

        return fi;
    }

    public static int lastIndex(int[] arr, int tar) {

        int lo = 0, hi = arr.length - 1, li = 0;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == tar) {

                li = mid;
                lo = mid + 1;
            }

            else if (arr[mid] < tar) {
                lo = mid + 1;

            }

            else {
                hi = mid - 1;

            }
        }

        return li;
    }

    public static void main(String[] args) {

        int[] arr = { 10, 20, 20, 20, 50, 60, 60, 60, 70, 80 };
        int ele = 60;

        int fi = firstIndex(arr, ele);
        int li = lastIndex(arr, ele);

        System.out.println(fi);
        System.out.println(li);
    }

}
