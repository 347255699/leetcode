package org.menfre;

import org.menfre.type.ListNode;

/**
 * 合并两个有序链表
 * @author menfre
 */
public class MergeTwoAscChain {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode header;
        ListNode next;

        // 屏蔽异常情况
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }

        // 记录头部
        if (l1.val < l2.val) {
            header = l1;
            l1 = l1.next;
        } else {
            header = l2;
            l2 = l2.next;
        }
        next = header;

        // 开始合并
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                next.next = l1;
                l1 = l1.next;
            } else {
                next.next = l2;
                l2 = l2.next;
            }
            next = next.next;
        }

        // 合并剩余节点
        next.next = l1 == null ? l2 : l1;
        return header;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode n2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        ListNode next = new MergeTwoAscChain().mergeTwoLists(n1, n2);
        while (next != null) {
            System.out.print(next.val + ",");
            next = next.next;
        }
    }
}
