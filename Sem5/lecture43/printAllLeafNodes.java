package Sem5.lecture43;
import java.util.*;
class BT {
    class Node {
        int val;
        Node left;
        Node right;

        public Node(int data) {
            this.val = data;
        }
    }

    private Node root;
    public BT() {
        this.root = buildTree();
    }

    private Node buildTree() {
        Scanner sc = new Scanner(System.in);
        int rootdata = sc.nextInt();
        Node nn = new Node(rootdata);
        Queue<Node> q = new LinkedList<>();
        q.offer(nn);
        while (!q.isEmpty()) {
            Node node = q.poll();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            if (c1 != -1) {
                Node child = new Node(c1);
                node.left = child;
                q.offer(child);
            }
            if (c2 != -1) {
                Node child = new Node(c2);
                node.right = child;
                q.offer(child);
            }
        }
        return nn;
    }
    public void printLeaf(){
        print(this.root);
    }
    private void print(Node root){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            System.out.print(root.val + " ");
            return;
        }
        print(root.left);
        print(root.right);
    }
}
public class printAllLeafNodes {
    public static void main(String[] args) {
        BT bt = new BT();
        bt.printLeaf();

    }
}
