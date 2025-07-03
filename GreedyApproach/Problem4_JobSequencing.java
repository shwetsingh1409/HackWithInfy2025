package GreedyApproach;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4_JobSequencing {
    static class Job {
        String id;
        int deadline, profit;

        Job(String id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. Of Job");
        int n = sc.nextInt();

        Job[] jobs = new Job[n];
        for (int i = 0; i < n; i++) {
            String id = sc.next();
            int deadline = sc.nextInt();
            int profit = sc.nextInt();
            jobs[i] = new Job(id, deadline, profit);
        }

        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        String[] slots = new String[maxDeadline + 1];
        boolean[] occupied = new boolean[maxDeadline + 1];

        int totalProfit = 0;
        for (Job job : jobs) {
            for (int j = job.deadline; j >= 1; j--) {
                if (!occupied[j]) {
                    occupied[j] = true;
                    slots[j] = job.id;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        System.out.println("Maximum Profit: " + totalProfit);
    }
}
