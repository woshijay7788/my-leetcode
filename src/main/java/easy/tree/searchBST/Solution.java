package easy.tree.searchBST;

import easy.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 2:32 PM 2019/1/25
 * @Version :
 */
public class Solution {

    List<TreeNode> list = new ArrayList<>();

    public TreeNode searchBST(TreeNode root, int val) {

        if (root != null && val > root.val) {
            searchBST(root.right, val);
        }

        if (root != null && val < root.val) {
            searchBST(root.left, val);
        }

        if (val == root.val) {
            list.add(root);
        }

        return list.isEmpty() ? null : list.get(0);
    }
}
