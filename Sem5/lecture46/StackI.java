package Sem5.lecture46;

public interface StackI extends StackII, StackIII{
    public void push(int item);
    public int pop();
    public void peek();
    int x = 90;          // by default the variable public, static, fixed hoga

    // Java 8 - Feature
    static void hello(){

    }

    default void hello2(){

    }

    // Java 9 - feature
    private void hello3(){

    }
}
