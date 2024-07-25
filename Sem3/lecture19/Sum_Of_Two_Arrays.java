package Sem1.lecture19;
import java.util.*;

public class Sum_Of_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        int m = sc.nextInt();
        int[] brr = new int[m];
        for(int j = 0; j < m; j++){
            brr[j]= sc.nextInt();
        }
        sum_array(arr,brr);
    }
    public static void sum_array(int[] arr, int[] brr){
        ArrayList<Integer> ll = new ArrayList<>();
        int i = arr.length - 1;
        int j = brr.length - 1;
        int carry = 0;
        while(i >= 0 && j>=0){
            int sum = carry + arr[i] + brr[j];
            ll.add(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        while(i >= 0){
            int sum = carry + arr[i] ;
            ll.add(sum % 10);
            carry = sum / 10;
            i--;
        }
        while(j >= 0){
            int sum = carry + brr[j] ;
            ll.add(sum % 10);
            carry = sum / 10;
            j--;
        }
        if(carry > 0){
            ll.add(carry);
        }
        for(int k = ll.size() - 1; k >= 0; k--){
            System.out.print(ll.get(k) + ", ");
        }
        System.out.println("END");
    }
}
