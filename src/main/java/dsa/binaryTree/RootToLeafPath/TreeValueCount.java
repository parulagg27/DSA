package dsa.binaryTree.RootToLeafPath;

import dsa.binaryTree.Node;
import java.util.Stack;

public class TreeValueCount {

    /**
     * @Time_complexity O(n)
     * @Space_complexity O(h) - max height of binary tree
     */
    public static <T> int treeValueCount(Node<T> root, T target) {
        if (root == null) return 0;
        int count = 0;
        if (root.value == target) count += 1;
        count += treeValueCount(root.left, target) + treeValueCount(root.right, target);
        return count;
    }

    /**
     PreOrder traversal and checking of target value.
     @Time_complexity O(n)
     @Space_complexity O(h) - max height of binary tree
     */
    public static <T> int treeValueCountViaPreOrder(Node<T> root, T target) {
        if (root == null) return 0;
        int count = 0;
        Stack<Node<T>> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            if (stack.peek().value == target) count ++;
            var top = stack.pop();
            if (top.right != null) stack.push(top.right);
            if (top.left != null) stack.push(top.left);
        }
        return count;
    }
}
