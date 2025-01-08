package HashMap_Assignment_9;
import java.util.*;

public class Mapped_String {
    static Map<Integer, Character> map = new HashMap<>();
    public static void main(String[] args) {
        for(int i = 1; i <= 26; i++) {
            map.put(i, (char)('A' + i - 1));
        }

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        List<String> ans = new ArrayList<>();
        decode(input, 0, "", ans);

        Collections.sort(ans);
        for(String str : ans){
            System.out.println(str);
        }
    }

    public static void decode(String str, int id, String curr, List<String> lst) {
        if(id == str.length()){
            lst.add(curr);
            return;
        }

        int oneDigit = str.charAt(id) - '0';
        if(oneDigit >= 1 && oneDigit <= 9){
            decode(str, id + 1, curr + map.get(oneDigit), lst);
        }

        if(id+1  < str.length()){
            int twoDigit = Integer.parseInt(str.substring(id, id + 2));
            if(twoDigit >= 10 && twoDigit <= 26){
                decode(str, id + 2, curr + map.get(twoDigit), lst);
            }
        }
    }
}
