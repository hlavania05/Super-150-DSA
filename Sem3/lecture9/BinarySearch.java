package Sem1.lecture9;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int item = sc.nextInt();
        System.out.println(Binary_search(arr, item));
        sc.close();
    }
    public static int Binary_search(int[] arr, int item){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid] == item){
                return mid;
            }
            else if(arr[mid]>item){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
