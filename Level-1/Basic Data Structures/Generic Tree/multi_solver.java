import java.util.ArrayList;
import java.util.Stack;

public class multi_solver {

    public static class Node {

        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static Node construct(int[] arr) {

        Stack<Node> st = new Stack<>();

        Node root = null;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == -1)
                st.pop();

            else {

                Node node = new Node();
                node.data = arr[i];

                if (st.size() > 0) {

                    st.peek().children.add(node);
                }

                else
                    root = node;

                st.push(node);
            }
        }

        return root;
    }

    public static void display(Node node) {

        String str = node.data + " -> ";

        for (Node child : node.children)
            str += child.data + ", ";

        str += ".";
        System.out.println(str);

        for (Node child : node.children)
            display(child);
    }

    static int size;
    static int max;
    static int min;
    static int height;

    public static void multisolver(Node node, int depth) {

        size++;
        max = Math.max(max, node.data);
        min = Math.min(min, node.data);
        height = Math.max(height, depth);

        for (Node child : node.children)
            multisolver(child, depth + 1);
    }

    public static void main(String[] args) {

        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, -80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };

        Node root = construct(arr);

        size = 0;
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        height = 0;

        multisolver(root, 0);

        System.out.println(size);
        System.out.println(max);
        System.out.println(min);
        System.out.println(height);

    }
}
