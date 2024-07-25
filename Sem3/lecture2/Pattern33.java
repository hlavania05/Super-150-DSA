package Sem1.lecture2;
import java.util.*;

public class Pattern33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n-1;
        int star = 1;
        int row = 1;
        while(row<=n){
            // space
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            if(row==1){
                System.out.print("0 ");
            }
            else{
                // left triangle
                int k1 = 1;
                int k = n-row+1;
                while(k1<=(star/2)){
                    System.out.print((k++)+" ");
                    k1++;
                }

                // middle zero
                System.out.print("0 ");

                // right triangle
                int m1 = 1;
                int m = k-1;
                while(m1<=(star/2)){
                    System.out.print((m--)+" ");
                    m1++;
                }
            }
            // next line prepration
            row++;
            space--;
            star+=2;
            System.out.println();
        }
        sc.close();
    }
}
