package Sem5.lecture45;

public class deleteNode {
    public static void main(String[] args) {

    }
    public static TreeNode deleteNode(TreeNode root, int key){
        if(root == null){
            return null;
        }
        if(root.val < key){
            root.right = deleteNode(root.right, key);
        }
        else if(root.val > key){
            root.left = deleteNode(root.left, key);
        }
        else{
            int max = max(root.left);
            root.left = deleteNode(root.left, max);

        }
        return null;
    }
    public static int max(TreeNode max){
        return 0;
    }

}
