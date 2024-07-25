package Sem1.lecture10;

public class Next_Permutation {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        int[] My_array = {3,7,8,5,9,1,8,6,4,7};
        Permutation(My_array);
        for(int i=0; i<My_array.length; i++){
            System.out.print(My_array[i]+" ");
        }

    }
    public static void Permutation(int[] arr){
        int l = arr.length;
        int p = -1;
        for(int i=l-2; i>=0; i--){
            if(arr[i] < arr[i+1]){
                p = i;
                break;
            }
        }
        if(p==-1){
            reverse(arr, 0, l-1);
            return;
        }
        int q = -1;
        for(int i=l-1; i>p; i--){
            if(arr[i] > arr[p]){
                q = i;
                break;
            }
        }
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
        reverse(arr, p+1, l-1);
    }
    public static void reverse(int[] arr, int a, int b){
        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
}
