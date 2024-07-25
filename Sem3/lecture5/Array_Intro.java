package Sem1.lecture5;
import java.util.*;

public class Array_Intro {
    public static void main(String[] args) {
        /* int[] arr = null; // arr name ka variable h jisme null value store h - but abhi koi address assign nhi hua h
        java me array is Non-primitive data type
        in java all the classes are Non-primitive data
        primitive - stack me
        Non-primitive - heap me */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Entering the value to the array
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            arr[i] = x;
        }
        display(arr);
        sc.close();
    }
    // displaying the array
    public static void display(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
