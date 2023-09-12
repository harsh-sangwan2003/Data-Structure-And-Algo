import java.util.Scanner;

public class any_base_to_any_base {

    public static int anyToAny(int num, int b1, int b2) {

        num = anyToDec(num, b1);
        int res = decToAny(num, b2);

        return res;
    }

    public static int decToAny(int num, int b){

        int res = 0;
        int mul = 1;

        while(num!=0){

            int rem = num%b;
            num/=b;

            res += rem*mul;
            mul*=10;
        }

        return res;
    }

    public static int anyToDec(int num, int b) {

        int res = 0;
        int mul = 1;

        while (num != 0) {

            int ld = num % 10;
            num /= 10;

            res += ld * mul;
            mul *= b;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        int res = anyToAny(num, b1, b2);

        System.out.println(res);

        scn.close();
    }
}