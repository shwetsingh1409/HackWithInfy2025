package DP;

public class Problem2_NthFibonacciNumber {
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] dp = new int[n + 1];  // dp[i] stores the ith Fibonacci number
        dp[0] = 0;
        dp[1] = 1;

        // Fill dp array iteratively
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n (0 <= n <= 30): ");
        int n = sc.nextInt();

        if (n < 0 || n > 30) {
            System.out.println("Invalid input! Please enter a value between 0 and 30.");
        } else {
            int result = fib(n);
            System.out.println("Fibonacci number at position " + n + " is: " + result);
        }

        sc.close();
    }
}
