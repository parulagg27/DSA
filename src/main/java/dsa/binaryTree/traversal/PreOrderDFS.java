package dsa.binaryTree.traversal;

import dsa.binaryTree.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * N-L-R traversal.
 * Instead of going from Left to Right, we traverse root node first for every subtree.
 */
public class PreOrderDFS {

    /**
     * Approach: Only use stack [no current pointer used since root node for each subtree is already added to list]
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
     * @Time_complexity O(n) - since every node has to be traversed.
     * @Space_complexity O(max.depth of tree)
     * - best case (balanced tree) - O(log n)
     * - worst case (left / right skewed tree) - O(n)
     */
    public static <T> List<T> preOrderDFSByRecursion(Node<T> root) {
        List<T> preOrderValues = new ArrayList<>();
        preOrderDFSByRecursion(root, preOrderValues);
        return preOrderValues;
    }

    private static <T> void preOrderDFSByRecursion(Node<T> current, List<T> elements) {
        if (current == null) return;
        elements.add(current.value);
        preOrderDFSByRecursion(current.left, elements);
        preOrderDFSByRecursion(current.right, elements);
    }
}
