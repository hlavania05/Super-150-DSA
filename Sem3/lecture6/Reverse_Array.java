package Sem1.lecture6;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,5,7};
        Reverse(arr);

        //-------Printing array---------------
        System.out.print("[ ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(" ]");
    }
    //------------------Reversing array-------------------
    public static void Reverse(int[] arr){
        // int i = 0;
        // int j = arr.length-1;
        // while(i<=j){
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        //     i++;
        //     j--;
        // }
        int j = arr.length-1;
        for(int i=0; i<j; i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }
}
