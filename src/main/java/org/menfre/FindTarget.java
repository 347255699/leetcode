package org.menfre;

import org.menfre.type.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 两数之和 IV - 输入 BST
 *
 * @author menfre
 */
public class FindTarget {

    private Set<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        if(root == null){
            return false;
        }
        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }

    public static void main(String[] args) {

    }
}
