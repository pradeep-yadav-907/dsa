package Heap;

import java.util.PriorityQueue;

public class Sliding_Window_maximum {
    static class pair implements Comparable<pair> {
        int val;
        int idx;

        public pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }
        @Override
        public int compareTo(pair p2) {
            // for max heap

            // ascending order
            // return this.val - p2.val;
            // descending order
            return p2.val - this.val;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3; // window size
        int res[] = new int[arr.length - k + 1];

        PriorityQueue<pair> pq = new PriorityQueue<>();

        // first k elements ko queue mein dall do
        for (int i = 0; i < k; i++) {
            pq.add(new pair(arr[i], i));
        }
        res[0] = pq.peek().val;

        // process remaining elements

        for (int i = k; i < arr.length; i++) {
            // remove the element which is out of the window
            while (pq.size() > 0 && pq.peek().idx <= i - k) {
                pq.remove();
            }
            pq.add(new pair(arr[i], i));
            res[i - k + 1] = pq.peek().val;
        }
        // print the result
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}
