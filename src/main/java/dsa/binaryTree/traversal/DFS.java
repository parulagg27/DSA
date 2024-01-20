package dsa.binaryTree.traversal;

import dsa.binaryTree.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {

    /**
     * @Time_complexity O(n) - since every node has to be traversed.
     * @Space_complexity O(max.depth of tree)
     * - best case (balanced tree) - O(log n)
     * - worst case (left / right skewed tree) - O(n)
     */
    public static <T> List<T> preOrderDepthFirstByStack(Node<T> root) {
        if (root == null) return List.of();
        Stack<Node<T>> nodeStack = new Stack<>();
        List<T> nodesInDfsOrder = new ArrayList<>();
        nodeStack.push(root);

        while (!nodeStack.isEmpty()) {
            Node<T> topNode = nodeStack.pop();
            nodesInDfsOrder.add(topNode.value);
            if (topNode.right != null) nodeStack.push(topNode.right);
            if (topNode.left != null) nodeStack.push(topNode.left);
        }
        return nodesInDfsOrder;
    }

    /**
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
}
