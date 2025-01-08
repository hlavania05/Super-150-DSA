package HashMap_Assignment_9;
import java.util.*;
public class Hostel_Visit{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int noq = scn.nextInt();
        int k = scn.nextInt();

        while(noq-- > 0){
            int queryType = scn.nextInt();
            if (queryType == 1) {
                long x = scn.nextLong();
                long y = scn.nextLong();
                long dist = x * x + y * y;

                if(maxHeap.size() < k){
                    maxHeap.add(dist);
                }
                else{
                    if(dist < maxHeap.peek()){
                        maxHeap.poll();
                        maxHeap.add(dist);
                    }
                }
            }
            else{
                System.out.println(maxHeap.peek());
            }
        }
    }
}

