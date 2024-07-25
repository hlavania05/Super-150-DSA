package Sem4.lecture22;

public class Print_in_decreament_order {
    public static void main(String[] args) {
        int n = 5;
        PD(n);
    }
    public static void PD(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        PD(n-1);
    }
}
