package org.menfre;

import org.menfre.type.TreeNode;

/**
 * 将有序数组转换为二叉搜索树
 *
 * @author menfre
 */
public class SortedArrayToBst {

    public TreeNode sortedArrayToBst(int[] nums) {
        return binaryTreeNode(0, nums.length - 1, nums);
    }

    private TreeNode binaryTreeNode(int low, int hight, int[] nums) {
        if (low > hight) {
            return null;
        }
        int mid = low + (hight - low) / 2;
        return new TreeNode(nums[mid], binaryTreeNode(low, mid - 1, nums), binaryTreeNode(mid + 1, hight, nums));
    }

    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode treeNode = new SortedArrayToBst().sortedArrayToBst(nums);
        System.out.println(new BinaryTreeMiddleOrder().inorderTraversal(treeNode));
    }
}
