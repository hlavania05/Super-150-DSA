package Sem1.lecture20;
import java.util.*;

public class Divisible_Subarrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(good_arrays(arr));
    }
    public static long good_arrays(int[] arr){
        long sum = 0;
        int n = arr.length;
        long[] freq = new long[n];
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
            int idx = (int)(sum%n);
            if(idx<0){
                idx += n;
            }
            freq[idx] = freq[idx] + 1;
        }
        long ans = 0;
        for(int i=0; i<freq.length; i++){
            long p = freq[i];
            if(p>=2){
                ans = ans+(p*(p-1))/2;
            }
        }
        return ans;
    }
}
