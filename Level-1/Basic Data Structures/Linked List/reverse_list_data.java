import java.io.BufferedReader;
import java.io.InputStreamReader;

public class reverse_list_data {

    public static class Node {

        int data;
        Node next;
    }

    public static class LinkedList {

        Node head;
        Node tail;
        int size;

        public void addLast(int val) {

            Node node = new Node();
            node.data = val;
            node.next = null;

            if (size == 0) {

                head = tail = node;
            }

            else {

                tail.next = node;
                tail = node;
            }

            size++;

        }

        public int size() {

            return this.size;
        }

        public void display() {

            Node temp = head;

            while (temp != null) {

                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }

        public void removeFirst() {

            if (this.size == 0)
                System.out.println("List is empty");

            else if (this.size == 1) {

                head = tail = null;
            }

            else {

                head = head.next;
            }

            size--;
        }

        public int getFirst() {

            if (this.size == 0) {

                System.out.println("List is empty");
                return -1;
            }

            return head.data;
        }

        public int getLast() {

            if (this.size == 0) {

                System.out.println("List is empty");
                return -1;
            }

            return tail.data;
        }

        public int getAt(int idx) {

            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }

            if (idx < size || idx >= size) {
                System.out.println("Invalid arguments");
                return -1;
            }

            Node temp = head;

            for (int i = 0; i < idx; i++)
                temp = temp.next;

            return temp.data;
        }

        public void addFirst(int val) {

            Node node = new Node();
            node.data = val;

            if (this.size == 0) {

                node.next = null;
                head = tail = node;
            }

            else {

                node.next = head;
                head = node;
            }

            size++;
        }

        public void addAt(int idx, int val) {

            if (idx < 0 || idx > size)
                System.out.println("Invalid arguments");

            else if (idx == 0)
                addFirst(val);

            else if (idx == size)
                addLast(val);

            else {

                Node temp = head;

                for (int i = 0; i < idx - 1; i++)
                    temp = temp.next;

                Node node = new Node();
                node.data = val;

                node.next = temp.next;
                temp.next = node;

                size++;
            }

        }

        public void removeLast() {

            if (this.size == 0) {
                System.out.println("List is empty");
                return;
            }

            else if (this.size == 1) {
                head = tail = null;
            }

            else {

                Node temp = head;
                for (int i = 0; i < this.size - 2; i++)
                    temp = temp.next;

                tail = temp;
                temp.next = null;
            }

            size--;

        }

        public Node getNodeAt(int idx) {

            Node temp = head;

            for (int i = 0; i < idx; i++)
                temp = temp.next;

            return temp;

        }

        public void reverseDI() {

            int li = 0;
            int ri = this.size-1;

            while(li<ri){

                Node left = this.getNodeAt(li);
                Node right = this.getNodeAt(ri);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                li++;
                ri--;
            }
        }
    }

    public static void testList(LinkedList list) {
        for (Node temp = list.head; temp != null; temp = temp.next) {
            System.out.println(temp.data);
        }
        System.out.println(list.size);

        if (list.size > 0) {
            System.out.println(list.tail.data);
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();

        String str = br.readLine();

        while (str.equals("quit") == false) {

            if (str.startsWith("addLast")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            } else if (str.startsWith("size")) {
                System.out.println(list.size());
            } else if (str.startsWith("display")) {
                list.display();
            } else if (str.startsWith("removeFirst")) {
                list.removeFirst();
            } else if (str.startsWith("getFirst")) {
                int val = list.getFirst();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("getLast")) {
                int val = list.getLast();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("getAt")) {
                int idx = Integer.parseInt(str.split(" ")[1]);
                int val = list.getAt(idx);
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("addFirst")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addFirst(val);
            } else if (str.startsWith("addAt")) {
                int idx = Integer.parseInt(str.split(" ")[1]);
                int val = Integer.parseInt(str.split(" ")[2]);
                list.addAt(idx, val);
            } else if (str.startsWith("removeLast")) {
                list.removeLast();
            } else if (str.startsWith("reverseDI")) {
                list.reverseDI();
            }
            str = br.readLine();

        }

        testList(list);
    }
}