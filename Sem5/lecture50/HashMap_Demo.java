package Sem5.lecture50;

import java.util.*;

public class HashMap_Demo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ghatotkachh", 78);
        map.put("Raj", 87);
        map.put("Kamlesh", 45);
        map.put("Brijesh", 76);
        map.put("Kunal", 56);
        System.out.println(map);

        TreeMap<String, Integer> map1 = new TreeMap<>();
        map1.put("Raj", 78);
        map1.put("Kamlesh", 74);
        map1.put("Brijesh", 21);
        map1.put("Kunal", 34);
        map1.put("Ghatotkachh", 45);
        System.out.println(map1);

        for(String key : map.keySet()){
            System.out.println(key + " --> " + map.get(key));
        }
    }
}
