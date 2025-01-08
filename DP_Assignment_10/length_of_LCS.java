package DP_Assignment_10;
import java.util.*;

public class length_of_LCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int l1 = s.length();
        int l2 = t.length();
        int[][] dp = new int[l1][l2];
        for(int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        System.out.println(LCS(s, t, 0, 0, dp, l1, l2));

    }
    public static int LCS(String s, String t, int i, int j, int[][] dp, int l1, int l2){
        if(i == l1 || j == l2){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans = 0;
        if(s.charAt(i) == t.charAt(j)){
            ans = 1 + LCS(s, t, i+1, j+1, dp, l1, l2);
        }
        else{
            int f = LCS(s, t, i+1, j, dp, l1, l2);
            int g = LCS(s, t, i, j+1, dp, l1, l2);
            ans = Math.max(f, g);
        }
        return dp[i][j] = ans;
    }
}
