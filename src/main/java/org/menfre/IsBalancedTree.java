package org.menfre;

import org.menfre.type.TreeNode;

/**
 * 检测是否为平衡二叉树
 *
 * @author menfre
 */
public class IsBalancedTree {

    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        if(Math.abs(maxDepth(root.left, 0) - maxDepth(root.right, 0)) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int maxDepth(TreeNode root, int depth) {
        if(root == null){
            return depth;
        }
        depth++;
        return Math.max(maxDepth(root.left, depth), maxDepth(root.right, depth));
    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
//        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), new TreeNode(2));
        System.out.println(new IsBalancedTree().isBalanced(null));
    }
}
