package Sem1.lecture21;
import java.util.*;

public class Diagonal_Traverse {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        int[] new_arr = Diagonal_traverse(arr);
        for(int i=0; i<new_arr.length; i++){
            System.out.print(new_arr[i]+" ");
        }
    }
    public static int[] Diagonal_traverse(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int[] arr_new = new int[m*n];
        int idx = 0;
        for(int d=0; d<n+m-1; d++){
            int r=0, c=0;
            if(d<m){
                c = d;
            }
            else{
                c = m-1;
                r = d-m+1;
            }
            ArrayList<Integer> ll = new ArrayList<>();
            while(r<n && c>=0){

                ll.add(arr[r][c]);
                r++;
                c--;
            }
            if (d%2 == 0) {
                Collections.reverse(ll);;
            }
            // System.out.println(ll);
            for(int x=0; x<ll.size(); x++){
                arr_new[idx] = ll.get(x);
                idx++;
            }
        }
        return arr_new;
    }
}
