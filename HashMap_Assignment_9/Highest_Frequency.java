package HashMap_Assignment_9;
import java.util.*;

public class Highest_Frequency {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int maxfreq = 0;
        int ans = 0;
        for(int i=0; i<len; i++){
            int item = sc.nextInt();
            map.put(item, map.getOrDefault(item, 0)+1);
            if(maxfreq < map.get(item)){
                ans = item;
                maxfreq = map.get(item);
            }
        }
        System.out.println(ans);

    }
}
