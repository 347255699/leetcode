package org.menfre;

import org.menfre.type.TreeNode;

/**
 * 翻转二叉树
 *
 * @author menfre
 */
public class InvertTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if ((root.left == null && root.right == null)) {
            return root;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.right = left;
        root.left = right;
        return root;
    }

    public static void main(String[] args) {

    }
}
