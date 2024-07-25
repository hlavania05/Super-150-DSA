package Sem1.lecture2;
import java.util.*;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int star = 1;
        int lstar = 1;
        int space = (2*n)-3;
        while(i<=n){
            //star
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            //space
            int k=1;
            while(k<=space){
                System.out.print("  ");
                k++;
            }
            // star
            int m=1;
            while(m<=lstar){
                System.out.print("* ");
                m++;
            }
            //next line preparation
            space-=2;
            star++;
            if(i!=(n-1)){
                lstar++;
            }
            i++;
            System.out.println();
        }
        sc.close();
    }
}
