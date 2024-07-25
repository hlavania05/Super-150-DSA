package Sem1.lecture2;
import java.util.*;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=n-i){
                System.out.print("  ");
                j++;
            }
            int k=1;
            while(k<=i){
                System.out.print("* ");
                k++;
            }
            i++;
            System.out.println();
        }
        sc.close();
    }
}
