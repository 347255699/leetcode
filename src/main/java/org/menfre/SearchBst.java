package org.menfre;

import org.menfre.type.TreeNode;

/**
 * 二叉搜索树中的搜索
 *
 * @author menfre
 */
public class SearchBst {

    public TreeNode searchBst(TreeNode root, int val) {
        if(root == null){
            return null;
        }

        if(root.val == val){
            return root;
        }
        TreeNode left = searchBst(root.left, val);
        TreeNode right = searchBst(root.right, val);
        if(left != null){
            return left;
        }else{
            return right;
        }
    }

    public static void main(String[] args) {

    }
}
