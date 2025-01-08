package Sem5.lecture46;

public class Generic_Demo {
    public static void main(String[] args) {
        String[] arr1 = {"hello", "aditi", "bhoomi","preeti","anushka", "ishika"};
        Display(arr1);

        Integer[] arr2 = {1,5,4,3,6,7,5,4,8,5};
        Display(arr2);
    }
    public static <T> void Display(T[] arr){
        for(T item : arr){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
