package DP_Assignment_10;
import java.util.*;

public class Longest_Increasing_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[size];
        Arrays.fill(dp, 1);

        for(int i=1; i<size; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[j] < arr[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        System.out.println(max(dp));
    }
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int item : arr){
            max = Math.max(max, item);
        }
        return max;
    }
}
