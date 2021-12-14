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
        Trie trie = new Trie();
        int index = 0;
        for (String word : words) {
            trie.insert(word, ++index);
        }
        trie.words = words;
        trie.dfs(trie.root);
        return trie.ans;
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
        private final Node root;
        public String[] words;
        public String ans = "";

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

        public void dfs(Node root) {
            if (root.children.isEmpty()) {
                return;
            }
            if (root.end > 0 || this.root == root) {
                if (this.root != root) {
                    String word = words[root.end - 1];
                    if (word.length() > ans.length() || (word.length() == ans.length() && word.compareTo(ans) < 0)) {
                        ans = word;
                    }
                }
                for (Node node : root.children.values()) {
                    dfs(node);
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
