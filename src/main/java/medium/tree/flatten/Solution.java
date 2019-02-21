package medium.tree.flatten;

import medium.tree.TreeNode;

public class Solution {

    public void flatten(TreeNode root) {


        if (root == null) {
            return;
        }

        flatten(root.left);
        flatten(root.right);

        if (root.left != null) {
            TreeNode right = root.right;//记录右节点
            root.right = root.left;
            root.left = null;//将左节点置空
            TreeNode node = root.right;//到左节点的最后一个节点
            while (node.right != null) {
                node = node.right;
            }
            node.right = right;
        }

    }
}
