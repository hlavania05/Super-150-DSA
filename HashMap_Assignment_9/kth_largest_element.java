package HashMap_Assignment_9;

import java.util.*;

public class kth_largest_element {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            minHeap.add(x);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        System.out.println(minHeap.peek());

    }
}
