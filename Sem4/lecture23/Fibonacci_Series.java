package Sem4.lecture23;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if(n==1 || n==0){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
