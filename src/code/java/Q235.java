package code.java;

public class Q235 {
    /*
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int l = p.val, r = q.val;
        if (l > r) {
            l = q.val;
            r = p.val;
        }
        return lowestCommonAncestor(root, l, r);
    }

    private TreeNode lowestCommonAncestor(TreeNode node, int l, int r) {
        if (node.val >= l && node.val <= r) {
            return node;
        }
        return lowestCommonAncestor(node.val < l ? node.right : node.left, l, r);
    }
    */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int l = p.val, r = q.val;
        TreeNode node = root;
        if (l > r) {
            l = q.val;
            r = p.val;
        }
        while (node != null) {
            if (node.val >= l && node.val <= r) {
                return node;
            }
            node = node.val < l ? node.right : node.left;
        }
        return null;
    }
}
