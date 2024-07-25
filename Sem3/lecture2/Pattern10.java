package Sem1.lecture2;
import java.util.*;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int star = (2*n)-1;
        while(i<=n){
            //space
            int j = 1;
            while(j<i){
                System.out.print("  ");
                j++;
            }
            //star
            int k=0;
            while(k<star){
                System.out.print("* ");
                k++;
            }
            star-=2;
            i++;
            System.out.println();
        }
        sc.close();
    }
}
