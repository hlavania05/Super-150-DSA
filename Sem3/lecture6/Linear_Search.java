package Sem1.lecture6;
import java.util.*;

public class Linear_Search {
    public static int Linear_search(int[] arr, int a){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==a){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Element : ");
        int[] arr = new int[10];
        for(int i=0; i<10; i++){
            int x = sc.nextInt();
            arr[i] = x;
        }
        System.out.println("Enter Element to find : ");
        int a = sc.nextInt();
        System.out.println(Linear_search(arr, a));
        sc.close();
    }
}
