package Sem4.lecture24;

public class Board_Path {
    public static void main(String[] args) {
        int n = 3;
        print_path(n, 0, "");
    }
    public static void print_path(int n, int curr, String ans){
        if(curr == n){
            System.out.println(ans);
            return;
        }
        if(curr > n){
            return;
        }
        print_path(n, curr+1, ans+1);
        print_path(n, curr+2, ans+2);
        print_path(n, curr+3, ans+3);
    }
}
