package Sem4.lecture32;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {7,5,1,4,3};
        int[] ans = Sort(arr, 0, arr.length-1);
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
    public static int[] Sort(int[] arr, int si, int ei){
        if(si == ei){
            int[] bs = new int[1];
            bs[0] = arr[si];
            return bs;

        }
        int mid = (si+ei)/2;
        int[] f = Sort(arr, si, mid);
        int[] s = Sort(arr, mid+1, ei);
        return merge(f, s);

    }
    public static int[] merge(int[] ar1, int[] ar2){
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
        return result;
    }
}
