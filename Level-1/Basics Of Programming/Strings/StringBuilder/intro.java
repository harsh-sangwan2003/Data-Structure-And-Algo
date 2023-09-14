import java.util.Scanner;

public class intro {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("hello");

        // get
        char ch = sb.charAt(0);
        System.out.println(ch);

        // update
        sb.setCharAt(2, 'y');
        System.out.println(sb);

        // insert
        sb.insert(2, 'z');
        System.out.println(sb);

        // remove
        sb.deleteCharAt(2);
        System.out.println(sb);

        //append
        sb.append('p');

        System.out.println(sb.length());

        scn.close();
    }

}
