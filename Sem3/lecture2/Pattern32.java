package Sem1.lecture2;
import java.util.*;

public class Pattern32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int m = 1;
        int star = 1;
        while(row<=(2*n-1)){
            // star
            int j = 1;
            while(j<=star){
                if(j%2==0){
                    System.out.print("* ");
                }
                else{
                    System.out.print(m+" ");
                }
                j++;
            }
            // next line prepration
            if(row<n){
                star+=2;
                m++;
            }
            else{
                star-=2;
                m--;
            }
            row++;
            System.out.println();
        }
        sc.close();
    }
}
