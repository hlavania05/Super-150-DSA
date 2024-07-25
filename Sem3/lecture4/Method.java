package Sem1.lecture4;

public class Method {
    public static void main(String[] args) {
        System.out.println("Heyy");
        add();
    }
    public static void add(){
        int a = 5;
        int b = 6;
        sub();
        System.out.println(a+b);
    }
    public static void sub(){
        int a = 8;
        int b = 4;
        System.out.println(a-b);
    }
}
