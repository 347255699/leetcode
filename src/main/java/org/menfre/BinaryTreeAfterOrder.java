package org.menfre;

import org.menfre.type.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的后序遍历
 *
 * @author menfre
 */
public class BinaryTreeAfterOrder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        TreeNode next = root;
        Stack<TreeNode> parentChain = new Stack<>();
        while (next != null) {
            if (next.left != null) {
                parentChain.push(next);
                next = next.left;
            } else if (next.right != null) {
                parentChain.push(next);
                next = next.right;
            } else {
                arr.add(next.val);
                if (!parentChain.isEmpty()) {
                    TreeNode current = next;
                    next = parentChain.pop();
                    if (current == next.left) {
                        next.left = null;
                    } else {
                        next.right = null;
                    }
                } else {
                    next = null;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
//        TreeNode root = new TreeNode(1);
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println(new BinaryTreeAfterOrder().inorderTraversal(root));
    }
}
