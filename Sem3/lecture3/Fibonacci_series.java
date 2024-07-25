package Sem1.lecture3;
import java.util.*;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i=0; i<n; i++){
            System.out.println(sum);
            a = b;
            b = sum;
            sum = a+b;
        }
        sc.close();
    }
}
