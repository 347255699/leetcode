package org.menfre;

import org.menfre.type.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 回文链表
 *
 * @author menfre
 */
public class IsPalindromeChain {

    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        ListNode pre = null;

        List<Integer> arr = new ArrayList<>();
        while (curr != null) {
            arr.add(curr.val);
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        int i = 0;
        while (pre != null){
            if(arr.get(i) != pre.val){
                return false;
            }
            pre = pre.next;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
//        ListNode root = new ListNode(1, new ListNode(0, new ListNode(0)));
        ListNode root = new ListNode(1, new ListNode(2));
//        ListNode root = new ListNode(1, new ListNode(0, new ListNode(1)));
//        ListNode root = new ListNode(1, new ListNode(1));
//        ListNode root = new ListNode(1);
        System.out.println(new IsPalindromeChain().isPalindrome(root));
    }
}
