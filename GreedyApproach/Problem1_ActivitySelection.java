package GreedyApproach;

import java.util.*;
public class Problem1_ActivitySelection {
    static class Activity {
        int start, end;
        Activity(int s, int e) {
            start = s;
            end = e;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of activities
        System.out.print("Enter number of activities: ");
        int n = sc.nextInt();

        Activity[] activities = new Activity[n];

        // Input: each activity's start and end time
        System.out.println("Enter start and end times:");
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            activities[i] = new Activity(start, end);
        }

        // Step 1: Sort by end time
        Arrays.sort(activities, (a, b) -> Integer.compare(a.end, b.end));

        // Step 2: Apply greedy selection
        int count = 1; // Always select the first activity
        int lastEnd = activities[0].end;

        for (int i = 1; i < n; i++) {
            if (activities[i].start >= lastEnd) {
                count++;
                lastEnd = activities[i].end;
            }
        }

        // Output
        System.out.println("Maximum number of non-overlapping activities: " + count);
    }
}
