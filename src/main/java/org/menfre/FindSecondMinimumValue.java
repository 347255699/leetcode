package org.menfre;

import org.menfre.type.TreeNode;

/**
 * 二叉树中第二小的节点
 *
 * @author menfre
 */
public class FindSecondMinimumValue {

    int ans;
    int rootvalue;

    public int findSecondMinimumValue(TreeNode root) {
        ans = -1;
        rootvalue = root.val;
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        if (ans != -1 && node.val >= ans) {
            return;
        }
        if (node.val > rootvalue) {
            ans = node.val;
        }
        dfs(node.left);
        dfs(node.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(2), new TreeNode(5, new TreeNode(5), new TreeNode(7)));
        System.out.println(new FindSecondMinimumValue().findSecondMinimumValue(root));
    }
}
