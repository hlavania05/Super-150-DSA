package Sem4.lecture22;

public class Print_in_Increment_order {
    public static void main(String[] args) {
        int n = 5;
        Print_Inc(n);
    }
    public static void Print_Inc(int n){
        if(n==0){
            return;
        }
        Print_Inc(n-1);
        System.out.println(n);
    }
}
