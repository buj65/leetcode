package code.java;

//226. 翻转二叉树
class _226 {
    public TreeNode invertTree(TreeNode root) {
        exchange(root);
        return root;
    }

    private void exchange(TreeNode node) {
        if (node != null) {
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            exchange(node.left);
            exchange(node.right);
        }
    }
}