package org.menfre;

import org.menfre.type.TreeNode;

/**
 * 二叉树的最大深度
 *
 * @author menfre
 */
public class BinaryTreeMaxDepth {

    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }

    private int maxDepth(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }
        depth++;
        return Math.max(maxDepth(root.left, depth), maxDepth(root.right, depth));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(new BinaryTreeMaxDepth().maxDepth(root));
    }
}
