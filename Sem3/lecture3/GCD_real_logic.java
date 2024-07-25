package Sem1.lecture3;
import java.util.*;

public class GCD_real_logic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor  = sc.nextInt();
        while(dividend % divisor!=0){
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        System.out.println(divisor);
        sc.close();
    }
}
