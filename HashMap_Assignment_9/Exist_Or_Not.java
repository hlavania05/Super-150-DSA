package HashMap_Assignment_9;

import java.util.*;

public class Exist_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i=0; i<testCases; i++){
            int n = sc.nextInt();
            HashSet<Integer> arr = new HashSet<>();
            for(int j=0;j<n;j++){
                int x = sc.nextInt();
                arr.add(x);
            }
            int query = sc.nextInt();
            for(int k=0; k<query; k++){
                int check = sc.nextInt();
                String ans = arr.contains(check) ? "Yes" : "No";
                System.out.println(ans);
            }
        }
    }
}
