package DP;

public class knapsack {
    public static int knapsack1(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) { // valid
            // include
            int ans1 = val[n - 1] + knapsack1(val, wt, W - wt[n - 1], n - 1);
            // exclude
            int ans2 = knapsack1(val, wt, W, n - 1);
            return Math.max(ans1, ans2);
        } else {
            return knapsack1(val, wt, W, n - 1);
        }

    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 5, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        System.out.println(knapsack1(val, wt, W, val.length));
    }
}
