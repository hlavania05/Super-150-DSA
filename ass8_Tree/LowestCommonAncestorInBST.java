package ass8_Tree;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode1 left, right;
    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class LowestCommonAncestorInBST {
    public static TreeNode1 insert(TreeNode1 root, int val) {
        if (root == null) {
            return new TreeNode1(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static TreeNode1 lowestCommonAncestor(TreeNode1 root, int p, int q) {
        while (root != null) {
            if (p < root.val && q < root.val) {
                root = root.left;
            } else if (p > root.val && q > root.val) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        TreeNode1 root = null;

        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            root = insert(root, val);
        }

        int p = scanner.nextInt();
        int q = scanner.nextInt();


        TreeNode1 lca = lowestCommonAncestor(root, p, q);


        System.out.println(lca.val);

        scanner.close();
    }
}
