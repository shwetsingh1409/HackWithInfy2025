package GreedyApproach;
import java.util.*;
public class Problem2_FractionalKnapsack{
   
        static class Item {
        int value, weight;
        double ratio;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
            this.ratio = (double) value / weight;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of items and knapsack capacity
        System.out.print("Enter number of items and knapsack capacity: ");
        int n = sc.nextInt();
        int W = sc.nextInt();

        Item[] items = new Item[n];

        // Input: value and weight of each item
        System.out.println("Enter value and weight of each item:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            int weight = sc.nextInt();
            items[i] = new Item(value, weight);
        }

        // Sort items by value/weight ratio in descending order
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double totalValue = 0.0;
        int currentWeight = 0;

        // Greedy selection
        for (int i = 0; i < n && currentWeight < W; i++) {
            if (currentWeight + items[i].weight <= W) {
                
                totalValue += items[i].value;
                currentWeight += items[i].weight;
            } else {
                
                int remainingWeight = W - currentWeight;
                totalValue += items[i].ratio * remainingWeight;
                break; // knapsack is full
            }
        }

        // Output result formatted to 2 decimal places
        System.out.printf("Maximum value: %.2f\n", totalValue);
    }
    
}