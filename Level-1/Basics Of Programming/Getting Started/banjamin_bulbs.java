import java.util.Scanner;

public class banjamin_bulbs {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        for (int i = 1; i * i <= num; i++) {

            System.out.println(i * i);
        }

        scn.close();
    }
}
