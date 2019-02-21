package easy.tree.mergeTrees;

import easy.tree.TreeNode;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 10:46 AM 2019/1/22
 * @Version :
 */
public class Solution {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }

        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t1.right);
        return t1;
    }
}
