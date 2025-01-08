package HashMap_Assignment_9;
import java.util.*;
public class Median_in_stream_of_running_data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            int[] stream = new int[n];
            for(int i = 0; i < n; i++){
                stream[i] = sc.nextInt();
            }

            // Min-heap and max-heap initialization
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

            // Processing the stream
            for(int i = 0; i < n; i++){
                int item = stream[i];

                // Insert the item into one of the heaps
                if(maxHeap.isEmpty() || item < maxHeap.peek()){
                    maxHeap.add(item);
                } else {
                    minHeap.add(item);
                }

                // Balance the heaps
                if(maxHeap.size() > minHeap.size() + 1){
                    minHeap.add(maxHeap.poll());
                } else if(minHeap.size() > maxHeap.size()){
                    maxHeap.add(minHeap.poll());
                }

                // Print the median
                if(maxHeap.size() == minHeap.size()){
                    System.out.print((maxHeap.peek() + minHeap.peek()) / 2 + " ");
                } else {
                    System.out.print(maxHeap.peek() + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
