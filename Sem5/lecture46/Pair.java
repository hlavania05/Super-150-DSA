package Sem5.lecture46;

public class Pair <A, B>{
    A x;
    B y;

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>();
        p1.x = 5;
        p1.y ="hello";
        System.out.println(p1.x + " " + p1.y);

        Pair<Boolean, Integer> p2 = new Pair<>();
        p2.x = true;
        p2.y = 4;
        System.out.println(p2.x + " " + p2.y);
    }
}
