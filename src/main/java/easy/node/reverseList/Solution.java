package easy.node.reverseList;

import easy.node.ListNode;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 10:44 AM 2019/1/21
 * @Version :
 */
public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
