package Sem1.lecture7;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,3,2,4,5,6,7,8,9};
        bubble_Sort(arr);
        // Printing the array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    // Bubble Sort
    public static void bubble_Sort(int[] arr){
        for(int turn=0; turn<arr.length; turn++){
            for(int i=0; i<(arr.length-turn-1); i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
}
