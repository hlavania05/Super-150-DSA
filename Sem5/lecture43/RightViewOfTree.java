package Sem5.lecture43;
import java.util.*;

class BinaryTree {
    class Node{
        int val;
        Node left;
        Node right;
        public Node(int data){
            this.val = data;
        }
    }
    private Node root;
    public BinaryTree(){
        this.root = buildTree();
    }
    private Node buildTree(){
        Scanner sc = new Scanner(System.in);
        int rootdata = sc.nextInt();
        Node nn = new Node(rootdata);
        Queue<Node> q = new LinkedList<>();
        q.offer(nn);
        while(!q.isEmpty()){
            Node node = q.poll();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            if(c1 != -1){
                Node child = new Node(c1);
                node.left = child;
                q.offer(child);
            }
            if(c2 != -1){
                Node child = new Node(c2);
                node.right = child;
                q.offer(child);
            }
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
    public void rightView(){
        rightview(this.root, 1);
    }
    static int maxdepth = 0;
    private void rightview(Node root, int currlevel){
        if(root == null){
            return;
        }
        if(maxdepth < currlevel){
            System.out.print(root.val + " ");
            maxdepth = currlevel;
        }
        rightview(root.right, currlevel+1);
        rightview(root.left, currlevel+1);
    }
}

public class RightViewOfTree {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.Display();
        bt.rightView();
    }

}
