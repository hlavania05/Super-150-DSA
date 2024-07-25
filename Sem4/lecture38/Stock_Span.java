package Sem4.lecture38;
import java.util.*;

public class Stock_Span {
    public static void main(String[] args) {
        int[] arr = {30, 35, 40, 38, 35};
        Cal_span(arr);
    }
    public static void Cal_span(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(!st.empty() && arr[i] >= arr[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = i - st.peek();
            }
            else{
                ans[i] = i + 1;
            }
            st.push(i);
        }
        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}
