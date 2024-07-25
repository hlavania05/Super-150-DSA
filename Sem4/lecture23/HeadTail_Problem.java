package Sem4.lecture23;

public class HeadTail_Problem {
    public static void main(String[] args) {
        int n = 3;
        print(n, "");
    }
    // static int count = 0;
    public static void print(int n, String ans){
        if( n==0 ){
            System.out.println(ans);
            // count++;
            return;
        }
        print(n-1, ans+"H");
        print(n-1, ans+"T");
    }
}
