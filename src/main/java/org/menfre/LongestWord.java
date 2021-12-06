package org.menfre;

import java.util.HashMap;
import java.util.Map;

/**
 * 词典中最长的单词
 *
 * @author menfre
 */
public class LongestWord {

    public String longestWord(String[] words) {
        return null;
    }

    public static class Node {
        char c;
        Map<Character, Node> children = new HashMap<>();
        int end;

        public Node(char c) {
            this.c = c;
        }
    }

    public static class Trie {
        Node root;
        String[] words;

        public Trie() {
            root = new Node('0');
        }

        public void insert(String word, int index) {
            Node cur = root;
            for (char c : word.toCharArray()) {
                cur.children.putIfAbsent(c, new Node(c));
                cur = cur.children.get(c);
            }
            cur.end = index;
        }
    }

    public static void main(String[] args) {

    }
}
