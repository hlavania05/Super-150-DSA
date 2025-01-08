package HashMap_Assignment_9;

import java.util.*;

public class Subarrays_with_distinct_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }

        int l = 0;
        int r = 0;
        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(r < len){
            int item = arr[r];
            map.put(item, map.getOrDefault(item, 0)+1);
            while(map.get(item) >= 2){
                int left = arr[l];
                map.put(left, map.get(left) - 1);
                l++;
            }
            cnt += sum(r-l+1);
            r++;
        }
        System.out.println(cnt);
    }
    public static int sum(int n){
        return n * (n+1)/2;
    }
}
