package Sem1.lecture9;

public class Max_Subarray_Sum {
    public static void main(String[] args) {
        int[] arr = {2,3,-7,4,-1,8};
        System.out.println(Max_subarray(arr));
    }
    public static int Max_subarray(int[] arr){
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum = sum + arr[j];
                ans = Math.max(sum, ans);
            }
        }
        return ans;
    }
}
