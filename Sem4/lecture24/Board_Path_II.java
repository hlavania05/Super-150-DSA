package Sem4.lecture24;

public class Board_Path_II {
    public static void main(String[] args) {
        int n = 5;
        int choice = 5;
        print_path(n, 0, "", choice);
    }
    public static void print_path(int n, int curr, String ans, int choice){
        if(curr == n){
            System.out.println(ans);
            return;
        }
        if(curr > n){
            return;
        }
        for(int i=1; i<=choice; i++){
            print_path(n, curr+i, ans+i, choice);
        }
    }
}
