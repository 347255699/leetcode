package org.menfre;

import org.menfre.type.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的前序遍历
 *
 * @author menfre
 */
public class BinaryTreePreOrder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        TreeNode next = root;
        Stack<TreeNode> parentChain = new Stack<>();
        while (next != null) {
            arr.add(next.val);
            if (next.left != null) {
                if (next.right != null) {
                    parentChain.push(next.right);
                }
                next = next.left;
            } else if (next.right != null) {
                next = next.right;
            } else if (!parentChain.isEmpty()) {
                next = parentChain.pop();
            } else {
                next = null;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
//        TreeNode root = new TreeNode(1);
        TreeNode root = new TreeNode(3, new TreeNode(1), new TreeNode(2));
        System.out.println(new BinaryTreePreOrder().inorderTraversal(root));
    }
}
