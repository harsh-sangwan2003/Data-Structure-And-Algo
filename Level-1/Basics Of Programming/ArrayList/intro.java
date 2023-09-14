import java.util.ArrayList;

public class intro {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " -> " + list.size());

        // add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list + " -> " + list.size());

        // get
        System.out.println(list.get(1));

        // set
        list.set(1, 1000);
        System.out.println(list + " -> " + list.size());

        // remove
        list.remove(1);
        System.out.println(list + " -> " + list.size());

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("Cello");
        System.out.println(list2 + " -> " + list2.size());
    }
}