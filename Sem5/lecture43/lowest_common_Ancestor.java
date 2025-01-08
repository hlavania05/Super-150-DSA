package Sem5.lecture43;
import Sem5.lecture43.TreeNode;

public class lowest_common_Ancestor {
    public static void main(String[] args) {

    }
    public TreeNode func(TreeNode root, TreeNode p, TreeNode q){
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode left = func(root.left, p, q);
        TreeNode right = func(root.right, p, q);
        if(left == null){
            return right;
        }
        else if(right == null){
            return left;
        }
        return root;
    }
}
