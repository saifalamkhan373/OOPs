public class KnapsackProblem {
    public int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity];
    }

    public static void main(String[] args) {
        int[] weights = { 2, 2, 3, 5 };
        int[] values = { 1, 2, 5, 9 };
        int capacity = 6;
        KnapsackProblem knapsackSolver = new KnapsackProblem();
        int maxValue = knapsackSolver.knapsack(weights, values, capacity);
        System.out.println("Maximum Value: " + maxValue);
    }
}
