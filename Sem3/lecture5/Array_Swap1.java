package Sem1.lecture5;

public class Array_Swap1 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,2};
        System.out.println(arr[0]+" "+arr[1]);

        swap(arr, 0, 1);
        System.out.println(arr[0]+" "+arr[1]);

    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
