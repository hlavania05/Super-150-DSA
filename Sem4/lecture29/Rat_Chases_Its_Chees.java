package Sem4.lecture29;
import java.util.*;

public class Rat_Chases_Its_Chees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] grid = new char[n][m];
        for(int i=0; i<n; i++){
            String s = sc.next();
            grid[i] = s.toCharArray();
        }

        int[][] ans = new int[n][m];
        print(grid, 0, 0, ans);

        if(val == false){
            System.out.println("NO PATH FOUND");
        }
        sc.close();
    }
    static boolean val = false;

    public static void print(char[][] grid, int cr, int cc, int[][] ans){
        if(val == true){
            return;
        }
        if(cr == grid.length-1 && cc == grid[0].length-1 && grid[cr][cc] == 'O'){
            ans[cr][cc] = 1;
            val = true;
            Display(ans);
            return;
        }
        if(cr < 0 || cr >= grid.length || cc < 0 || cc >= grid[0].length || grid[cr][cc] == 'X'){
            return;
        }
        grid[cr][cc] = 'X';
        ans[cr][cc] = 1;
        print(grid, cr-1, cc, ans);   // up
        print(grid, cr, cc-1, ans);   // left direction
        print(grid, cr+1, cc, ans);   // down
        print(grid, cr, cc+1, ans);   // right
        ans[cr][cc] = 0;
        grid[cr][cc] = 'O';
    }
    public static void Display(int[][] arr){
        for(int[] ll : arr){
            for(int item : ll){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
