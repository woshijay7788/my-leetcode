package tree.findTilt;

import tree.TreeNode;

public class Solution {


    int tilt = 0;
    public int findTilt(TreeNode root) {

        if (root == null) {
            return 0;
        }
        traverse(root);
        return tilt;
    }

    public int traverse(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = traverse(root.left);
        int right = traverse(root.right);

        tilt += Math.abs(left - right);

        return left + right + root.val;
    }
}
