import java.util.Scanner;

public class take_input {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // If both inputs are to to taken -> int & string
        int n = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine();

        System.out.println("Hello " + name + " here is the counting: ");

        for (int i = 1; i <= n; i++)
            System.out.println(i);

        scn.close();
    }
}
