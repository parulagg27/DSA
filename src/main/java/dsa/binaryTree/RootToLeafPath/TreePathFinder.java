package dsa.binaryTree.RootToLeafPath;

import dsa.binaryTree.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;


public class TreePathFinder {


    /**
     * Solving 2 base cases: If target node found vs node is null. Adding root node and eventually rest of leaf nodes to get final path in order from root
     * @Time_complexity O(n)
     * @Space_complexity O(logn) or O(n) = implicit stack, with space used equal to max. height of tree
     */
    public static <T> List<T> findPathToNodeRecursive(Node<T> root, T target) {
        if (root == null) return null;
        if (root.value == target) return List.of(root.value);

        List<T> leftPath = findPathToNodeRecursive(root.left, target);
        List<T> rightPath = findPathToNodeRecursive(root.right, target);
        List<T> path = new ArrayList<>();
        path.add(root.value);
        if (leftPath != null) {
            path.addAll(leftPath);
            return path;
        }
        if (rightPath != null) {
            path.addAll(rightPath);
            return path;
        }
        return null;
    }

    /**
     * Find elements traversing post-order. Pop traversed path elements where target was not found. Final stack elements are reversed in array.
     * @Time_complexity O(n)
     * @Space_complexity O(h) - h: height of binary tree
     */
    public static <T> List<T> findPathToNode(Node<T> root, T target) {
        if (root == null) return List.of();
        if (root.value == target) return List.of(root.value);
        Stack<Node<T>> stack = new Stack<>();
        Node<T> current = root;

        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                if (current.value == target) break;
                current = current.left;
            }
            else if (stack.peek().right != null){
                current = stack.peek().right;
            }
            else {
                Node<T> top = stack.pop();
                while (!stack.isEmpty() && stack.peek().right == top) {
                    top = stack.pop();
                }
                if (!stack.isEmpty() && stack.peek().right == top) current = stack.peek().right;
            }
        }
        if (stack.isEmpty()) return null;

        List<T> path = new ArrayList<>();
        while (!stack.isEmpty()) {
            Node<T> top = stack.pop();
            path.add(top.value);
        }
        Collections.reverse(path);
        return path;
    }
}
