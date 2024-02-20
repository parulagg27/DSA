package dsa.binaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Problem: The method should return the right-most value in the bottom-most level of the tree.
 */
public class BottomMostRightValue {

    /**
     * Approach: Via BFS to reach bottom most level and get the last element at bottom level
     * @Time_complexity O(n)
     * @Space_complexity O(h) - height of binary tree
     */
    public static <T> T bottomRightValue(Node<T> root) {
        if (root == null) return null;
        Queue<Node<T>> queue = new ArrayDeque<>();
        queue.add(root);
        Node<T> current = root;

        while (!queue.isEmpty()) {
            current = queue.remove();
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        return current.value;
    }
}
