package Sem1.lecture2;
import java.util.*;

public class Pattern25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int val = 1;
        int space = n-1;
        int star = 1;
        while(i<=n){
            // space
            int j = 1;
            while(j<=space){
                System.out.print("\t");
                j++;
            }
            // start
            int k=1;
            while(k<=star){
                System.out.print(val+"\t");
                k++;
                val++;
            }
            star+=2;
            space--;
            i++;
            System.out.println();
        }
        sc.close();
    }
}
