package dsa.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Problem: returns a list containing the values of all leaf nodes in left-to-right order.
 */
public class LeafNodes {

    /**
     * @Time_complexity O(n) - each node traversed once
     * @Space_complexity O(h) - max height of tree
     */
    public static <T> List<T> leafListRecursive(Node<T> root) {
        List<T> leafNodes = new ArrayList<>();
        return leafList(root, leafNodes);
    }

    private static <T> List<T> leafList(Node<T> root, List<T> leafNodes) {
        if (root == null) return List.of();
        if (root.left == null && root.right == null) leafNodes.add(root.value);

        leafList(root.left, leafNodes);
        leafList(root.right, leafNodes);
        return leafNodes;
    }

    /**
     * @Time_complexity O(n)
     * @Space_complexity O(h) - h: max height of tree
     */
    public static <T> List<T> leafListViaPreOrder(Node<T> root) {
        if (root == null) {
            return List.of();
        }
        List<T> leaves = new ArrayList<>();
        Stack<Node<T>> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node<T> node = stack.pop();
            if (node.left == null && node.right == null) {
                leaves.add(node.value);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return leaves;
    }
}
