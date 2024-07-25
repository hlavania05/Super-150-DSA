package Sem1.lecture1;

public class While_Loop {
    public static void main(String args[]){
        // print natural number from 1 to 5
        int i = 1;
        int n = 5;
        while(i<=n){
            System.out.println(i);
            i++;
        }

        //  sum of n numbers
        int i1 = 1;
        int n1 = 10;
        int sum = 0;
        while(i1<=n1){
            sum += i1;
            i1++;
        }
        System.out.println(sum);
    }
}
