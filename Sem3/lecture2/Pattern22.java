package Sem1.lecture2;
import java.util.*;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int space = 0;
        int star = n;
        int lstar = n-1;
        while(i<=5){
            // star
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            //space
            int k = 1;
            while(k<=space){
                System.out.print("  ");
                k++;
            }
            // star
            int l = 1;
            while(l<=lstar){
                System.out.print("* ");
                l++;
            }
            // next line preparation
            if(i==1){
                space++;
            }
            else{
                space+=2;
                lstar--;
            }
            star--;
            i++;
            System.out.println();
        }
        sc.close();
    }
}
