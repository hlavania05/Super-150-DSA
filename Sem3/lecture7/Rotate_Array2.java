package Sem1.lecture7;

public class Rotate_Array2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr,k);

        // Printing the array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    // rotating the array
    public static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

    }
    // Reversing the values from index 2 to index 6
    public static void reverse(int[] arr, int a, int b){
        int i = a;
        int j = b;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
