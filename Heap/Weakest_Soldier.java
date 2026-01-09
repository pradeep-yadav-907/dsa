package Heap;

import java.util.PriorityQueue;

public class Weakest_Soldier {

    // Static inner class Row
    public static class Row implements Comparable<Row> {
        int soldiers;
        int idx;

        public Row(int soldiers, int rowIndex) {
            this.soldiers = soldiers;
            this.idx = rowIndex;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.soldiers == r2.soldiers) {
                return this.idx - r2.idx;
            } else {
                return this.soldiers - r2.soldiers;
            }
        }
    }

    public static void main(String[] args) {
        int army[][] = { { 1, 0, 0, 0 }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 0 } };
        int k = 2;

        PriorityQueue<Row> pq = new PriorityQueue<>();

        // Row ke hisab se soldiers count karo aur queue mein daalo
        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[i].length; j++) {
                count += army[i][j] == 1 ? 1: 0;
            }
            pq.add(new Row(count, i));
        }

        // k weakest soldiers ke index print karwa lo
        System.out.println(k + " weakest soldiers' rows are:");
        for (int i = 0; i < k; i++) {
            System.out.println(pq.remove().idx);
        }
        
    }
}
