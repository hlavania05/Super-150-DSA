package Sem1.lecture13;

public class Search_In_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {{2,4,6,5},{3,7,8,9},{8,4,7,6},{9,1,2,3}};
        int target = 10;
        System.out.println(search(arr, target));
    }
    public static boolean search(int[][] arr, int target){
        int r = arr.length-1;
        int c = 0;
        while(r>=0 && c<=arr[0].length-1){
            if(arr[r][c] == target){
                return true;
            }
            else if(arr[r][c]>target){
                r--;
            }
            else{
                c++;
            }
        }
        return false;
    }
}
