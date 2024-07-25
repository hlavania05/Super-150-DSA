package Sem1.lecture2;
import java.util.*;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=n){
                if((j==1 || j==n) || (i==1 || i==n)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                j++;
            }
            i++;
            System.out.println();
        }
        sc.close();
    }
}
