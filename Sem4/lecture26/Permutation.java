package Sem4.lecture26;

public class Permutation {
    public static void main(String[] args) {
        String ques = "aba";
        Print(ques, "");
    }
    public static void Print(String ques, String result){
        if(ques.length() == 0){
            System.out.println(result);
            return;
        }
        // for(int i=0; i<ques.length(); i++){
        //     char ch = ques.charAt(i);
        //     boolean val = false;
        //     for(int j = i+1; j<ques.length(); j++){
        //         if(ques.charAt(j) == ch){
        //             val = true;
        //             break;
        //         }
        //     }
        //     if(val == false){
        //         String s1 = ques.substring(0, i);
        //         String s2 = ques.substring(i+1);
        //         Print(s1+s2, result + ques.charAt(i));
        //     }
        // }
        boolean[] visited = new boolean[26];
        for(int i=ques.length()-1; i>=0; i--){
            char ch = ques.charAt(i);
            if(visited[ch-'a'] == false){
                visited[ch-'a'] = true;
                String s1 = ques.substring(0, i);
                String s2 = ques.substring(i+1);
                Print(s1+s2, result + ques.charAt(i));
            }
        }
    }
}
