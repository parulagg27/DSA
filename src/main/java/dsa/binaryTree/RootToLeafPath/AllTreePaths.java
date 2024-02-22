package dsa.binaryTree.RootToLeafPath;

import dsa.binaryTree.Node;

import java.util.ArrayList;
import java.util.List;

public class AllTreePaths {

    public static <T> List<List<T>> allTreePaths(Node<T> root) {
        if (root == null) return null;

        if (root.left == null && root.right == null) {
            List<T> rootElements = new ArrayList<>();
            rootElements.add(root.value);
            return new ArrayList<>(){{
                add(rootElements);
            }};
        }

        List<List<T>> leftSubtrees = allTreePaths(root.left);
        List<List<T>> rightSubTrees = allTreePaths(root.right);
        List<List<T>> allSubTrees = new ArrayList<>();

        if (leftSubtrees != null) {
            for(List<T> subTree: leftSubtrees) {
                subTree.add(0, root.value);
                allSubTrees.add(subTree);
            }
        }
        if (rightSubTrees != null) {
            for(List<T> subTree: rightSubTrees) {
                subTree.add(0, root.value);
                allSubTrees.add(subTree);
            }
        }
        return allSubTrees;
    }
}
