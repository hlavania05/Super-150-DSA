package Sem5.lecture45;

public class validateBinarySearchTree {
    public static void main(String[] args) {

    }
    public BstPair ValidBST(TreeNode root){
        if (root == null){
            return new BstPair();
        }
        BstPair lbp = ValidBST(root.left);
        BstPair rbp = ValidBST(root.right);
        BstPair sbp = new BstPair();
        sbp.min = Math.min(lbp.min, Math.min(rbp.min, root.val));
        sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.val));
        sbp.isBst = lbp.isBst && rbp.isBst && root.val > lbp.max && root.val <rbp.min;
        return sbp;
    }
    class BstPair{
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        boolean isBst = true;
    }
}