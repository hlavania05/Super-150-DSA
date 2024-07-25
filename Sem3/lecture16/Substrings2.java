package Sem1.lecture16;

public class Substrings2 {
    public static void main(String[] args) {
        String str = "helol";
        SubString(str);
    }
    public static void SubString(String str){
        for(int len=1; len <= str.length(); len++) {
            for (int j = len; j <= str.length(); j++) {
                int i = j - len;
                System.out.println(str.substring(i, j));
            }
        }
    }
}
