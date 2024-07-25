package Sem1.lecture15;

public class String_Comparison {
    public static void main(String[] args) {
        String s1 = "raj";
        String s2 = "rajesh";
        System.out.println(s1.compareTo(s2));  // -3 aayega jo ki length ka difference h

        String s3 = "karpit";
        String s4 = "komal";

        // System.out.println(s3.compareTo(s4));  // 6 aayega jo ki different char ke ASCII ka difference h
        System.out.println(Compare(s3, s4));
    }
    public static int Compare(String s1, String s2){
        int n = Math.min(s1.length(), s2.length());
        for(int i=0; i<n; i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return s1.length()-s2.length();
    }
}
