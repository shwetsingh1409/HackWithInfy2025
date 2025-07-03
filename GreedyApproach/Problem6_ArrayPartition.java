package GreedyApproach;

import java.util.Arrays;
import java.util.Scanner;

public class Problem6_ArrayPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of pairs");
        int n = sc.nextInt();
        int[] nums = new int[n*2];

        System.out.println("Enter " + (2 * n) + " numbers:");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i < 2 * n; i += 2) {
            sum += nums[i]; 
        }

        System.out.println("Maximum Sum of Minimum: " + sum);
    }
}
