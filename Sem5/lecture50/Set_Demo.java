package Sem5.lecture50;

import java.util.*;

public class Set_Demo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(9);
        set.add(5);
        set.add(7);
        set.add(2);
        System.out.println(set);
        set.remove(2);
        set.contains(5);
        System.out.println(set);

        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(5);
        set1.add(7);
        set1.add(9);
        set1.add(2);
        set1.remove(2);
        System.out.println(set1);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(9);
        set2.add(7);
        set2.add(5);
        set2.add(2);
        set2.remove(2);
        System.out.println(set2);


    }
}
