package Sem5.lecture43;

public class PathSumIII {
    public static void main(String[] args) {

    }
    static int count = 0;
    public void func(TreeNode root, int targetSum){
        if(root == null){
            return;
        }
        if(targetSum - root.val == 0){
            count++;
        }
        func(root.left, targetSum-root.val);
        func(root.right, targetSum-root.val);
    }
}
