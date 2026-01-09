package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priority_of_Queue2 {

    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;

        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank; // ascending order
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("pradeep", 6));
        pq.add(new Student("Abhishek", 4));
        pq.add(new Student("Aman", 2));
        pq.add(new Student("deep", 1));
        pq.add(new Student("Abhay", 5));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }
    }

}
