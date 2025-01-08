package Sem5.lecture48;
import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
public class Merge_k_Sorted_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        ListNode[] list = new ListNode[k];
        for(int i = 0; i < k; i++) {
             ListNode head = new ListNode(sc.nextInt());
             list[i] = head;

             ListNode curr = head;
             for(int j=1; j<n; j++){
                 curr.next = new ListNode(sc.nextInt());
                 curr = curr.next;
             }
        }

        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });

        // Add the head of each list to the priority queue
        for (int i = 0; i < k; i++) {
            ListNode node = list[i];
            pq.add(node);
        }

        ListNode Dummy = new ListNode();
        ListNode temp = Dummy;

        while (!pq.isEmpty()) {
            ListNode rv = pq.poll();
            Dummy.next = rv;
            Dummy = Dummy.next;
            if (rv.next != null) {
                pq.add(rv.next);
            }
        }
        Display(temp.next);
    }

    public static void Display(ListNode head) {
        ListNode curr = head;
        while(curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
