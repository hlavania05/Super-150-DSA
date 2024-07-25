package Sem1.lecture13;

public class WavePrint_ColWise {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4,6,5},{7,8,5,9,6},{3,5,6,5,7},{2,3,7,4,5}};
        int n = arr.length;
        int m = arr[0].length;
        for(int col=0; col<m; col++){
            for(int row=0; row<arr.length; row++){
                if(col%2==0){
                    System.out.print(arr[row][col] + " ");
                }
                else{
                    System.out.print(arr[n-row-1][col] + " ");
                }
            }
            System.out.println();
        }
    }
}
