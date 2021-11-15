package org.menfre;

import org.menfre.type.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的中序遍历
 *
 * @author menfre
 */
public class BinaryTreeMiddleOrder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        TreeNode next = root;
        Stack<TreeNode> parentChain = new Stack<>();
        while (next != null) {
            if (next.left != null) {
                parentChain.push(next);
                next = next.left;
            } else {
                arr.add(next.val);
                if (next.right != null) {
                    next = next.right;
                } else if (!parentChain.isEmpty()) {
                    next = parentChain.pop();
                    next.left = null;
                }else{
                    next = null;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        List<Integer> result = new BinaryTreeMiddleOrder().inorderTraversal(new TreeNode(1, new TreeNode(2, null, null), null));
        System.out.println(result);
    }
}
