package easy.tree.levelOrder;

import easy.tree.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 10:25 AM 2019/1/29
 * @Version :
 */
public class Solution {

    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }


        LinkedList<Node> queue = new LinkedList<>();
        queue.addLast(root);
        while (!queue.isEmpty()) {
            List<Node> nodeList = new ArrayList<>();
            while (!queue.isEmpty()) {
                Node node = queue.pollFirst();
                nodeList.add(node);
            }

            List<Integer> list = new ArrayList<>();
            for (Node node : nodeList) {
                list.add(node.val);
                if (node.children != null && !node.children.isEmpty()) {
                    for (Node children : node.children) {
                        queue.addLast(children);
                    }
                }
            }
            result.add(list);
        }

        return result;
    }
}
