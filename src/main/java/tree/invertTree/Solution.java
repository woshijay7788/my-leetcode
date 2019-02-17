package tree.invertTree;

import tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 11:04 AM 2019/1/22
 * @Version :
 */
public class Solution {

    public TreeNode invertTree(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null) {
            return root;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            while (count > 0) {
                TreeNode node = queue.poll();
                TreeNode left = node.left;
                node.left = node.right;
                node.right = left;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                count--;
            }
        }
        return root;
    }

    public TreeNode invertTree1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return root;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            while (count > 0) {
                TreeNode node = queue.poll();
                TreeNode left = node.left;
                node.left = node.right;
                node.right = left;

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
                count--;
            }
        }
        return root;
    }
}
