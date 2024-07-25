package Sem4.lecture22;

public class Power {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(pow(a,b));
    }
    public static int pow(int a, int b){
        if(b==0){
            return 1;
        }
        return pow(a, b-1)*a;
    }
}
