package Sem5.lecture43;
import Sem5.lecture43.TreeNode;

public class SumRootToLeafNode {
    public static void main(String[] args) {

    }
    public int Number(TreeNode root, int sum){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return sum * 10 + root.val;
        }
        int left = Number(root.left, sum * 10 + root.val);
        int right = Number(root.right, sum * 10 + root.val);
        return left + right;
    }
}
