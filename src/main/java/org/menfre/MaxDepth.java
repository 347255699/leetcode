package org.menfre;

import org.menfre.type.Node;

/**
 * N 叉树的最大深度
 *
 * @author menfre
 */
public class MaxDepth {

    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }

        int max = 0;
        for (Node child : root.children) {
            max = Math.max(max, maxDepth(child));
        }
        return 1 + max;
    }

    public static void main(String[] args) {

    }
}
