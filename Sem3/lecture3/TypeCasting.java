package Sem1.lecture3;

public class TypeCasting {
    public static void main(String[] args) {
        int a = 9;
        byte b = (byte)(429);
        //System.out.println(b);
        short s = 78;
        long l = 781;
        byte b1 = -5;
        b1 = (byte)(300);
        //System.out.println(b1);
        long ll = 5687969568l;
        //System.out.println(ll);

        // int x1 = 086;
        // System.out.println(x1);
        // int x = 045;
        // System.out.println(x);

        // char a1 = 'A';
        // System.out.println(a1);
        // System.out.println((int)(a1));
        // System.out.println(a1++);


        for(byte i=0; i<128; i++){
            System.out.println(i);
        } // loop will be infinite times
    }
}
