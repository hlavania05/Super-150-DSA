package Sem1.lecture12;

public class Gas_Station {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(Index(gas,cost));

    }
    public static int Index(int[] gas, int[] cost){
        int sum = 0;
        int curr_sum = 0;
        int si = 0;

        for(int i=0; i<cost.length; i++){
            sum += (gas[i]-cost[i]);
            curr_sum += (gas[i]-cost[i]);
            if(curr_sum < 0){
                si = i+1;
                curr_sum = 0;
            }
        }
        if(sum<0){
            return -1;
        }
        return si;
    }
}
