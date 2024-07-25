package Sem1.lecture4;
import java.util.*;

public class Armstrong_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
        sc.close();
    }
    public static int length(int a){
        int l = 0;
        while(a>0){
            a = a/10;
            l++;
        }
        return l;
    }
    public static boolean isArmstrong(int n){
        int sum = 0;
        int num = n;
        int l = length(n);
        while(n>0){
            int rem = n%10;
            sum += (int)Math.pow(rem,l);
            n = n/10;
        }
        if(sum==num){
            return true;
        }
        else{
            return false;
        }
    }
}
