package Sem4.lecture26;
import java.util.*;

public class Letter_Combination {
    static String[] map = {"", "","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String ques = "23";
        List<String> result = new ArrayList<>();
        if(ques.length() == 0){
            System.out.println(result);
        }
        else{
            keypad(ques, "", result);
            System.out.println(result);
        }
    }
    public static void keypad(String ques, String ans, List<String> result){
        if(ques.length() == 0){
            result.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        String press = map[ch - '0'];
        for(int i=0; i<press.length(); i++){
            keypad(ques.substring(1), ans+press.charAt(i), result);
        }
    }
}
