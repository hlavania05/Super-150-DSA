package Sem4.lecture22;

public class Find_Min_Index {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,3,4,1};
        int target = 4;
        System.out.println(idx(arr, 0, target));

    }
    public static int idx(int[] arr, int idx, int target){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == target){
            return idx;
        }
        return idx(arr, idx+1, target);
    }
}
