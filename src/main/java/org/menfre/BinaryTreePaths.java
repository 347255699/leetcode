package org.menfre;

import com.sun.tools.javac.util.RichDiagnosticFormatter;
import org.menfre.type.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的所有路径
 *
 * @author menfre
 */
public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        if(root.left == null && root.right == null){
            List<String> paths = new ArrayList<>();
            paths.add("" + root.val);
            return paths;
        }else if(root.left != null && root.right !=null){
            List<String> paths = binaryTreePaths(root.left);
            for (int i = 0; i < paths.size(); i++) {
                paths.set(i, root.val + "->" + paths.get(i));
            }
            List<String> paths2 = binaryTreePaths(root.right);
            for (int i = 0; i < paths2.size(); i++) {
                paths2.set(i, root.val + "->" + paths2.get(i));
            }
            paths.addAll(paths2);
            return paths;
        }
        else {
            List<String> paths = binaryTreePaths(root.left != null?root.left:root.right);
            for (int i = 0; i < paths.size(); i++) {
                paths.set(i, root.val + "->" + paths.get(i));
            }
            return paths;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3));
        System.out.println(new BinaryTreePaths().binaryTreePaths(root));
    }
}
