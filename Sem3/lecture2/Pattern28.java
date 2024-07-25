package Sem1.lecture2;
import java.util.*;

public class Pattern28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n-1;
        while(row<=n){
            // space
            int j = 1;
            while(j<=space){
                System.out.print("\t");
                j++;
            }
            // star
            int k = 1;
            int m = row;
            while(k<=star){
                System.out.print(m+"\t");
                if(k<row){
                    m++;
                }
                else{
                    m--;
                }
                k++;
            }
            // next line prepration
            space--;
            star+=2;
            row++;
            System.out.println();
        }
        sc.close();
    }
}
