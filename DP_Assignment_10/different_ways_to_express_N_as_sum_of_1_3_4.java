package DP_Assignment_10;
import java.util.*;

public class different_ways_to_express_N_as_sum_of_1_3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input == 0){
            System.out.println(1);
            return;
        }
        if(input == 1 || input == 2){
            System.out.println(1);
            return;
        }
        if(input == 3){
            System.out.println(2);
            return;
        }

        int[] arr = new int[input + 1];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 2;

        for(int x = 4; x <= input; x++){
            arr[x] = arr[x - 1] + arr[x - 3] + arr[x - 4];
        }

        System.out.println(arr[input]);
    }
}
