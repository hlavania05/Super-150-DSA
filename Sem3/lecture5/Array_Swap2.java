package Sem1.lecture5;

public class Array_Swap2 {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4,5,6,7,9};
        int[] arr2 = {6,8,9,7,6,54,3};
        System.out.println(arr1[0] + " " + arr2[0]);
        swap(arr1,arr2);
        System.out.println(arr1[0] + " " + arr2[0]); // change nhi hoga why? because of call by value


    }
    public static void swap(int[] arr1, int[] arr2){
        int[] temp = arr1;
        arr1 = arr2;
        arr2 = temp;      // ye change sirf function ke andar hi rahega
    }
}
