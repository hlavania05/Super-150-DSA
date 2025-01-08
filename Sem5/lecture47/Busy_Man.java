package Sem5.lecture47;

import java.util.*;

public class Busy_Man {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0){
            int len = sc.nextInt();
            int[][] arr = new int[len][2];
            for(int i=0; i<len; i++){
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[1] - o2[1];
                }
            });
            int max_task = 0;
            int end = arr[0][1];
            for(int curr=0; curr<len; curr++){
                if(arr[curr][0] >= end){
                    end = arr[curr][1];
                    max_task++;
                }
            }
            System.out.println(max_task);
        }
    }
}
