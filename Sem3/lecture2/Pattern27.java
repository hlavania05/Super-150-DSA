package Sem1.lecture2;
import java.util.*;

public class Pattern27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int star = 1;
        int space = n-1;
        while(i<=n){
            // space
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            // number
            int k=1;
            int val = 1;
            while(k<=2*star-1){
                System.out.print(val+" ");
                if(k<star){
                    val++;
                }
                else{
                    val--;
                }
                k++;
            }
            i++;
            star++;
            space--;
            System.out.println();
        }
        sc.close();
    }
}
