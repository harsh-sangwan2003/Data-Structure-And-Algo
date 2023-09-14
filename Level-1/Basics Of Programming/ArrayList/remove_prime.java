import java.util.ArrayList;
import java.util.Scanner;

public class remove_prime {

    public static boolean isPrime(int num) {

        for (int div = 2; div * div <= num; div++) {

            if (num % div == 0)
                return false;
        }

        return true;
    }

    public static void removePrime(ArrayList<Integer> list) {

        for (int i = list.size() - 1; i >= 0; i--) {

            int val = list.get(i);

            if (isPrime(val))
                list.remove(i);
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
            list.add(i, scn.nextInt());

        removePrime(list);

        for (int val : list)
            System.out.print(val + " ");
    }

}
