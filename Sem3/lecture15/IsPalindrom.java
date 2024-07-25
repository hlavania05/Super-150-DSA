package Sem1.lecture15;

public class IsPalindrom {
    public static void main(String[] args) {
        String s = "astsa";
        System.out.println(IsPalindrome(s));
    }
    public static boolean IsPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
