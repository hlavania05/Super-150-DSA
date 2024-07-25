package Sem1.lecture1;

public class Max_Min {
    public static void main(String args[]){
        int n = 4;
        int n1 = 8;
        int n2 = 75;

        // check max btw two numbers
        if(n>n1){
            System.out.println(n);
        }
        else{
            System.out.println(n1);
        }

        // check max btw three numbers
        if(n >= n1 && n >= n2){
            System.out.println(n);
        }
        else if(n1 >= n2 && n1 >= n){
            System.out.println(n1);
        }
        else{
            System.out.println(n2);
        }
    }
}
