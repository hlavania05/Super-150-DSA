package Sem4.lecture25;

public class Lexicographical_Order {
    // public static void main(String[] args) {
    //     int n = 20;
    //     List<Integer> result = new ArrayList<>();
    //     print(result, n, 0);
    //     System.out.println(result);
    // }
    // public static void print(List<Integer> result, int n, int curr){
    //     if(curr >= n){
    //         return;
    //     }
    //     result.add(curr);
    //     int i=0;
    //     if(curr == 0){
    //         i=1;
    //     }
    //     for(; i<=9; i++){
    //         print(result, n, curr*10+i);
    //     }
    // }

    public static void main(String[] args) {
        int n = 1000;
        for(int i = 1; i <= 9; i++){
            lexi(i, n);
            System.out.println();
        }
    }
    public static void lexi(int i, int n){
        if(i > n){
            return;
        }
        System.out.print(i + " ");
        for(int j = 0; j <= 9; j++){
            lexi(10 * i + j, n);
        }
    }
}
