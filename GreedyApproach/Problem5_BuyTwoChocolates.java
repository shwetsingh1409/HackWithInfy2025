package GreedyApproach;
import java.util.*;
public class Problem5_BuyTwoChocolates {
    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter number of chocolates: ");
    int n= sc.nextInt();
    int[] prices= new int[n];
    
    System.out.print("Enter prices of chocolates: ");
    for(int i=0; i<n;i++){
        prices[i]= sc.nextInt();
    }
     System.out.print("Enter total money you have: ");
        int money = sc.nextInt();

        Arrays.sort(prices);
        int cost= prices[0] + prices[1];
        if (money >= cost) {
            System.out.println("Remaining money: " + (money - cost));
        } else {
            System.out.println("Not enough money. Remaining money: " + money);
        }
    }
}
