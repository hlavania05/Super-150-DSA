package Sem4.lecture32;

public class Merge_Two_Sorted_Array {
    public static void main(String[] args) {
        int[] ar1 = {2,3,5,6,7,11,19,20,23};
        int[] ar2 = {1,3,5,6,8,9,10};
        merge(ar1, ar2);

    }
    // O(n) time complexity
    public static void merge(int[] ar1, int[] ar2){
        // ek new array banayenge jiski length dono length ke size ki sum hogi
        int n1 = ar1.length;
        int n2 = ar2.length;
        int[] result = new int[n1+n2];
        int i = 0, j = 0, k = 0;
        while(i < n1 && j < n2){
            if(ar1[i] < ar2[j]){
                result[k] = ar1[i];
                i++;
                k++;
            }
            else{
                result[k] = ar2[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            result[k] = ar1[i];
            i++;
            k++;
        }
        while(j<n2){
            result[k] = ar1[j];
            j++;
            k++;
        }
        for(int x : result){
            System.out.print(x + " ");
        }
    }
}
