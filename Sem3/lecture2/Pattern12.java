package Sem1.lecture2;
import java.util.*;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=n-i){
                System.out.print("  ");
                j++;
            }
            int k=1;
            while(k<=i){
                if(k%2==0){
                    System.out.print("! ");
                }
                else{
                    System.out.print("* ");
                }
                k++;
            }
            int l = 1;
            while(l<i){
                if((l+i)%2==0){
                    System.out.print("! ");
                }
                else{
                    System.out.print("*");
                }
                l++;
            }
            i++;
            System.out.println();
        }
        sc.close();
    }
}
