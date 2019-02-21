package easy.node.hasCycle;

import easy.node.ListNode;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 11:10 AM 2019/1/21
 * @Version :
 */
public class Solution {

    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
