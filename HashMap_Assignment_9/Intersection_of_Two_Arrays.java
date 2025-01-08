package HashMap_Assignment_9;
import java.util.*;

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr1 = new int[len];
        for(int i=0; i<len; i++){
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[len];
        for(int i=0; i<len; i++){
            arr2[i] = sc.nextInt();
        }

        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int item : arr1){
            map.put(item, map.getOrDefault(item, 0)+1);
        }

        for(int item : arr2){
            if(map.containsKey(item)){
                ans.add(item);
                map.put(item, map.get(item)-1);
                if(map.get(item) == 0){
                    map.remove(item);
                }
            }
        }
        Collections.sort(ans);
        System.out.println(ans);

    }
}
