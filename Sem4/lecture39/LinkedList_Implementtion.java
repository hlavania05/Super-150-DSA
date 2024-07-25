package Sem4.lecture39;

public class LinkedList_Implementtion {
    class Node{
        int data;
        Node next;
        public Node(int item){
            this.data = item;
            this.next = null;
        }
    }
    private int size;
    private Node head;
    private Node tail;

    //  Method to add at first position
    public void addFirst(int item){
        Node nn = new Node(item);
        if(size == 0){
            head = nn;
            tail = nn;
            size++;
            return;
        }
        nn.next = head;
        head = nn;
        size++;
    }

    // Method to add at last position
    public void addLast(int item){
        Node nn = new Node(item);
        if(size == 0){
            head = nn;
            tail = nn;
            size++;
            return;
        }
        tail.next = nn;
        tail = nn;
        size++;
    }

    // Add at index k
    public void addAtIndex(int item, int k){
        if(size == 0){
            addFirst(item);
            return;
        }
        if(k == size){
            addLast(item);
            return;
        }
        Node nn = new Node(item);
        Node curr = getNode(k-1);
        Node temp = curr.next;
        curr.next = nn;
        nn.next = temp;
        size++;
    }

    // Method to print the LinkedList
    public void display(){
        if(size == 0){
            System.out.println("List is Empty!");
            return;
        }
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    // method to get the kth node
    public Node getNode(int k){
        Node curr = head;
        int i = 0;
        while(i < k){
            curr = curr.next;
            i++;
        }
        return curr;
    }

    // method to get first item
    public int getfirst(){
        return head.data;
    }

    // method to get last item
    public int getlast(){
        return tail.data;
    }

    // method to get kth data
    public int getAtIndex(int k){
        return getNode(k).data;
    }

    // method to remove first node
    public void removeFirst(){
        if(size == 1){
            head = null;
            tail = null;
            size--;
            return;
        }
        Node temp = head.next;
        head.next = null;
        head = temp;
        size--;
    }

    // method to remove last node
    public void removeLast(){
        if(size == 1){
            removeFirst();
            return;
        }
        Node temp = getNode(size - 2);
        temp.next = null;
        tail = temp;
        size--;
    }
    // method to remove at given index node
    public void removeATIndex(int k){
        if(k == 0){
            removeFirst();
            return;
        }
        if(k == size-1){
            removeLast();
            return;
        }
        Node temp1 = getNode(k-1);
        temp1.next = temp1.next.next;
        size--;
    }

    public static void main(String[] args) {
        LinkedList_Implementtion ll = new LinkedList_Implementtion();
        ll.addFirst(5);
        ll.addFirst(9);
        ll.display();

        ll.addLast(8);
        ll.display();
        System.out.println(ll.tail.data);

        System.out.println(ll.getNode(2));

        ll.addAtIndex(13, 1);
        ll.addAtIndex(34, 2);
        ll.display();

        System.out.println(ll.getfirst());
        System.out.println(ll.getlast());

        System.out.println(ll.getAtIndex(3));

        ll.removeFirst();
        ll.display();

        System.out.println(ll.size);
        ll.removeLast();
        ll.display();


        ll.addFirst(45);
        ll.addFirst(23);
        ll.display();

        ll.removeATIndex(3);
        ll.display();
    }
}
