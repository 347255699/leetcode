package org.menfre;

import org.menfre.type.TreeNode;

/**
 * 根据二叉树创建字符串
 *
 * @author menfre
 */
public class Tree2str {

    private StringBuilder sb = new StringBuilder();

    public String tree2str(TreeNode root) {
        dfs(root);
        return sb.subSequence(1, sb.length() - 1).toString();
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            sb.append("()");
            return;
        }
        sb.append("(");
        sb.append(root.val);
        if (root.left != null || root.right != null) {
            dfs(root.left);
        }
        if (root.right != null) {
            dfs(root.right);
        }
        sb.append(")");
    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3));
        System.out.println(new Tree2str().tree2str(root));
    }
}
