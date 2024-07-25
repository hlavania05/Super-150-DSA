package Sem1.lecture3;
import java.util.*;

public class Decimal_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int mul=1;
        while(n>0){
            int rem = n%10;
            sum = sum + rem*mul;
            n = n/10;
            mul = mul*2;
        }
        System.out.println(sum);
        sc.close();
    }
}
