package Sem1.lecture2;
import java.util.*;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n/2;
        int star = 1;
        while(row<=n){
            // space
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            // star
            int k = 1;
            while(k<=star){
                if(k==1 || k==star){
                    System.out.print("* ");
                    k++;
                }
                else{
                    System.out.print("  ");
                    k++;
                }
            }
            // next Line prepration
            if(row<(n/2+1)){
                space--;
                star+=2;
            }
            else{
                space++;
                star-=2;
            }
            row++;
            System.out.println();
        }
        sc.close();
    }
}
