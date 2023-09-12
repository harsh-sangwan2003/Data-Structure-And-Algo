public class new_arr {

    public static void main(String[] args) {

        int[] arr1 = new int[5];
        arr1[0] = 33;
        arr1[1] = 47;
        arr1[2] = 59;
        arr1[3] = 67;
        arr1[4] = 98;

        int[] arr2 = arr1;
        arr2[2] = 590;

        for (int i = 0; i < arr1.length; i++)
            System.out.println(arr1[i]);
    }

}
