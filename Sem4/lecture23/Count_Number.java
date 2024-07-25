package Sem4.lecture23;

public class Count_Number {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(count(str, ""));
    }
    // static int count = 0;
    public static int count(String ques, String ans){
        if(ques.length() == 0){
            // System.out.println(ans);
            return 1;
        }
        char ch = ques.charAt(0);
        int a = count(ques.substring(1), ans);
        int b = count(ques.substring(1), ans+ch);
        return a+b;
    }
}
