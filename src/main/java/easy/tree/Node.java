package easy.tree;

import java.util.List;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 3:40 PM 2019/1/21
 * @Version :
 */
public class Node {

    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
