package HashMap_Assignment_9;
import java.util.*;
class itemDetail{
    int item;
    int row;
    int col;
    public itemDetail(int item, int row, int col){
        this.row = row;
        this.col = col;
        this.item = item;
    }
}

public class Merge_k_sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[k][n];
        for(int i=0; i<k; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        PriorityQueue<itemDetail> minHeap = new PriorityQueue<>(new Comparator<itemDetail>() {
            @Override
            public int compare(itemDetail o1, itemDetail o2) {
                return o1.item - o2.item;
            }
        });
        for(int i=0; i<k; i++){
            minHeap.add(new itemDetail(arr[i][0], i, 0));
        }
        List<Integer> ans = new ArrayList<>();
        while(!minHeap.isEmpty()){
            itemDetail detail = minHeap.poll();
            ans.add(detail.item);
            int curr_row = detail.row;
            int curr_col = detail.col;
            if(curr_col < n-1){
                minHeap.add(new itemDetail(arr[curr_row][curr_col+1], curr_row, curr_col+1));
            }
        }
        for(int item : ans){
            System.out.print(item + " ");
        }
    }
}
