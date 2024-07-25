package Sem1.lecture7;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {2,3,4,8,7,6};
        Selection_sort(arr);
        // Printing the array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    // selection sort
    public static void Selection_sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int idx = Min_Value_Index(arr, i);
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }

    // Find min from given index to entire array
    public static int Min_Value_Index(int[] arr, int i){
        int min_index = i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[j]<arr[min_index]){
                min_index = j;
            }
        }
        return min_index;
    }
}
