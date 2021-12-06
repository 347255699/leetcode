package org.menfre;

/**
 * 设计哈希集合
 *
 * @author menfre
 */
public class MyHashMap {

    public static class Entry {
        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int key;
        public int value;
        public Entry next;
    }

    private Entry[] arr;

    private int size = 0;

    public MyHashMap() {
        arr = new Entry[8];
    }

    private void reHash() {
        Entry[] oldArr = arr;
        arr = new Entry[oldArr.length * 2];
        size = 0;
        for (Entry node : oldArr) {
            while (node != null) {
                put(node.key, node.value);
                node = node.next;
            }
        }
    }

    public void put(int key, int value) {
        if (size > arr.length * 0.75) {
            reHash();
        }
        int i = Integer.hashCode(key) % arr.length;
        if (arr[i] == null) {
            arr[i] = new Entry(key, value);
        } else {
            Entry root = arr[i];
            while (root != null) {
                if (root.key == key) {
                    root.value = value;
                    return;
                }
                if (root.next == null) {
                    root.next = new Entry(key, value);
                    break;
                }
                root = root.next;
            }
        }
        size++;
    }

    public void remove(int key) {
        int i = Integer.hashCode(key) % arr.length;
        Entry root = arr[i];
        Entry pre = null;
        while (root != null) {
            if (root.key == key) {
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

    public int get(int key) {
        int i = Integer.hashCode(key) % arr.length;
        Entry root = arr[i];
        while (root != null) {
            if (root.key == key) {
                return root.value;
            }
            root = root.next;
        }
        return -1;
    }
}
