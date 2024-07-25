package Sem4.lecture36;

public class Stack_Client {
    public static void main(String[] args) throws Exception {
        Stack st = new Stack(5);
        st.push(20);
        st.push(20);
        st.push(20);
        st.push(20);
        st.push(20);
        System.out.println(st.peek());
        System.out.println("Stack contents:");
        System.out.println(st);
    }
}
