package Sem4.lecture36;

public class Queue_Client {
    public static void main(String[] args) throws Exception {
        Queue q = new Queue(5);
        q.Enqueue(43);
        q.Enqueue(35);
        q.Enqueue(30);
        q.Enqueue(20);
        q.Enqueue(10);
        q.Display();
    }
}
