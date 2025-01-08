package DP_Assignment_10;
import java.util.*;

public class BoardPath_count_print  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        print_paths(N, M, "");
        System.out.println(count_paths(N, M));
    }

    public static int count_paths(int N, int M) {
        if(N == 0){
            return 1;
        }
        if(N < 0){
            return 0;
        }
        int count = 0;
        for(int dice = 1; dice <= M; dice++){
            count += count_paths(N - dice, M);
        }

        return count;
    }

    public static void print_paths(int N, int M, String path){
        if(N == 0){
            System.out.print(path + " ");
            return;
        }
        if(N < 0){
            return;
        }
        for(int i = 1; i <= M; i++){
            print_paths(N - i, M, path + i);
        }
    }
}
