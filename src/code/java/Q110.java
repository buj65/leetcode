package code.java;

public class Q110 {
    private boolean result = true;

    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return result;
    }

    private int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int l = maxDepth(node.left);
        int r = maxDepth(node.right);
        if (Math.abs(l - r) > 1) {
            result = false;
        }
        return 1 + Math.max(l, r);
    }
}
