package Sem5.lecture52;

public class Edit_Distance {
    public static void main(String[] args) {
        String s = "FOOD";
        String t = "MONEY";
        System.out.println(Min_opr(s,t,0,0));

    }
    public static int Min_opr(String s, String t, int i, int j){
        if(s.length()==i){
            return t.length()-j;
        }
        if(j==t.length()){
            return s.length()-i;
        }
        int ans  = 0;
        if(s.charAt(i)==t.charAt(j)){
            ans = Min_opr(s,t,i+1,j+1);
        }
        else {
            int D = Min_opr(s,t,i+1,j);
            int R = Min_opr(s,t,i+1,j+1);
            int I = Min_opr(s,t,i,j+1);
            ans = Math.min(R,Math.min(D,I))+1;
        }
        return ans;
    }
}
