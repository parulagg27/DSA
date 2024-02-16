package dsa.binaryTree.traversal;

import dsa.binaryTree.Node;

import java.util.*;

public class BFS {

    /**
     * Idea: Use queue to process elements of one level first, then move to next level. Make next level elements wait in queue.
     * @Time_complexity O(n)
     * @Space_complexity O(n) - or shouldn't it be max. width of binary tree
     */
    public static <T> List<T> bfsByQueue(Node<T> root) {
        List<T> bfsElements = new ArrayList<>();
        if (root == null) return bfsElements;
        Queue<Node<T>> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node<T> first = queue.remove();
            bfsElements.add(first.value);
            if (first.left != null) queue.add(first.left);
            if (first.right != null) queue.add(first.right);
        }
        return bfsElements;
    }
}
