package GreedyApproach;

import java.util.Arrays;
import java.util.Scanner;

public class Problem3_MinimumNumberOfCoins {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter amount");
        int amount= sc.nextInt();
        System.out.println("Enter no. of coin");
        int n= sc.nextInt();
        int[] coins= new int[n];
        for(int i=0; i<n;i++){
            coins[i]= sc.nextInt();
        }
        Arrays.sort(coins);
        int count =0;
        System.out.println("Coin Used ");
        for(int i =n-1;i>=0;i--){
            while(amount>= coins[i]){
                amount -= coins[i];
                count++;
                System.out.println(coins[i]+ " ");
            }
        }
        System.out.println("\nMinimum coins needed: " + count);
    }
}
