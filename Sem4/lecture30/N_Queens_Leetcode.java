package Sem4.lecture30;
import java.util.*;

public class N_Queens_Leetcode {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        List<List<String>> result = new ArrayList<>();
        print(board, n, 0, result);
        System.out.println(result);
    }
    public static void print(char[][] board, int tq, int row, List<List<String>> result){
        if(tq == 0){
            result.add(new ArrayList<>(Display(board)));
            return;
        }
        for(int col=0; col<board[0].length; col++){
            if(is_it_safe(board, row, col)){
                board[row][col] = 'Q';
                print(board, tq-1, row+1, result);
            }
            board[row][col] = '.';
        }
    }
    public static boolean is_it_safe(char[][] board, int row, int col){
        //  column
        int r = row;
        while(r >= 0){
            if(board[r][col] == 'Q'){
                return false;
            }
            r--;
        }

        //  left dagonal
        r = row;
        int c = col;
        while(r >= 0 && c >= 0){
            if(board[r][c] == 'Q'){
                return false;
            }
            r--;
            c--;
        }

        // right diagonal
        r = row;
        c = col;
        while(r >= 0 && c < board.length){
            if(board[r][c] == 'Q'){
                return false;
            }
            r--;
            c++;
        }
        return true;

    }
    public static List<String> Display(char[][] board){
        List<String> ans = new ArrayList<>();
        for(int i=0; i<board.length; i++){
            String str = "";
            for(int j=0; j<board.length; j++){
                if(board[i][j] != 'Q' && board[i][j] != '.'){
                    str += ".";
                }
                else{
                    str += board[i][j];
                }
            }
            ans.add(str);
        }
        return ans;
    }
}
