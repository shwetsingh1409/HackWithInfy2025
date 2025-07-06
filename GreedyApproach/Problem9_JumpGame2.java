package GreedyApproach;

import java.util.Scanner;

public class Problem9_JumpGame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        if (n <= 1) {
            System.out.println(0);
            return;
        }

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            // Time to jump to the next range
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                // If we can't move forward
                if (currentEnd <= i) {
                    System.out.println(-1);  // unreachable
                    return;
                }
            }
        }

        System.out.println(jumps);
    }
}
