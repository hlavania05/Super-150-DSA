package Sem4.lecture31;

// ****************************************IMPORTANT*******************************************

// N tak sabhi numbers ko prime maan lenge
// pahle un sabhi numbers ko cut krde jo divisible he by 2,3,5,7,9.....sqrt(n)
// n/2 + n/3 + n/5 + n/7 + n/9 ....
//  n(1/2 + 1/3 + 1/5 + 1/7 + 1/9)
//  time complexity --> n(log(log(n)))

public class Count_Prime {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(count_prime(num));
    }
    //  False = Prime
    //  True = Not Prime
    public static int count_prime(int num){
        boolean[] prime = new boolean[num];
        prime[0] = true;
        prime[1] = true;
        int count = 0;
        for(int i = 2; i<prime.length; i++){
            if(prime[i] == false){
                for(int j = 2; i*j < prime.length; j++){
                    prime[i * j] = true;
                }
            }
        }
        for(int i=0; i<prime.length; i++){
            if( prime[i] == false){
                count++;
            }
        }
        return count;
    }
    // public static boolean isprime(int n){
    //     int i = 2;
    //     while(i*i < n){
    //         if(n % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}


