package Sem1.lecture2;
import java.util.*;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int i = 1;
        int space = row-1;
        int star = row;
        while(i<=(2*row-1)){
            // space
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            // star
            int k = 1;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            // next line preparation
            if(i<row){
                space--;
                star--;
            }
            else{
                space++;
                star++;
            }
            i++;
            System.out.println();
        }

        sc.close();
    }
}
