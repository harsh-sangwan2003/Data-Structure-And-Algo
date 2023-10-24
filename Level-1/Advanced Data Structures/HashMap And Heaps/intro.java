import java.util.HashMap;

public class intro {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 135);
        map.put("China", 200);
        map.put("Pak", 30);
        map.put("US", 20);
        map.put("UK", 10);

        System.out.println(map);

        map.put("Nigeria", 5);
        map.put("US", 25);

        System.out.println("India");
        System.out.println(map.get("Ban"));

        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Ban"));

        for (String str : map.keySet()) {

            int val = map.get(str);
            System.out.println(str + " -> " + val);
        }
    }
}