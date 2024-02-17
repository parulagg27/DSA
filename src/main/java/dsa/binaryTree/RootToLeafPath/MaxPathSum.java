package dsa.binaryTree.RootToLeafPath;

import dsa.binaryTree.Node;

import java.util.Stack;

/**
 * Problem description: Input: root of a binary tree that contains number values.
 * The method should return the maximum sum of any root to leaf path within the tree
 */
public class MaxPathSum {

    /**
     * Approach:
     * 1. Visit right if:
     * 1.1: current.left == null
     * 2. Pop a node if:
     * 2.1: Left and right node == null, i.e., leaf node
     * 2.2: If popped node == stack.top.right() => indicating that subtree is complete, root node can be popped
     * @Time_complexity O(n) ~ O(3n) -> on an average, each node is visited twice or thrice
     * @Space_complexity O(max. height of tree). => O(log n) or O(n)
     */
    public static Double maxPathSum(Node<Double> root) {
        if (root == null) return 0.0;
        double maxSum = Double.NEGATIVE_INFINITY;
        double sumTracker = 0.0;
        Node<Double> current = root;
        Stack<Node<Double>> stack = new Stack<>();
        //postOrder traversal
        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current); //adding each visited node
                sumTracker += current.value;
                current = current.left;
            } else {
                if (stack.peek().right != null) {
                    current = stack.peek().right;
                } else {
                    //pop if left and right node == null
                    Node<Double> top = stack.pop();
                    if (sumTracker > maxSum && top.left == null && top.right == null) {
                        maxSum = sumTracker; //max. sum checked only if one unique root to leaf path done
                    }
                    sumTracker -= top.value;
                    while (!stack.isEmpty() && stack.peek().right == top) {
                        top = stack.pop(); //pop if top element.right == popped element: indicating subtree complete
                        sumTracker -= top.value;
                    }
                }
            }
        }

        return maxSum;
    }

    /**
     * @Time_complexity O(n)
     * @Space_complexity O(n)
     */
    public static Double maxPathSumRecursive(Node<Double> root) {
        double maxSum;
        //not returning 0 as it conflicts with negative values.
        // If left == -3, right was null, so right = 0, hence left vs right -> right = 0 is returned
        if (root == null) return Double.NEGATIVE_INFINITY;
        if (root.left == null && root.right == null) return root.value;
        maxSum = root.value + Math.max(maxPathSumRecursive(root.left), maxPathSumRecursive(root.right));
        return maxSum;
    }
}
