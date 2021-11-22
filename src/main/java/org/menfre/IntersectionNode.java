package org.menfre;

import org.menfre.type.ListNode;

/**
 * 相交链表
 *
 * @author menfre
 */
public class IntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        int p1 = 0;
        int q1 = 0;
        while (p != null && q != null) {
            if (p == q) {
                return p;
            }
            if(p.next == null && p1 == 0){
                p = headB;
                p1 = 1;
            }else{
                p = p.next;
            }
            if(q.next == null && q1 == 0){
                q = headA;
                q1 = 1;
            }else{
                q = q.next;
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
