package org.menfre;

import org.menfre.type.TreeNode;

/**
 * 路径总和
 *
 * @author menfre
 */
public class HasPathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null && targetSum == 0) {
            return true;
        } else if (root == null) {
            return false;
        } else {
            return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
        }
    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(5, new TreeNode(4, null, new TreeNode(11, new TreeNode(7), new TreeNode(2))), new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(new HasPathSum().hasPathSum(root, 5));
    }
}
