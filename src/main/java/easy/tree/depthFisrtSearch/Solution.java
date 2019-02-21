package easy.tree.depthFisrtSearch;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 3:24 PM 2019/1/21
 * @Version :
 */
public class Solution {

    public void depthFisrtSearch() {
        Stack<Map<String, Object>> nodeStack = new Stack<Map<String, Object>>();
        Map<String, Object> node = new HashMap<String, Object>();
        nodeStack.add(node);
        while (!nodeStack.isEmpty()) {
            node = nodeStack.pop();
            System.out.println(node);
            //获得节点的子节点，对于二叉树就是获得节点的左子结点和右子节点
            List<Map<String, Object>> children = getChildren(node);
            if (children != null && !children.isEmpty()) {
                for (Map child : children) {
                    nodeStack.push(child);
                }
            }
        }
    }

    private List<Map<String,Object>> getChildren(Map<String, Object> node) {

        return null;
    }

    public void breadthFirstSearch() {
        Deque<Map<String, Object>> nodeDeque = new ArrayDeque<Map<String, Object>>();
        Map<String, Object> node = new HashMap<String, Object>();
        nodeDeque.add(node);
        while (!nodeDeque.isEmpty()) {
            node = nodeDeque.peekFirst();
            System.out.println(node);
            //获得节点的子节点，对于二叉树就是获得节点的左子结点和右子节点
            List<Map<String, Object>> children = getChildren(node);
            if (children != null && !children.isEmpty()) {
                for (Map child : children) {
                    nodeDeque.add(child);
                }
            }
        }
    }
}
