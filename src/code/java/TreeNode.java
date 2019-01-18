package code.java;

//Definition for a binary tree node
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
/*
    二叉搜索树(二叉排序树) Binary Search Tree
        每个节点的左子树的所有节点值小于当前节点值，右子树的所有节点值大于当前节点值
        查找次数<=树的高度

    平衡二叉搜索树(AVL树) Self-balancing binary search tree
        平衡: 每个节点的左右2个子树的高度差<=1
        总节点数<=2^h-1 //h为树的高度

    红黑树
        平衡二叉搜索树的一种常用的实现方法
        在O(log n)时间内做查找、插入和删除
*/