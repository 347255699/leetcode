package org.menfre;

import org.menfre.type.TreeNode;

/**
 * 二叉树的坡度
 *
 * @author menfre
 */
public class FindTilt {

    private int ans = 0;

    public int findTilt(TreeNode root) {
        dfs(root);
        return ans;
    }

    private int dfs(TreeNode root) {
        if(root == null){
            return 0;
        }

        int left = dfs(root.left);
        int right = dfs(root.right);
        ans += Math.abs(left - right);
        return left + right + root.val;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(new FindTilt().findTilt(root));
    }
}
