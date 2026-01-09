package Heap;

import java.util.PriorityQueue;

public class Connect_N_Ropes {
    public static void main(String[] args) {
        int ropes[] = { 2, 3, 3, 4, 6 };
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        int cost = 0;
        while (pq.size() > 1) {
            int first = pq.remove();
            int second = pq.remove();
            cost += first + second;
            pq.add(first + second);

        }

        System.out.println("cost: of connecting n ropes = " + cost);
        System.out.println("cost: of connecting n ropes = " + pq.peek());

        // 2 + 3 + 3 + 4 + 6 = 18
    }
}
