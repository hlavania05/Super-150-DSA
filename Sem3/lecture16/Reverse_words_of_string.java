package Sem1.lecture16;

public class Reverse_words_of_string {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(Reverse(str));
    }
    public static String Reverse(String str){
        str = str.trim();
        String[] arr = str.split("\s+");
        String ans = "";
        for(int i=arr.length-1; i>=0; i--){
            ans = ans + arr[i] + " ";
        }
        return ans.trim();
    }
}
