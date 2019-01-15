package code.java;

public class _098 {
    // BST: Binary Search Tree
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, -1L + Integer.MIN_VALUE, 1L + Integer.MAX_VALUE);
    }

    // node.val∈(min,max)
    private boolean isValidBST(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }
        if (node.val <= min || node.val >= max) {
            return false;
        }
        return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
    }
}
