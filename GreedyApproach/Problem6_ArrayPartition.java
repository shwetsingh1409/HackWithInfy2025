package GreedyApproach;

import java.util.Arrays;
import java.util.Scanner;

public class Problem6_ArrayPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of pairs");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + (n) + " numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i < n; i += 2) {
            sum += nums[i]; 
        }

        System.out.println("Maximum Sum of Minimum: " + sum);
    }
}
