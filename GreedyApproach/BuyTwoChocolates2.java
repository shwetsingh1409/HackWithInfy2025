package GreedyApproach;
import java.util.*;

public class BuyTwoChocolates2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int n = sc.nextInt();
        int[] prices = new int[n];

        System.out.print("Enter prices of chocolates: ");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        System.out.print("Enter total money you have: ");
        int money = sc.nextInt();

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (prices[i] < min1) {
                min2 = min1;
                min1 = prices[i];
            } else if (prices[i] < min2) {
                min2 = prices[i];
            }
        }

        int cost = min1 + min2;

        if (money >= cost) {
            System.out.println("Remaining money: " + (money - cost));
        } else {
            System.out.println("Not enough money. Remaining money: " + money);
        }
    }
}
