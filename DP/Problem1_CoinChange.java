package DP;

public class Problem1_CoinChange {
    public int count(int coins[], int sum) {
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        
        for (int coin : coins) {
            for (int i = coin; i <= sum; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[sum];
    }

    public static void main(String[] args) {
        Problem1_CoinChange CoinChange = new Problem1_CoinChange();
        
        int[] coins = {1, 2, 3};
        int sum = 4;
        
        int ways = CoinChange.count(coins, sum);
        System.out.println("Number of ways to make sum " + sum + " is: " + ways);
    }

}
