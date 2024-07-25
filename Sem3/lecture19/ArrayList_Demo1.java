package Sem1.lecture19;
import java.util.*;

public class ArrayList_Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> ll = new ArrayList<Integer>();
        System.out.println(ll);
        // array.size()
        System.out.println(ll.size());

        // array.add(value)
        ll.add(3);
        ll.add(78);
        ll.add(76);
        ll.add(35);

        // array.get(index)
        System.out.println(ll.get(2));

        // array.remove(index)
        ll.remove(1);

        // array.set(index, value);
        ll.set(2,86);

        // printing arraylist
        for(int i=0; i<ll.size(); i++){
            System.out.println(ll.get(i));
        }

        // foreach loop
        for(int i : ll){
            System.out.print(i+" ");
        }

    }
}
