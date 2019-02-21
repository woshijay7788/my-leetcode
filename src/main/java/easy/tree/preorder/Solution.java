package easy.tree.preorder;

import easy.tree.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 3:33 PM 2019/1/22
 * @Version :
 */
public class Solution {

    public List<Integer> preorder(Node root) {

        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        Stack<Node> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            list.add(node.val);

            if (node.children != null) {
                for (int i = node.children.size() - 1; i >= 0; i--) {
                    stack.add(node.children.get(i));
                }
            }

        }

        return list;
    }

    public List<Integer> res = new ArrayList<Integer>();

    public List<Integer> preorder1(Node root) {
        if (root == null) {
            return res;
        }
        res.add(root.val);
        for (Node node : root.children) {
            preorder1(node);
        }
        return res;
    }
}
