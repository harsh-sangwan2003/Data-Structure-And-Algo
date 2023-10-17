import java.util.ArrayDeque;
import java.util.Queue;

public class intro {

    public static void main(String[] args) {

        Queue<Integer> que = new ArrayDeque<>();

        que.add(10);
        que.add(20);
        que.add(30);

        System.out.println(que);
        System.out.println(que.peek());

        que.remove();
        System.out.println(que);
    }
}