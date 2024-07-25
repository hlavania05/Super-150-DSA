package Sem1.lecture9;
import java.util.*;

public class Practise_Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int N = sc.nextInt();
        System.out.println(find_num(k, N));
        sc.close();
    }
    public static int find_num(int k, int N){
        int ans = 0;
        int low = 0;
        int high = N;
        while(low<=high){
            int mid = (low+high)/2;
            if(Math.pow(mid, k)<=N){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}
