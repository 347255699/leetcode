package org.menfre;

import org.menfre.type.ListNode;

/**
 * 环形链表
 *
 * @author menfre
 */
public class HasCycle {

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        // 不同步调的指针
        ListNode p = head.next;
        ListNode q = head.next.next;
        while (p != null && q != null){
            if(p == q){
                return true;
            }
            if(q.next == null){
                return false;
            }
            p = p.next;
            q = q.next.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode last = new ListNode(-4);
        ListNode node2 = new ListNode(2, new ListNode(0, last));
        last.next = node2;
        ListNode root = new ListNode(3, node2);

//        ListNode root = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        root.setNext(node2);
//        node2.setNext(root);

//        ListNode root = new ListNode(1);
        System.out.println(new HasCycle().hasCycle(root));
    }
}
