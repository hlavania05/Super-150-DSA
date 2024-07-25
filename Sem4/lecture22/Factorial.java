package Sem4.lecture22;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n, 1));
    }

    // Head --> stack se neeche aate time bhi calculation hogi
    // public static int fact(int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     return fact(n-1)*n;
    // }

    // Tail --> stack se neeche aate time calculation nhi hogi
    public static int fact(int n, int ans){
        if(n==0){
            return ans;
        }
        return fact(n-1, ans*n);
    }

    // ---------Time Complexity -------------
    // T(n) = k
}
