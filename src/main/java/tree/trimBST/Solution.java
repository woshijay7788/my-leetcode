package tree.trimBST;

import tree.TreeNode;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 5:42 PM 2019/1/30
 * @Version :
 */
public class Solution {

    public TreeNode trimBST(TreeNode root, int L, int R) {

        if (root == null) {
            return root;
        }

        if (root.val > R) {
            return trimBST(root.left, L, R);
        }

        if (root.val < L) {
            return trimBST(root.right, L, R);
        }

        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }
}
