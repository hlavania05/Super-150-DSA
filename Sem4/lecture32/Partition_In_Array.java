package Sem4.lecture32;

public class Partition_In_Array {
    public static void main(String[] args) {
        int[] arr = {5,4,5,4,3,2,6,1,2,3,4,5};
        int idx = partition(arr, 0, arr.length-1);
        for(int item : arr){
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println(idx);
    }
    public static int partition(int[] arr, int si, int ei){
        int item = arr[ei];
        int idx = si;
        for(int i=si; i < ei; i++){
            if(arr[i] <= item){
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
