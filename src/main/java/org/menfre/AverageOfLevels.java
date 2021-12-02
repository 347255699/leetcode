package org.menfre;

import org.menfre.type.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的层平均值
 *
 * @author menfre
 */
public class AverageOfLevels {

    private List<Integer> counts = new ArrayList<>();
    private List<Double> sum = new ArrayList<>();

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> arr = new ArrayList<>();
        dfs(root, 1);
        for (int i = 0; i < counts.size(); i++) {
            arr.add((sum.get(i) / counts.get(i)));
        }
        return arr;
    }

    private void dfs(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level > counts.size()) {
            counts.add(1);
        } else {
            counts.set(level - 1, counts.get(level - 1) + 1);
        }

        if (level > sum.size()) {
            sum.add((double) root.val);
        } else {
            sum.set(level - 1, sum.get(level - 1) + root.val);
        }
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        for (Double val : new AverageOfLevels().averageOfLevels(root)) {
            System.out.print(val + " ");
        }
    }
}
