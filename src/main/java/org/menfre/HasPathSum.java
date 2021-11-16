package org.menfre;

import org.menfre.type.TreeNode;

/**
 * 路径总和
 *
 * @author menfre
 */
public class HasPathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        // 排除跟节点为 null 的情况
        if(root == null){
            return false;
        }

        // 左右都有子节点，只要有一个子节点满足加和条件即可
        if(root.left != null && root.right != null){
            return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
        }
        // 排除非叶子节点的结果
        else if(root.left != null){
            return hasPathSum(root.left, targetSum - root.val);
        }
        // 排除非叶子节点的结果
        else if(root.right != null){
            return hasPathSum(root.right, targetSum - root.val);
        }
        // 判断叶子节点是否为目标差
        else {
            return root.val == targetSum;
        }
    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(5, new TreeNode(4, null, new TreeNode(11, new TreeNode(7), new TreeNode(2))), new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(new HasPathSum().hasPathSum(root, 22));
    }
}
