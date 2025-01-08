package DP_Assignment_10;
import java.util.*;

public class Climb_Stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(func(n, dp, 0));
    }
    public static int func(int n, int[] dp, int i){
        if(i > n){
            return 0;
        }
        if(i == n){
            return 1;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int one = func(n, dp, i+1);
        int two = func(n, dp, i+2);
        return dp[i] = one + two;
    }
}
