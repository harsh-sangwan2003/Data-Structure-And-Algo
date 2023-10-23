import java.util.Stack;

public class intro {

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {

            this.data = data;
            this.left = left;
            this.right = right;
        }

    }

    public static class Pair {

        Node node;
        int state;

        Pair(Node node, int state) {

            this.node = node;
            this.state = state;
        }
    }

    public static void main(String[] args) {

        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };

        Stack<Pair> st = new Stack<>();
        Node root = new Node(arr[0], null, null);

        Pair rPair = new Pair(root, 1);
        st.push(rPair);

        int idx = 0;

        while (st.size() != 0) {

            Pair top = st.peek();

            if (top.state == 1) {

                idx++;
                if (arr[idx] != null) {

                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                }

                else {

                    top.node.left = null;
                }
            }

            else if (top.state == 2) {

                idx++;
                if (arr[idx] != null) {

                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                }

                else {

                    top.node.right = null;
                }
            }

            else {

                st.pop();
            }
        }
    }
}