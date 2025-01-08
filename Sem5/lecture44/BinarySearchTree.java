package Sem5.lecture44;
public class BinarySearchTree {
    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    public BinarySearchTree(int []in) {
        // TODO Auto-generated constructor stub
        root=CreateTree(in, 0,in .length-1);
    }

    private Node CreateTree(int []in,int si,int ei) {
        // TODO Auto-generated method stub
        if (si > ei) {
            return null;
        }
        int mid = (si + ei) / 2;
        Node nn = new Node();
        nn.val = in[mid];
        nn.left = CreateTree(in, si, mid - 1);
        nn.right = CreateTree(in, mid + 1, ei);
        return nn;
    }
}
