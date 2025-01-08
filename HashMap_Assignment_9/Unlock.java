package HashMap_Assignment_9;
import java.util.*;

public class Unlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i], i);
        }

        int expected = n;
        int swaps = k;
        for(int i=0; i<n; i++){
            if(arr[i] != expected){
                int id = map.get(expected);
                int temp = arr[i];
                arr[i] = arr[id];
                arr[id] = temp;
                map.put(arr[i], i);
                map.put(arr[id], id);
                swaps--;
            }
            if(swaps == 0){
                break;
            }
            expected--;
        }
        for(int item : arr){
            System.out.print(item + " ");
        }
    }
}
