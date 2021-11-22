package org.menfre;

import org.menfre.type.ListNode;

/**
 * 移除链表元素
 *
 * @author menfre
 */
public class RemoveChainElement {

    public ListNode removeElements(ListNode head, int val) {
        ListNode next = head;
        ListNode pre = null;
        while (next != null) {
            if (next == head && next.val == val) {
                // 头部匹配
                head = next.next;
                next = head;
            } else if (next.val == val) {
                // 其他情况
                pre.next = next.next;
                next = next.next;
            } else {
                pre = next;
                next = next.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7)))))));
        ListNode next = new RemoveChainElement().removeElements(root, 7);
        while (next != null) {
            System.out.print(next.val + ", ");
            next = next.next;
        }
    }
}
