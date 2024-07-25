package Sem1.lecture1;

public class Reverse_Integer {
    public static void main(String[] args) {
        int num = 28412;
        int rev = 0;
        while(num != 0){
            int rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        System.out.println(rev);
    }
}
