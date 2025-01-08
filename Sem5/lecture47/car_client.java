package Sem5.lecture47;
import java.util.*;

public class car_client {
    public static void main(String[] args) {
        Cars[] arr = new Cars[6];
        arr[0] = new Cars(200, 10, "White");
        arr[1] = new Cars(34, 853, "Grey");
        arr[2] = new Cars(1000, 20, "Black");
        arr[3] = new Cars(345, 3, "Yellow");
        arr[4] = new Cars(34, 89, "Grey");
        arr[5] = new Cars(8907, 6, "Red");
        Arrays.sort(arr, new Comparator<Cars>() {
            @Override
            public int compare(Cars o1, Cars o2) {
                if(o1.price != o2.price){
                    return o1.price - o2.price;
                }
                else{
                    return o1.speed - o2.speed;
                }
            }
        });
//        bubble_sort(arr);
        Display(arr);
    }
    public static void Display(Cars[] ar){
        for(int i=0; i<ar.length; i++){
            System.out.println(ar[i] + " ");
        }
        System.out.println();
    }
    public static <T extends Comparable<T>> void bubble_sort(T[] arr) {
        for (int trurn = 1; trurn < arr.length; trurn++) {
            for (int i = 0; i < arr.length - trurn; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

        }
    }
    
}
