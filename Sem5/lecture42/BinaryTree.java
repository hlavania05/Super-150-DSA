package Sem5.lecture42;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    private Node root;
    class Node {
        int val;
        Node left;
        Node right;
    }
    public BinaryTree(){
        root = CreateTree();
    }
    Scanner sc = new Scanner(System.in);
    private Node CreateTree(){
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;
        boolean hlc = sc.nextBoolean();
        if (hlc) {
            nn.left = CreateTree();
        }
        boolean hrc = sc.nextBoolean();
        if(hrc){
            nn.right = CreateTree();
        }
        return nn;
    }
    public void Display(){
        Display(root);
    }

    private void Display(Node node){
        if(node == null){
            return;
        }
        String s = "";
        s = "<--" + node.val + "-->";
        if(node.left != null){
            s = node.left.val + s;
        }
        else{
            s = "." + s;
        }
        if(node.right != null){
            s = s + node.right.val;
        }
        else{
            s = s + ".";
        }
        System.out.println(s);
        Display(node.left);
        Display(node.right);
    }
    public int max(){
        return max(root);
    }
    private int max(Node nn) {
        if (nn == null) {
            return Integer.MIN_VALUE;
        }
        int leftMax = max(nn.left);
        int rightMax = max(nn.right);
        return Math.max(nn.val, Math.max(leftMax, rightMax));
    }
    public boolean find(int item){
        return find(root, item);
    }
    private boolean find(Node node, int item){
        if(root == null){
            return false;
        }
        if(node.val == item){
            return true;
        }
        boolean left = find(node.left, item);
        boolean right = find(node.right, item);
        return left || right;
    }
    public int height(){
        return height(root);
    }
    private int height(Node node){
        if(node == null){
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
    public void PreOrder(){
        PreOrder(root);
        System.out.println();
    }
    private void PreOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.val + " ");
        PreOrder(node.left);
        PreOrder(node.right);
    }
    public void PostOrder(){
        PostOrder(root);
        System.out.println();
    }
    private void PostOrder(Node node){
        if(node == null) {
            return;
        }
        PreOrder(node.left);
        PreOrder(node.right);
        System.out.print(node.val + " ");
    }
    public void InOrder(){
        InOrder(root);
        System.out.println();
    }
    private void InOrder(Node node){
        if(node == null) {
            return;
        }
        InOrder(node.left);
        InOrder(node.right);
        System.out.print(node.val + " ");
    }
    public void levelOrder(){
        levelOrder(root);
        System.out.println();
    }
    private void levelOrder(Node node){
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()){
            Node rv = q.poll();
            System.out.print(rv.val + " ");
            if(rv.left != null){
                q.add(rv.left);
            }
            if(rv.right != null){
                q.add(rv.right);
            }
        }
        System.out.println();

    }


}
