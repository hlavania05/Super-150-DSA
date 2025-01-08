package Sem5.lecture50;

import java.util.HashMap;
import java.util.Scanner;

public class Longest_Consecutive_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {100,4,200,1,3,2};
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int item : arr){
            if(map.containsKey(item-1)){
                map.put(item, false);
            }
            else{
                map.put(item, true);
            }
            if(map.containsKey(item+1)){
                map.put(item+1, false);
            }
        }
        int ans = 0;
        for(int key : map.keySet()){
            if (map.get(key)) {
                int count = 0;
                while (map.containsKey(key)) {
                    count++;
                    key++;
                }
                ans = Math.max(count, ans);
            }
        }
        System.out.println(ans);
    }
}
