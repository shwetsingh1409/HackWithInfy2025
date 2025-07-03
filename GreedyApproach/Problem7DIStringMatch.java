package GreedyApproach;

import java.util.Arrays;
import java.util.Scanner;

public class Problem7DIStringMatch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the pattern (string of 'D' and 'I'): ");
        String S= sc.nextLine();
        int n= S.length();
        int low=0;
        int high =n;
        int[] result= new int[n+1];

        for(int i=0; i<n;i++){
            if(S.charAt(i)=='I'){
                result[i]=low;
                low++;
            }else{
                result[i]= high;
                high--;
            }
            
        }
        result[n] = low;
         System.out.println(Arrays.toString(result));
    }
}
