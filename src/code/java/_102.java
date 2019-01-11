package code.java;

import java.util.ArrayList;
import java.util.List;

public class _102 {
    // 广度优先遍历(Breadth-First Search)
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrder(result, root, 0);
        return result;
    }

    private void levelOrder(List<List<Integer>> result, TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (result.size() - 1 < level) {
            result.add(new ArrayList<Integer>());
        }
        result.get(level).add(node.val);
        levelOrder(result, node.left, level + 1);
        levelOrder(result, node.right, level + 1);
    }
}
