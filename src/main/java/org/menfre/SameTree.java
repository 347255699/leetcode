package org.menfre;

import org.menfre.type.TreeNode;

/**
 * 相同的树
 *
 * @author menfre
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == null && q == null;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }


    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
        TreeNode q = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null));
//        TreeNode p = new TreeNode(1, new TreeNode(2, null, null), null);
//        TreeNode q = new TreeNode(1, null, new TreeNode(2, null, null));
//        TreeNode p = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(1, null, null));
//        TreeNode q = new TreeNode(1, new TreeNode(1, null, null), new TreeNode(2, null, null));
        System.out.println(new SameTree().isSameTree(p, q));
    }
}
