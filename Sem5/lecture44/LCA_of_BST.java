package Sem5.lecture44;
import java.util.*;
class BST{
    public class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
    private Node root;
    public void InsertIntoBST(int data){
        this.root = InsertBST(this.root, data);
    }
    private Node InsertBST(Node root, int item){
        if(root == null){
            return new Node(item);
        }
        if(root.data > item){
            root.left = InsertBST(root.left, item);
        }
        else{
            root.right = InsertBST(root.right, item);
        }
        return root;
    }
    public void Display(){
        DisplayBST(this.root);
    }
    private void DisplayBST(Node root){
        if(root == null){
            return;
        }
        String s = "<--" + root.data + "-->";
        if(root.left != null){
            s = root.left.data + s;
        }
        else{
            s = "END" + s;
        }
        if(root.right != null){
            s = s + root.right.data;
        }
        else{
            s = s + "END";
        }
        System.out.println(s);
        DisplayBST(root.left);
        DisplayBST(root.right);
    }
    public int LCA(int a, int b){
        return LCAofBST(this.root, a, b);
    }
    private int LCAofBST(Node root, int a, int b){
        while(root != null){
            if(a < root.data && b < root.data){
                root = root.left;
            }
            else if(a > root.data && b > root.data){
                root = root.right;
            }
            else{
                return root.data;
            }
        }
        return root.data;
    }

}
class LCA_of_BST {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        BST bst = new BST();
        while(size > 0){
            int val = sc.nextInt();
            bst.InsertIntoBST(val);
            size--;
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(bst.LCA(a, b));

    }
}