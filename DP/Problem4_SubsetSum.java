package DP;

import java.util.Scanner;

public class Problem4_SubsetSum {

    public static boolean isSubsetSum(int[] arr, int n, int target) {
        boolean[][] dp = new boolean[n + 1][target + 1];

        // Base Case: 0 sum is always possible (by picking nothing)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Fill the table
        for (int i = 1; i <= n; i++) {
            for (int t = 1; t <= target; t++) {
                if (t >= arr[i - 1]) {
                    // Pick or skip
                    dp[i][t] = dp[i - 1][t] || dp[i - 1][t - arr[i - 1]];
                } else {
                    // Only skip
                    dp[i][t] = dp[i - 1][t];
                }
            }
        }

        return dp[n][target];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array (n): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        boolean result = isSubsetSum(arr, n, target);
        System.out.println("Subset with sum " + target + " exists? " + result);
    }
}

