package Sem1.lecture1;

public class Palindrom {
    public static void main(String args[]){
        int n = 212;
        System.out.println(Palindrome(n));
    }
    public static Boolean Palindrome(int n){
        int rev = reverse(n);
        if(rev == n){
            return true;
        }
        return false;
    }
    public static int reverse(int num){
        int rev = 0;
        while(num>0){
            int rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        return rev;
    }
}
