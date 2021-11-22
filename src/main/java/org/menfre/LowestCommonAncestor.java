package org.menfre;

import org.menfre.type.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 二叉搜索树的最近公共祖先
 *
 * @author menfre
 */
public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Map<Integer, TreeNode> map = new HashMap<>();
        map.put(p.val, p);
        TreeNode next = root;
        while (next.val != p.val) {
            map.put(next.val, next);
            if (next.val < p.val) {
                next = next.right;
            } else {
                next = next.left;
            }
        }

        List<Integer> arr = new ArrayList<>();
        next = root;
        while (next.val != q.val) {
            arr.add(next.val);
            if (next.val < q.val) {
                next = next.right;
            } else {
                next = next.left;
            }
        }
        arr.add(q.val);

        for (int i = arr.size() - 1; i >= 0; i--) {
            if (map.containsKey(arr.get(i))) {
                return map.get(arr.get(i));
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6, new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))), new TreeNode(8, new TreeNode(7), new TreeNode(9)));
        System.out.println(new LowestCommonAncestor().lowestCommonAncestor(root, new TreeNode(2), new TreeNode(4)).val);
    }
}
