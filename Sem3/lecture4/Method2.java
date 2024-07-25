package Sem1.lecture4;

public class Method2 {
    public static void main(String[] args) {
        System.out.println("hey");
    }
    public static int add(){
        int a = 5;
        int b = 4;
        sub();
        int c = a+b;
        return c;
    }
    public static void sub(){
        int a = 9;
        int b = 2;
        System.out.println(a-b);
    }
}
