package Heap;

import java.util.ArrayList;

public class min_heap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            int index = arr.size() - 1;
            int par = (index - 1) / 2;

            while (index > 0 && arr.get(index) < arr.get(par)) {
                int temp = arr.get(index);
                arr.set(index, arr.get(par));
                arr.set(par, temp);

                index = par;
                par = (index - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int index) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int minIndex = index;

            if (left < arr.size() && arr.get(minIndex) > arr.get(left)) {
                minIndex = left;
            }

            if (right < arr.size() && arr.get(minIndex) > arr.get(right)) {
                minIndex = right;
            }

            if (minIndex != index) {
                // swap
                int temp = arr.get(index);
                arr.set(index, arr.get(minIndex));
                arr.set(minIndex, temp);

                // call heapify on the minIndex
                heapify(minIndex);
            }
        }

        public int remove() {
            int data = arr.get(0);
            int lastIdx = arr.size() - 1;

            arr.set(0, arr.get(lastIdx));
            arr.remove(lastIdx);

            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;

        }
    }

    public static void main(String[] args) {
        Heap pq = new Heap();

        pq.add(3);
        pq.add(4);
        pq.add(9);
        pq.add(5);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();

        }
    }

}
