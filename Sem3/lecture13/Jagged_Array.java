package Sem1.lecture13;

public class Jagged_Array {
    public static void main(String[] args) {
        // jagged array vo arrray h jisme column define na ho
        int[][] arr = new int[4][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        arr[3] = new int[4];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
