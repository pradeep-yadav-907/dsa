package DP;

public class climing_stair {
    public static int countWays(int n) {
        // if (n == 0) {
        // return 1;
        // }
        // if (n < 0) {
        // return 0;
        // }
        // return countWays(n - 1) + countWays(n - 2);
        if (n <= 1) {
            return 1;
        }
        int[] ways = new int[n + 1]; // nth number stair
        ways[0] = 1;
        ways[1] = 1;
        for (int i = 2; i <= n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2] + ways[n - 3]; // count the number of stair
        }
        return ways[n];
    }

    public static int countWaysTab(int n) { // Tabulation method (Bottom-Up DP)
        int[] dp = new int[n + 1]; // dp array
        dp[0] = 1;

        // tabulation loop
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1] + 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];

    }

    public static void main(String[] args) {
        int n = 5;
        // int ways[] = new int[n + 1];
        // Arrays.fill(ways, -1);
        System.out.println(countWays(n));
        System.out.println(countWaysTab(n));

    }
}
