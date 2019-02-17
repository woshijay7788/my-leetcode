package tree.levelOrderBottom2;

import tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 2:04 PM 2019/1/29
 * @Version :
 */
public class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {


        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        process(result, list);

        return result;
    }

    private void process(List<List<Integer>> result, LinkedList<TreeNode> queue) {
        int size = queue.size();
        int count = 0;
        List<Integer> list= new ArrayList<>();
        while (count < size) {
            TreeNode node = queue.poll();
            count++;
            list.add(node.val);

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }

        }

        if (!queue.isEmpty()) {
            process(result, queue);
        }

        result.add(list);
    }
}
