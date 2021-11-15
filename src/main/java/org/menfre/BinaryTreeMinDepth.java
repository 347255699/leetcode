package org.menfre;

import org.menfre.type.TreeNode;

/**
 * 二叉树的最小深度
 *
 * @author menfre
 */
public class BinaryTreeMinDepth {

    public int minDepth(TreeNode root) {
        return minDepth(root, 0);
    }

    private int minDepth(TreeNode root, int depth) {
        if(root == null){
            return depth;
        }
        depth++;
        if (root.left != null && root.right != null){
            return Math.min(minDepth(root.left, depth), minDepth(root.right, depth));
        }else if(root.right !=null){
            return minDepth(root.right, depth);
        }else if(root.left != null){
            return minDepth(root.left, depth);
        }else{
            return depth;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(new BinaryTreeMinDepth().minDepth(root));
    }
}
