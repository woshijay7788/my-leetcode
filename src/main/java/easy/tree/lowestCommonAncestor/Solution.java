package easy.tree.lowestCommonAncestor;

import easy.tree.TreeNode;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 2:40 PM 2019/1/21
 * @Version :
 */
public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);

        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left == null ? right : left;
    }
}
