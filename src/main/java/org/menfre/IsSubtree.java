package org.menfre;

import org.menfre.type.TreeNode;

/**
 * 另一棵树的子树
 *
 * @author menfre
 */
public class IsSubtree {

    private int val;

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        this.val = subRoot.val;
        StringBuilder sb = new StringBuilder();
        sb.append(dfs(root, sb));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dfs(subRoot, sb2));
        return sb.toString().contains(sb2.toString());
    }

    public String dfs(TreeNode root, StringBuilder sb) {
        if (root == null) {
            return "null";
        }
        sb.append(dfs(root.left, sb));
        sb.append(dfs(root.right, sb));
        // 增加区分度
        if (root.val == val) {
            sb.append("|");
        }
        return String.valueOf(root.val);
    }

    public static void main(String[] args) {
        TreeNode subRoot = new TreeNode(1);
        TreeNode root = new TreeNode(12);

//        TreeNode subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2));
//        TreeNode root = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2)), new TreeNode(5));

        System.out.println(new IsSubtree().isSubtree(root, subRoot));
    }
}
