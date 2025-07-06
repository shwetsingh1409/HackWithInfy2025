package GreedyApproach;
import java.util.*;
public class Problem8_JumpGame {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n;i++){
            nums[i]= sc.nextInt();
        }
        int farthest = 0;
        boolean canReach = true;
        for (int i = 0; i < n; i++) {
            if (i > farthest) {
                canReach = false;
                break;
            }
            farthest = Math.max(farthest, i + nums[i]);
        }
        System.out.println(canReach);
    }
}
