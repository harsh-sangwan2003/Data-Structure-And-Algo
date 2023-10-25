import java.util.PriorityQueue;

public class comparableVscomparator {

    static class Student implements Comparable<Student> {

        int rno;
        int ht;
        int wt;

        Student(int rno, int ht, int wt) {

            this.rno = rno;
            this.ht = ht;
            this.wt = wt;
        }

        public int compareTo(Student o) {

            return this.rno - o.rno;
        }

        public String toString() {

            return "rno = " + this.rno + "ht = " + this.ht + "wt = " + this.wt;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student(10, 180, 81));
        pq.add(new Student(2, 185, 85));
        pq.add(new Student(12, 170, 84));
        pq.add(new Student(18, 179, 88));
        pq.add(new Student(7, 182, 82));

        while (pq.size() > 0) {

            System.out.println(pq.peek());
            pq.remove();
        }
    }
}