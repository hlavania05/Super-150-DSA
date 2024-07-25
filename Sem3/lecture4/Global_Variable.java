package Sem1.lecture4;

public class Global_Variable {
    static int val = 100;  // Global variable : it
    public static void main(String[] args) {
        System.out.println("Heyy");
        int a = 8;
        int b = 7;
        System.out.println(val);
        System.out.println(add(a,b));
        System.out.println(val);
    }

    // public static int add(int a, int b){
    //     val = val +5;
    //     return a+b;
    // }

    public static int add(int a, int b){
        int val = 90;
        val = val+5;  // changes wil be done in gloabal variable
        return a+b;
    }
}
