package Sem5.lecture43;
import Sem5.lecture42.BinaryTree;
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     public TreeNode(int val) { this.val = val; }
     public TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

public class isSymmetryTree {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

    }
    public boolean isSymmentry(TreeNode root1, TreeNode root2){
        if(root1 == null || root2 == null){
            return root1 == root2;
        }
        if(root1.val != root2.val){
            return false;
        }
        boolean left = isSymmentry(root1.left, root1.right);
        boolean right = isSymmentry(root1.right, root2.left);
        return left && right;
    }
}
