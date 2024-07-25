package Sem1.lecture19;
import java.util.*;

public class Wrapper_Class {
    public static void main(String[] args) {
        Integer a = 10;
        int a1 = 10;
        System.out.println(a);
        System.out.println(a1);

        // auto boxing : stack --> heap
        int b = 9;
        Integer b1 = 90;
        b1 = b;

        // On boxing : stack --> heap
        Integer c = 3;
        int c1 = 6;
        c1 = c;

        //------------------------------------------
        Integer e1 = 78;
        Integer e2 = 78;
        Integer e3 = 178;
        Integer e4 = 178;
        System.out.println(e1 == e2);       // True
        System.out.println(e3 == e4);       // Flase
    }
}
