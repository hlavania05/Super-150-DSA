package Sem1.lecture2;
import java.util.*;

public class Pattern23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int space = n-1;
        int star = 1;
        while(i<=5){
            // space
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            // star
            int k=1;
            while(k<=star){
                System.out.print("1 ");
                k++;
            }
            star+=2;
            space--;
            i++;
            System.out.println();
        }
        sc.close();
    }
}
