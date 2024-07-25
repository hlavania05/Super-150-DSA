package Sem4.lecture28;

public class Coin_Combination_Sum {
    public static void main(String[] args) {
        int[] coin = {1,3,5};
        int amount = 6;
        func(coin, amount, "", 0);
    }
    public static void func(int[] coin, int amount, String ans, int idx){
        if(amount == 0){
            System.out.println(ans);
            return;
        }
        for(int i=idx; i<coin.length; i++){
            if(amount >= coin[i]){
                func(coin, amount-coin[i], ans + coin[i], i);
            }
        }
    }
}
