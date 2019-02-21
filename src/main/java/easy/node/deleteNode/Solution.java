package easy.node.deleteNode;

import easy.node.ListNode;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 10:33 AM 2019/1/21
 * @Version :
 */
public class Solution {

    public void deleteNode(ListNode node) {

        node.val=node.next.val;
        node.next=node.next.next;

    }
}