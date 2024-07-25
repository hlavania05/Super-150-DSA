package Sem1.lecture2;
import java.util.*;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n/2;
        int space = 1;
        int lstar = n/2;
        while(row <= n){
            // star
            int i = 1;
            while(i <= star+1){

                System.out.print("* ");
                i++;
            }
            // space
            int j = 1;
            while(j<space-1){
                System.out.print("  ");
                j++;
            }
            // star
            int k = 1;
            while(k <= lstar){
                System.out.print("* ");
                k++;
            }
            // mirror
            if(row < (n/2+1)){
                star--;
                if(row!=1){
                    lstar--;
                }
                space+=2;
            }
            else{
                if(row!=(n-1)){
                    lstar++;
                }
                star++;
                space-=2;
            }
            row++;
            System.out.println();

        }
        sc.close();
    }
}
