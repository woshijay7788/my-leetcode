package easy.tree.minDepth;

import easy.tree.TreeNode;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 4:03 PM 2019/1/21
 * @Version :
 */
public class Solution {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if ((root.left == null) && (root.right == null)) {
            return 1;
        }

        int min_depth = Integer.MAX_VALUE;
        if (root.left != null) {
            min_depth = Math.min(minDepth(root.left), min_depth);
        }
        if (root.right != null) {
            min_depth = Math.min(minDepth(root.right), min_depth);
        }

        return min_depth + 1;
    }
}
