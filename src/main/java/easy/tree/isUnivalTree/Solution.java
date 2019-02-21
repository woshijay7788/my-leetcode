package easy.tree.isUnivalTree;

import easy.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 3:19 PM 2019/1/22
 * @Version :
 */
public class Solution {

    List<Integer> list = new ArrayList<>();

    public boolean isUnivalTree(TreeNode root) {
        int value = root.val;
        dfs(root);

        for (Integer i : list) {
            if (i != list.get(0)) {
                return false;
            }
        }
        return true;
    }

    public void dfs(TreeNode node) {

        if (node != null) {
            list.add(node.val);
            dfs(node.left);
            dfs(node.right);
        }

    }
}
