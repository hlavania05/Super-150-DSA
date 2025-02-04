package Sem4.lecture27;

public class Queen_Combination {
    public static void main(String[] args) {
        int n = 4;
        boolean[] board = new boolean[n];
        int tq = 2;
        Permutation(board, tq, 0, "",0);
    }
    //  qpsf --> current no of queen ki kitni queen beth chuki h
    public static void Permutation(boolean[] board, int tq, int qpsf, String ans, int idx){
        if(tq == qpsf){
            System.out.println(ans);
            return;
        }
        for(int i=idx; i<board.length; i++){
            if(board[i] == false){
                board[i] = true;
                Permutation(board, tq, qpsf+1, ans+"b"+i+"q"+qpsf, i+1);
                board[i] = false;  // humne jo bhi change kiya h call lagane se pahle or recursion us cheez ko undo na kr sake to humne base case se vapas aane ke baad us change ko hume undo krna padega
            }
        }
    }
}
