package easy.node.removeElements;

import easy.node.ListNode;

/**
 * @Description:
 * @Author : lguo
 * @Date : Created in 10:51 AM 2019/1/21
 * @Version :
 */
public class Solution {

    public ListNode removeElements(ListNode head, int val) {

        ListNode header = new ListNode(-1);
        header.next = head;
        ListNode cur = header;
        while(cur.next != null){
            if(cur.next.val == val ){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return header.next;
    }
}
