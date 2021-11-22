package org.menfre;

import org.menfre.type.ListNode;

/**
 * 删除链表中的重复元素
 *
 * @author menfres
 */
public class RemoveDuplicatesInChain {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode next = head;
        while (next != null){
            while (next.next != null && next.val == next.next.val){
                next.next = next.next.next;
            }
            next = next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node = new RemoveDuplicatesInChain().deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, null))))));
        while (node != null){
            System.out.print(node.val + ", ");
            node = node.next;
        }
    }
}
