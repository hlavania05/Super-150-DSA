package Sem1.lecture7;

public class Find_Minimum_In_Array {
    public static void main(String[] args) {
        int[] arr = {3,4,5,8,7,1,2,4};
        int i = 3;
        System.out.println(Min_Value_Index(arr, i));

    }
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
