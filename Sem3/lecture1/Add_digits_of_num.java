package Sem1.lecture1;

public class Add_digits_of_num {
    public static void main(String[] args) {
        int n = 2468;
        int sum = 0;
        while(n>0){
            sum += n%10;
            n = n/10;
        }
        System.out.println(sum);
    }
}
