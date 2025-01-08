package DP_Assignment_10;
import java.util.*;

public class Coin_Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int[][] dp = new int[size][amt+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        System.out.println(coinChange(arr, 0, amt, dp));
    }
    public static int coinChange(int[] arr, int i, int amt, int[][] dp){
        if(amt == 0){
            return 1;
        }
        if(i == arr.length){
            return 0;
        }
        if(dp[i][amt] != -1){
            return dp[i][amt];
        }
        int take = 0;
        int notTake = 0;
        if(arr[i] <= amt){
            take = coinChange(arr, i, amt - arr[i], dp);
        }
        notTake = coinChange(arr, i+1, amt, dp);
        return dp[i][amt] = take + notTake;
    }
}
