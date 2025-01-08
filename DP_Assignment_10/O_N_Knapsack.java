package DP_Assignment_10;
import java.util.Scanner;

public class O_N_Knapsack{
    public static void main(String[] args) {
        Scanner my_sc = new Scanner(System.in);
        int n = my_sc.nextInt();
        int cap = my_sc.nextInt();
        int[] weight = new int[n];
        int[] val = new int[n];

        for(int i = 0; i < n; i++){
            weight[i] = my_sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            val[i] = my_sc.nextInt();
        }

        int[] mydp = new int[cap + 1];
        for(int i = 0; i < n; i++){
            for(int j = weight[i]; j <= cap; j++){
                mydp[j] = Math.max(mydp[j], mydp[j - weight[i]] + val[i]);
            }
        }
        System.out.println(mydp[cap]);
    }
}
