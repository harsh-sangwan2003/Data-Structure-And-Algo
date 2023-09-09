import java.util.Scanner;

public class inverse_number {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int res = 0;
        int count = 1;

        while(num!=0){

            int ld = num%10;
            num/=10;

            res += count*(int)Math.pow(10,ld-1);
            count++;
        }

        System.out.println(res);

        scn.close();
    }
}
