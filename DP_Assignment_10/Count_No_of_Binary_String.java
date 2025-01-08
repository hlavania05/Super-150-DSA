package DP_Assignment_10;
import java.util.Scanner;

public class Count_No_of_Binary_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] tst = new int[len];
        int maxNum = 0;

        for (int i = 0; i < len; i++) {
            tst[i] = sc.nextInt();
            maxNum = Math.max(maxNum, tst[i]);
        }
        long[] dp = new long[maxNum + 1];

        dp[1] = 2;
        if(maxNum > 1){
            dp[2] = 3;
        }

        for(int i=3; i<=maxNum; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        for(int n : tst){
            System.out.println(dp[n]);
        }
    }
}
