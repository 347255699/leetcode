package org.menfre;

import org.menfre.type.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * N 叉树的最大深度
 *
 * @author menfre
 */
public class Preorder {

    private List<Integer> arr;

    public List<Integer> preorder(Node root) {
        arr = new ArrayList<>();
        dfs(root);
        return arr;
    }

    private void dfs(Node root){
        if(root == null){
            return;
        }
        arr.add(root.val);
        for (Node child : root.children) {
            dfs(child);
        }
    }

    public static void main(String[] args) {

    }
}
