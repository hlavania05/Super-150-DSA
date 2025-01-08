package HashMap_Assignment_9;

import java.util.*;
public class Frequent_Elements_inArray {
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
        int len = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scn.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

        for(int keeyy : map.keySet()){
            maxHeap.add(new int[]{keeyy, map.get(keeyy)});
        }

        List<Integer> lst = new ArrayList<>();
        while(k-- > 0 && !maxHeap.isEmpty()){
            lst.add(maxHeap.poll()[0]);
        }
        Collections.sort(lst);
        for(int Item : lst) {
            System.out.print(Item + " ");
        }
    }
}