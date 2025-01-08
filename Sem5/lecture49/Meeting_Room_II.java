package Sem5.lecture49;
import java.util.*;

public class Meeting_Room_II {
    public static void main(String[] args) {
        int[][] arr = {{0,30}, {5,10}, {15,20}};
        Arrays.sort(arr, (a,b)->a[0]-b[0]);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
