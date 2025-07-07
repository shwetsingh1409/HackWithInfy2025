package GreedyApproach;

import java.util.Arrays;
import java.util.Scanner;

public class Problem10_ReducingDishes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] satisfaction = new int[n];

        for (int i = 0; i < n; i++) {
            satisfaction[i] = sc.nextInt();
        }

        Arrays.sort(satisfaction); // Sort in ascending
        int total = 0;
        int prefixSum = 0;

        // Traverse from the end (highest satisfaction)
        for (int i = n - 1; i >= 0; i--) {
            // If adding this dish increases total, keep it
            if (prefixSum + satisfaction[i] > 0) {
                prefixSum += satisfaction[i];
                total += prefixSum;
            } else {
                break;
            }
        }

        System.out.println(total);
    }
    
}
