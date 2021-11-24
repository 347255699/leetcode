package org.menfre;

import org.menfre.type.TreeNode;

/**
 * 左叶子之和
 *
 * @author menfre
 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }

        if (root.left != null && root.right != null) {
            return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        } else if (root.left != null) {
            return sum + sumOfLeftLeaves(root.left);
        } else if (root.right != null) {
            return sum + sumOfLeftLeaves(root.right);
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(new SumOfLeftLeaves().sumOfLeftLeaves(root));
    }
}
