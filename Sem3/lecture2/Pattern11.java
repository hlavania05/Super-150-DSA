package Sem1.lecture2;
import java.util.*;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int k = 1;
            while(k<=n-i){
                System.out.print("  ");
                k++;
            }
            int j = 1;
            while(j<=i){
                System.out.print(" *  ");
                j++;
            }
            i++;
            System.out.println();
        }
        sc.close();
    }
}
