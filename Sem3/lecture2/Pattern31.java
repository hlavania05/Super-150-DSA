package Sem1.lecture2;
import java.util.*;

public class Pattern31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int j = n;
            while(j>=1){
                if(i==j){
                    System.out.print("* ");
                }
                else{
                    System.out.print(j+" ");
                }
                j--;
            }
            i++;
            System.out.println();
        }
        sc.close();
    }
}
