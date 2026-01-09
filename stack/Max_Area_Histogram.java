package stack;

import java.util.Stack;

public class Max_Area_Histogram {

    public static int maxArea(int arr[]) {
        int n = arr.length;
        int nextsr[] = new int[n]; // Next Smaller Right
        int nextsl[] = new int[n]; // Next Smaller Left
        Stack<Integer> s = new Stack<>();

        // Next Smaller Right
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextsr[i] = n;
            } else {
                nextsr[i] = s.peek();
            }
            s.push(i);
        }

        // Next Smaller Left
        s = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextsl[i] = -1;
            } else {
                nextsl[i] = s.peek();
            }
            s.push(i);
        }

        // Find max area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int height = arr[i];
            int width = nextsr[i] - nextsl[i] - 1;
            int area = height * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println("Maximum Area in Histogram = " + maxArea(arr));
    }
}
