package DP_Assignment_10;
import java.util.*;

public class Smart_Robber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int x=0; x<tc; x++){
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int i=0; i<size; i++){
                arr[i] = sc.nextInt();
            }
            int[] dp = new int[arr.length];
            Arrays.fill(dp, -1);
            System.out.println(Robber(arr, dp, 0));
        }
    }
    public static int Robber(int[] arr, int[] dp, int i){
        if(i >= arr.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int take = arr[i] + Robber(arr, dp, i+2);
        int nottake = Robber(arr, dp, i+1);
        dp[i] = Math.max(take, nottake);
        return dp[i];

    }
}
