package DP;

import java.util.Scanner;

public class Problem5_ZeroOneKnapsack {
     public static int knapsack(int[] value, int[] weight, int n, int W) {
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
                if (weight[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], value[i - 1] + dp[i - 1][w - weight[i - 1]]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][W]; // Maximum value that can be carried
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items and knapsack capacity: ");
        int n = sc.nextInt();
        int W = sc.nextInt();

        int[] value = new int[n];
        int[] weight = new int[n];

        System.out.println("Enter value and weight of each item:");
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextInt();
            weight[i] = sc.nextInt();
        }

        int maxValue = knapsack(value, weight, n, W);
        System.out.println("Maximum value in 0/1 Knapsack: " + maxValue);
    }
}
