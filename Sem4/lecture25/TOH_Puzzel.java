package Sem4.lecture25;

public class TOH_Puzzel {
    public static void main(String[] args) {
        int disks = 5;
        String src = "A";
        String hlp = "B";
        String des = "C";
        toh(disks, src, hlp, des);

    }
    public static void toh(int n, String src, String hlp, String des){
        if(n ==0 ){
            return;
        }
        toh(n-1, src, des, hlp);
        System.out.println("Move " + n + "th disk from " + src + " to " + des);
        toh(n-1, hlp, src,des);
    }
}
