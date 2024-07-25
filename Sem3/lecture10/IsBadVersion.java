package Sem1.lecture10;

public class IsBadVersion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(First_bad_version(n));

    }
    public static int First_bad_version(int n){
        int low = 0;
        int high = n;
        int result = n;
        while(low<=high){
            //int mid = (low+high)/2;
            // (low+high) overflow hoga jisse mid value dusri aayi jisse iteration badegi islie TLE aayega
            int mid = low + ((high-low)/2);
            if(isBadVersion(mid)){
                result = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return result;
    }

    // LeetCode's Method
    public static Boolean isBadVersion(int n){
        return true;
    }
}
