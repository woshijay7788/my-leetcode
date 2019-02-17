package node.middleNode;

import java.util.ArrayList;
import java.util.List;
import node.ListNode;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 11:03 AM 2019/2/12
 * @Version :
 */
public class Solution {

    public ListNode middleNode(ListNode head) {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        List<ListNode> list = new ArrayList<>();

        ListNode cur = head;

        while (cur != null){
            list.add(cur);
            cur = cur.next;
        }

        return list.get(list.size() / 2);
    }


    /*public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }*/
}
