package Sem4.lecture36;

public class Stack {
    private int[] arr;
    private int idx;
    public Stack(int n){
        arr = new int[n];
    }
    public boolean isEmpty(){
        return idx == 0;
    }
    public void push(int item) throws Exception{
        if(isfull()){
            throw new Exception("Bklol Stack Full hai");
        }
        arr[idx] = item;
        idx++;
    }
    public int pop(int item) throws Exception{
        if(isfull()){
            throw new Exception("Bklol Stack Empty hai");
        }
        idx--;
        return arr[idx];
    }
    public int peek() throws Exception{
        if(isfull()){
            throw new Exception("Bklol Stack Empty hai");
        }
        return arr[idx-1];
    }
    public void Display(){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public boolean isfull(){
        return arr.length == idx;
    }
}
