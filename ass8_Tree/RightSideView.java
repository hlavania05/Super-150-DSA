package ass8_Tree;
import java.util.*;

class TreeNode1 {
    int val;
    TreeNode1 left, right;

    TreeNode1(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class RightSideView {

    // Function to build the binary tree from level order input
    public static TreeNode1 buildTree(List<Integer> levelOrder) {
        if (levelOrder == null || levelOrder.isEmpty() || levelOrder.get(0) == -1) {
            return null;
        }

        TreeNode1 root = new TreeNode1(levelOrder.get(0));
        Queue<TreeNode1> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty() && i < levelOrder.size()) {
            TreeNode1 current = queue.poll();

            // Add left child
            if (i < levelOrder.size() && levelOrder.get(i) != -1) {
                current.left = new TreeNode1(levelOrder.get(i));
                queue.add(current.left);
            }
            i++;

            // Add right child
            if (i < levelOrder.size() && levelOrder.get(i) != -1) {
                current.right = new TreeNode1(levelOrder.get(i));
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }

    // Helper function to perform DFS and collect the right side view
    private static void dfs(TreeNode1 node, int level, List<Integer> rightView) {
        if (node == null) {
            return;
        }

        // If this is the first node we're visiting at this level, add it to the right view
        if (level == rightView.size()) {
            rightView.add(node.val);
        }

        // First go to the right, then to the left
        dfs(node.right, level + 1, rightView);
        dfs(node.left, level + 1, rightView);
    }

    // Function to get the right side view of the binary tree
    public static List<Integer> rightSideView(TreeNode1 root) {
        List<Integer> rightView = new ArrayList<>();
        dfs(root, 0, rightView);
        return rightView;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> levelOrder = new ArrayList<>();

        // Read level order input
        while (scanner.hasNextInt()) {
            levelOrder.add(scanner.nextInt());
        }

        // Build the tree
        TreeNode1 root = buildTree(levelOrder);

        // Get the right side view and print it
        List<Integer> rightView = rightSideView(root);
        for (int val : rightView) {
            System.out.print(val + " ");
        }
    }
}

