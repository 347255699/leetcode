package org.menfre;

import org.menfre.type.ListNode;

/**
 * 反转链表
 * @author menfre
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode pre = null;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode root = new ReverseList().reverseList(new ListNode(1, new ListNode(2, new ListNode(3))));
        while (root != null){
            System.out.print(root.val + ", ");
            root = root.next;
        }
    }
}
