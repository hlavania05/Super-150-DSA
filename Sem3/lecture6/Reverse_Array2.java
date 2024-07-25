package Sem1.lecture6;

public class Reverse_Array2 {
    public static void main(String[] args) {
        int[] arr = {3,8,7,8,7,5,4,3,2,4,5,6,7,8};
        reverse(arr,2,6);

        // Printing the array
        System.out.print("[ ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(" ]");
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
