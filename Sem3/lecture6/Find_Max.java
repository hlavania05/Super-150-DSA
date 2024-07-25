package Sem1.lecture6;

public class Find_Max {
    public static int search_max(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    //----------------------------------------------------
    public static int search_max1(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(arr[i], max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3,6,9,32,7,4,1,26};
        System.out.println(search_max1(arr));
    }
}
