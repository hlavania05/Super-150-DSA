package Sem5.lecture43;
import java.util.*;

class Mybt {
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public void CreateTree(int[] pre, int[] in, int preIdx, int low, int high) {
        this.root = create(pre, in, 0, low, high);
    }

    private Node create(int[] pre, int[] in, int preIdx, int low, int high) {
        if (preIdx >= pre.length || low > high) {
            return null;
        }

        int rootitem = pre[preIdx];
        Node root = new Node(rootitem);
        int mid = find(in, rootitem);

        preIdx++; // Increment preIdx for the next node
        // Create left and right subtrees
        root.left = create(pre, in, preIdx, low, mid - 1);
        root.right = create(pre, in, preIdx, mid + 1, high);

        return root;
    }

    private int find(int[] in, int rootitem) {
        for (int i = 0; i < in.length; i++) {
            if (in[i] == rootitem) {
                return i;
            }
        }
        return -1;
    }

    public void Display() {
        display(this.root);
    }

    private void display(Node root) {
        if (root == null) {
            return;
        }

        String s = " => " + root.data + " <= ";
        if (root.left != null) {
            s = root.left.data + s;
        } else {
            s = "END" + s;
        }
        if (root.right != null) {
            s = s + root.right.data;
        } else {
            s = s + "END";
        }

        System.out.println(s);
        display(root.left);
        display(root.right);
    }
}

public class CreateTreefrom_PreorderANDInorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] pre = new int[n1];
        for (int i = 0; i < n1; i++) {
            pre[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] in = new int[n2];
        for (int i = 0; i < n2; i++) {
            in[i] = sc.nextInt();
        }

        Mybt bt = new Mybt();
        bt.CreateTree(pre, in, 0, 0, n1 - 1);
        bt.Display();
    }
}

