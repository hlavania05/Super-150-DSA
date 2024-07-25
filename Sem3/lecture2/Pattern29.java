package Sem1.lecture2;
import java.util.*;

public class Pattern29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n-1;
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
                    System.out.print(row+" ");
                }
                else{
                    System.out.print("0 ");
                }
                k++;
            }
            // next line prepration
            star+=2;
            space--;
            row++;
            System.out.println();
        }
        sc.close();
    }
}
