package org.menfre;

import org.menfre.type.TreeNode;

import java.util.*;

/**
 * 二叉搜索树中的众数
 *
 * @author menfre
 */
public class FindMode {

    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = find(root);
        Stack<Integer> stack = new Stack<>();
        for (Integer num : map.keySet()) {
            if (stack.isEmpty()) {
                stack.add(num);
            } else {
                while (!stack.isEmpty()) {
                    if (map.get(num) > map.get(stack.peek())) {
                        stack.pop();
                    } else {
                        break;
                    }
                }
                if(stack.isEmpty() || map.get(stack.peek()).equals(map.get(num))){
                    stack.push(num);
                }
            }
        }
        int[] result = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.get(i);
        }
        return result;
    }

    private Map<Integer, Integer> find(TreeNode root) {
        if (root.left == null && root.right == null) {
            return putMyself(new HashMap<>(), root.val);
        } else if (root.right == null) {
            return putMyself(find(root.left), root.val);
        } else if (root.left == null) {
            return putMyself(find(root.right), root.val);
        } else {
            Map<Integer,Integer> map = find(root.left);
            Map<Integer, Integer> map2 = find(root.right);
            for (Integer num : map2.keySet()) {
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + map2.get(num));
                } else {
                    map.put(num, map2.get(num));
                }
            }
            return putMyself(map, root.val);
        }
    }

    private Map<Integer, Integer> putMyself(Map<Integer, Integer> map, int val){
        if (map.containsKey(val)) {
            map.replace(val, map.get(val) + 1);
        } else {
            map.put(val, 1);
        }
        return map;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(2), null));
        System.out.println(Arrays.toString(new FindMode().findMode(root)));
    }
}
