package Sem5.lecture43;
import Sem5.lecture43.TreeNode;

public class flip_equivalent_binary_tree {
    public static void main(String[] args) {

    }
    public static boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1 == null ||  root2 == null){
            return root1 == root2;
        }
        if(root1.val != root2.val){
            return false;
        }
        boolean flip = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
        boolean noflip = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
        return flip || noflip;
    }
}
