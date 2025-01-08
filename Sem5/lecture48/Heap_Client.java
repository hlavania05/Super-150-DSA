package Sem5.lecture48;
import java.util.*;

public class Heap_Client {
    public static void main(String[] args) {
        Heap hp = new Heap();
        int[] arr = {10,20,30,5,7,3,-2};
        for(int item : arr){
            hp.add(item);
        }
        hp.Display();
        hp.remove();
        hp.Display();
    }
}
