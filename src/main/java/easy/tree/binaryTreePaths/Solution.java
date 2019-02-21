package easy.tree.binaryTreePaths;

import java.util.ArrayList;
import java.util.List;
import easy.tree.TreeNode;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 4:01 PM 2019/2/12
 * @Version :
 */
public class Solution {

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        dfs("", result, root);

        return result;
    }

    public void dfs(String value, List<String> list, TreeNode node) {

        if (node == null) {
            return;
        }


        value += node.val + " ";
        if (node.left == null && node.right == null) {
            list.add(value.trim().replace(" ", "->"));
        }

        if (node.left != null) {
            dfs(value, list, node.left);
        }

        if (node.right != null) {
            dfs(value, list, node.right);
        }

    }

    public static void main(String[] args) {
        System.out.println("a b c a ".trim().replace(" ", "->"));
        System.out.println("a b c a ".trim());
    }
}
