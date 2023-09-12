import java.util.Scanner;

public class any_base_to_dec {

    public static int baseToDec(int num, int b) {

        int res = 0;
        int mul = 1;

        while(num!=0){

            int rem = num%10;
            num/=10;

            res += rem*mul;
            mul*=b;
        }

        return res;
        
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int b = scn.nextInt();

        int res = baseToDec(num, b);
        System.out.println(res);

        scn.close();
    }
}