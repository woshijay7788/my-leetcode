package easy.tree.lowestCommonAncestor1;

import easy.tree.TreeNode;

/**
 * @Description: 二叉搜索树
 * @Author : lguo
 * @Date : Created in 5:09 PM 2019/2/12
 * @Version :
 */
public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if ((root.val - p.val) * (root.val - q.val) <= 0) {
            return root;
        } else if (root.val - p.val > 0) {
            root = lowestCommonAncestor(root.left, p, q);
        } else {
            root = lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}
