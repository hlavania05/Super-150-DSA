package Sem1.lecture2;
import java.util.*;

public class Pattern26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int star = 1;
        while(i<=n){
            int j = 1;
            while(j<=n-i){
                System.out.print("\t");
                j++;
            }
            int k=1;
            while(k<=2*star-1){
                System.out.print(k+"\t");
                k++;
            }
            i++;
            star++;
            System.out.println();
        }
        sc.close();
    }
}
