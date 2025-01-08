package DP_Assignment_10;
import java.util.*;

public class Minimum_Path_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] grid = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println(func(grid, 0, 0));


    }
    public static int func(int[][] grid, int i, int j){
        if(i == grid.length-1 && j == grid[0].length-1){
            return grid[i][j];
        }
        if(i >= grid.length || j >= grid[0].length){
            return Integer.MAX_VALUE;
        }
        int right = func(grid, i, j+1);
        int down = func(grid, i+1, j);
        return grid[i][j] + Math.min(right, down);
    }
}
