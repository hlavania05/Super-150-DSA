package Sem5.lecture57;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_II {
    public static void main(String[] args) {
        int[][] grid = {{}};
        int ans = Integer.MAX_VALUE;
        int[][] dp = new int[grid.length][grid.length];
        for(int[] a : dp){
            Arrays.fill(a, -100000);
        }
        for(int i=0; i<grid[0].length; i++){
            ans = Math.min(ans, Falling_path_sum(grid, 0, i, dp));
        }
        System.out.println(ans);
    }
    public static int Falling_path_sum(int[][] grid, int cr, int cc, int[][] dp){
        if(cr == grid.length-1){
            return grid[cr][cc];
        }
        if(dp[cr][cc] != -100000){
            return dp[cr][cc];
        }
        int ans = Integer.MAX_VALUE;
        for(int col = 0; col<grid[0].length; col++){
            if(col == cc){
                continue;
            }
            ans = Math.min(ans, Falling_path_sum(grid, cr+1, col, dp));
        }
        return dp[cr][cc] = ans += grid[cr][cc];

    }
}
