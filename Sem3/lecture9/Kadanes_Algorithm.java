package Sem1.lecture9;

public class Kadanes_Algorithm {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(Max_subarray(arr));
    }
    public static int Max_subarray(int[] arr){
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
            ans = Math.max(sum, ans);
            if(sum<0){
                sum = 0;
            }
        }
        return ans;
    }
}
