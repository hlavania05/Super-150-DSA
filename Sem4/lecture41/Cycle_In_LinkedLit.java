package Sem4.lecture41;

public class Cycle_In_LinkedList {
    class Node {
        int val;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;
    public void addFirst(int item) {
        Node nn = new Node();
        nn.val = item;
        if (size == 0) {
            head = nn;
            tail = nn;
            size++;
        } else {
            nn.next = head;
            head = nn;
            size++;
        }

    }
    public void addLast(int item) {
        if (size == 0) {
            addFirst(item);
        } else {
            Node nn = new Node();
            nn.val = item;
            tail.next = nn;
            tail = nn;
            size++;
        }

    }
    public Node GetNode(int k) throws Exception {
        if (k < 0 || k >= size) {
            throw new Exception("Bklol k range me do");
        }

        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println(".");
    }
    public void createCycle() throws Exception{
        Node nn = GetNode(2);
        tail.next = nn;
    }
    public static void main(String[] args) throws Exception{
        Cycle_In_LinkedList cl = new Cycle_In_LinkedList();
        cl.addLast(10);
        cl.addLast(20);
        cl.addLast(30);
        cl.addLast(40);
        cl.addLast(50);
        cl.addLast(60);
        cl.addLast(70);
        cl.addLast(80);
        cl.addLast(90);
        cl.addLast(15);
        cl.addLast(25);
        cl.addLast(35);
        cl.createCycle();
        cl.Display();
    }
}
