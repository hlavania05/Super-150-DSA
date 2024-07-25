package Sem4.lecture24;
import java.util.*;

public class Generate_Parenthesis {
    public static void main(String[] args) {
        int n = 3;
        List<String> result = new ArrayList<>();
        generate(result, n, "",0,0);
    }
    public static void generate(List<String> result, int n, String ans, int open, int close){
        if(open == n && close == n){
            result.add(ans);
            return;
        }
        if(n < open){
            return;
        }
        if(close > open){
            return;
        }

        generate(result, n, ans+"(", open+1, close);
        generate(result, n, ans+")", open, close+1);
    }
}
