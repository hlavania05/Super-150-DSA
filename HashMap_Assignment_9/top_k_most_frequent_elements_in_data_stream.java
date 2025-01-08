package HashMap_Assignment_9;
import java.util.*;
class Pair{
    int data;
    int freq;
    public Pair(int data, int freq){
        this.data = data;
        this.freq = freq;
    }
    public String toString(){
        return this.data + ":" + this.freq;
    }
}

public class top_k_most_frequent_elements_in_data_stream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] stream = new int[n];
            for (int i = 0; i < n; i++) {
                stream[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int item = stream[i];
                map.put(item, map.getOrDefault(item, 0) + 1);
                PriorityQueue<Pair> maxHeap = new PriorityQueue<Pair>(new Comparator<Pair>() {
                    @Override
                    public int compare(Pair o1, Pair o2) {
                        if (o1.freq != o2.freq) {
                            return o2.freq - o1.freq;
                        } else {
                            return o1.data - o2.data;
                        }
                    }
                });
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    maxHeap.add(new Pair(entry.getKey(), entry.getValue()));
                }
                int cnt = k;
                while (cnt-- > 0) {
                    Pair p = maxHeap.poll();
                    if (p != null) {
                        System.out.print(p.data + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
