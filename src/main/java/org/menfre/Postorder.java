package org.menfre;

import org.menfre.type.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * N 叉树的最大深度
 *
 * @author menfre
 */
public class Postorder {

    private List<Integer> arr;

    public List<Integer> postorder(Node root) {
        arr = new ArrayList<>();
        dfs(root);
        return arr;
    }

    private void dfs(Node root){
        if(root == null){
            return;
        }
        for (Node child : root.children) {
            dfs(child);
        }
        arr.add(root.val);
    }

    public static void main(String[] args) {

    }
}
