package dsa.binaryTree.traversal;

import dsa.binaryTree.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * L-N-R traversal.
 * Traverse tree straight from Left to Right.
 */
public class InOrderDFS {

    /**
     * Current pointer + stack used. Current pointer to track left subtree first, then right subtree. Stack to come back to previous node.
     * @Time_complexity O(n)
     * @Space_complexity O(max depth of binary tree) -
     * O(n) - worst case : for left skewed or right-skewed binary tree
     * O(log n) - for balanced binary tree
     */
    public static <T> List<T> inorderDepthFirstByStack(Node<T> root) {
        if (root == null) return List.of();
        Stack<Node<T>> nodeStack = new Stack<>();
        Node<T> current = root;
        List<T> inorderElements = new ArrayList<>();

        while (current != null || !nodeStack.isEmpty()) {
            if (current != null) {
                nodeStack.push(current);
                current = current.left;
            } else {
                Node<T> top = nodeStack.pop();
                inorderElements.add(top.value);
                current = top.right;
            }
        }
        return inorderElements;
    }


    /**
     * @Time_complexity O(n)
     * @Space_complexity O(max. depth of binary tree): O(log n) - O(n)
     */
    public static <T> List<T> inorderSearchByRecursion(Node<T> root) {
        List<T> inorderElements = new ArrayList<>();
        inorderSearchByRecursion(root, inorderElements);
        return inorderElements;
    }

    private static <T> void inorderSearchByRecursion(Node<T> current, List<T> elements) {
        if (current == null) return;
        inorderSearchByRecursion(current.left, elements);
        elements.add(current.value);
        inorderSearchByRecursion(current.right, elements);
    }
}
