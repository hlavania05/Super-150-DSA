package Sem4.lecture24;

public class Move_In_Matrix {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        get_path(m-1, n-1, 0, 0, "");

    }
    public static void get_path(int m, int n, int a, int b, String ans){
        if(a==m && b==n){
            System.out.println(ans);
            return;
        }
        if(a>m || b>n){
            return;
        }
        get_path(m, n, a, b+1, ans+"H");
        get_path(m, n, a+1, b, ans+"V");
    }
}
