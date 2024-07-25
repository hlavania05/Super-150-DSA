package Sem1.lecture8;

public class Product_Array2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr2 = Array_except(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
    public static int[] Array_except(int[] arr){
        int n = arr.length;

        // left array
        int[] arr_left = new int[n];
        arr_left[0] = 1;
        for(int i=1; i<arr.length; i++){
            arr_left[i] = arr_left[i-1]*arr[i-1];
        }

        // right array
        int[] arr_right = new int[n];
        arr_right[n-1] = 1;
        for(int i=n-2; i>=0; i--){
            arr_right[i] = arr_right[i+1]*arr[i+1];
        }

        // profuct array
        for(int i=0; i<n; i++){
            arr_left[i] = arr_left[i]*arr_right[i];
        }
        return arr_left;   // array ka address return hoga
    }
}
