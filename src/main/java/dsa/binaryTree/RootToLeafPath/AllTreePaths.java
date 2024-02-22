package dsa.binaryTree.RootToLeafPath;

import dsa.binaryTree.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AllTreePaths {

    public static <T> List<List<T>> allTreePaths(Node<T> root) {
        if (root == null) return null;
        if (root.left == null && root.right == null) {
            return List.of(List.of(root.value));
        }

        List<List<T>> leftSubtrees = allTreePaths(root.left);
        List<List<T>> rightSubTrees = allTreePaths(root.right);
        List<List<T>> allSubTrees = new ArrayList<>();

        if (leftSubtrees != null) {
            for (List<T> subTree : leftSubtrees) {
                List<T> path = new ArrayList<>();
                path.add(root.value);
                path.addAll(subTree);
                allSubTrees.add(path);
            }
        }
        if (rightSubTrees != null) {
            for (List<T> subTree : rightSubTrees) {
                List<T> path = new ArrayList<>();
                path.add(root.value);
                path.addAll(subTree);
                allSubTrees.add(path);
            }
        }
        return allSubTrees;
    }

    public static <T> List<List<T>> viaPostOrder(Node<T> root) {
        if (root == null) return null;
        Node<T> current = root;
        List<List<T>> allPaths = new ArrayList<>();
        Stack<Node<T>> stack = new Stack<>();
        List<T> pathTracker = new ArrayList<>();

        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                pathTracker.add(current.value);
                current = current.left;
            } else {
                var top = stack.peek();
                if (top.right != null) current = top.right;
                else {
                    if (top.left == null){
                        List<T> path = new ArrayList<>(pathTracker);
                        allPaths.add(path);
                    }
                    var node = stack.pop();
                    pathTracker.remove(pathTracker.size() - 1);
                    while (!stack.isEmpty() && node == stack.peek().right){
                        node = stack.pop();
                        pathTracker.remove(pathTracker.size() - 1);
                    }
                }
            }
        }
        return allPaths;
    }
}
