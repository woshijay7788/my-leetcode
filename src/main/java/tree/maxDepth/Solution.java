package tree.maxDepth;

import tree.Node;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 3:39 PM 2019/1/21
 * @Version :
 */
public class Solution {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        } else if (root.children.isEmpty()) {
            return 1;
        } else {
            List<Integer> heights = new LinkedList<>();
            for (Node item : root.children) {
                heights.add(maxDepth(item));
            }
            return Collections.max(heights) + 1;
        }
    }
}
