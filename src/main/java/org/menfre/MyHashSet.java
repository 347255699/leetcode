package org.menfre;

import org.menfre.type.ListNode;

/**
 * 设计哈希集合
 *
 * @author menfre
 */
public class MyHashSet {

    private ListNode[] arr;

    private int size = 0;

    public MyHashSet() {
        arr = new ListNode[8];
    }

    private void reHash() {
        ListNode[] oldArr = arr;
        arr = new ListNode[oldArr.length * 2];
        size = 0;
        for (ListNode node : oldArr) {
            while (node != null) {
                add(node.val);
                node = node.next;
            }
        }
    }

    public void add(int key) {
        if (size > arr.length * 0.75) {
            reHash();
        }
        int i = Integer.hashCode(key) % arr.length;
        if (arr[i] == null) {
            arr[i] = new ListNode(key);
        } else {
            ListNode root = arr[i];
            while (root != null) {
                if(root.val == key){
                    return;
                }
                if (root.next == null) {
                    root.next = new ListNode(key);
                    break;
                }
                root = root.next;
            }
        }
        size++;
    }

    public void remove(int key) {
        int i = Integer.hashCode(key) % arr.length;
        ListNode root = arr[i];
        ListNode pre = null;
        while (root != null) {
            if (root.val == key) {
                if (pre != null) {
                    pre.next = root.next;
                } else {
                    arr[i] = root.next;
                }
                size--;
                return;
            }
            pre = root;
            root = root.next;
        }
    }

    public boolean contains(int key) {
        int i = Integer.hashCode(key) % arr.length;
        ListNode root = arr[i];
        while (root != null) {
            if (root.val == key) {
                return true;
            }
            root = root.next;
        }
        return false;
    }

    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();
//        set.contains(72);
//        set.remove(91);
        set.add(48);
        set.add(41);
        set.add(10);
        set.add(41);
        set.add(10);
        set.add(11);
        set.add(12);
        set.remove(12);
        set.contains(96);
//        set.remove(87);
//        System.out.println(set.contains(48));
    }
}
