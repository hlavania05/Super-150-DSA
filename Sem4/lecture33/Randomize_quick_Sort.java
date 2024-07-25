package Sem4.lecture33;
import java.util.*;

public class Randomize_quick_Sort {
    public static void main(String[] args) {
        int[] arr = {5,7,2,3,8,1,4};
        Sort(arr,0,arr.length-1);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void Sort(int[] arr , int si , int ei){
        if (si >= ei) {
            return;
        }
        int idx = Partition(arr,si,ei);
        Sort(arr,si,idx-1);
        Sort(arr,idx+1,ei);
    }
    public static int Partition(int[] arr , int si, int ei) {
        Random rn = new Random();
        int ii = rn.nextInt(ei-si+1) + si;
        int t = arr[ii];
        arr[ii] = arr[ei];
        arr[ei] = t;
        int item = arr[ei];
        int idx = si;
        for (int i = si; i < ei; i++) {
            if (arr[i] < item) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }
        }
        int temp = arr[ei];
        arr[ei] = arr[idx];
        arr[idx] = temp;
        return idx;
    }
}
