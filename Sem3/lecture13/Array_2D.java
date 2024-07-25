package Sem1.lecture13;
import java.util.*;

public class Array_2D {
    public static void main(String[] args) {
        // int[][] arr = new int[3][4];
        // System.out.println(arr);
        // System.out.println(arr[0]);
        // System.out.println(arr.length);
        // System.out.println(arr[0].length);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int x = sc.nextInt();
                arr[i][j] = x;
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
