package Sem1.lecture2;
import java.util.*;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1; // row
        int star = n;
        int space = 0;
        while(i<=(2*n-1)){
            // space
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            // star
            int k = 1;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            // next line preparation
            if(i<n){
                space+=2;
                star--;
            }
            else{
                space-=2;
                star++;
            }
            i++;
            System.out.println();
        }
        sc.close();

    }
}
