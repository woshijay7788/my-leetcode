package easy.tree.maxDepth1;

import easy.tree.TreeNode;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 3:54 PM 2019/1/21
 * @Version :
 */
public class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left_height = maxDepth(root.left);
            int right_height = maxDepth(root.right);
            return Math.max(left_height, right_height) + 1;
        }
    }
}
