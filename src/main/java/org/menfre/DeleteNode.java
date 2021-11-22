package org.menfre;

import org.menfre.type.ListNode;
import sun.plugin2.applet.context.NoopExecutionContext;

/**
 * 删除链表中的节点
 *
 * @author menfre
 */
public class DeleteNode {

    public void deleteNode(ListNode node) {
        ListNode curr = node;
        ListNode pre = null;
        while (curr != null) {
            ListNode next = curr.next;
            if (next != null) {
                int temp = curr.val;
                curr.val = next.val;
                next.val = temp;
                pre = curr;
            }else{
                if(pre != null) {
                    pre.next = null;
                }
            }
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(9));
        ListNode root = new ListNode(4, new ListNode(5, node));
        new DeleteNode().deleteNode(node);
        while (root !=null){
            System.out.print(root.val + ", ");
            root = root.next;
        }
    }
}
