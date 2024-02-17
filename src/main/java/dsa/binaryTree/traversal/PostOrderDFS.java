package dsa.binaryTree.traversal;

import dsa.binaryTree.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderDFS {

    /**
     * @Time_complexity O(n + n): Since complete traversal of each node in tree + popping each element of resulting stack again.
     * @Space_complexity O(n + n): At max. n elements in ordered stack + lesser elements in 1st stack.
     */
    public static <T> List<T> postOrderByTwoStacks(Node<T> root) {
        if (root == null) return List.of();
        List<T> postOrderOutput = new ArrayList<>();
        Stack<Node<T>> leftRightNodeTracker = new Stack<>();
        leftRightNodeTracker.push(root);
        Stack<Node<T>> postOrdered = new Stack<>();

        while (!leftRightNodeTracker.isEmpty()) {
            Node<T> top = leftRightNodeTracker.pop();
            postOrdered.push(top);
            if (top.left != null) leftRightNodeTracker.push(top.left);
            if (top.right != null) leftRightNodeTracker.push(top.right);
        }
        while (!postOrdered.isEmpty()) {
            postOrderOutput.add(postOrdered.pop().value);
        }
        return postOrderOutput;
    }

    /**
     * Video reference: <a href="https://youtu.be/xLQKdq0Ffjg?feature=shared">...</a>
     * @Time_complexity O(n)
     * @Space_complexity O(max. depth of tree): O(log n) - O(n)
     */
    public static <T> List<T> postOrderByOneStack(Node<T> root) {
        Node<T> current = root;
        Stack<Node<T>> postOrderStack = new Stack<>();
        List<T> postOrderElements = new ArrayList<>();

        while (current != null || !postOrderStack.isEmpty()) {
            if (current != null) {
                postOrderStack.push(current);
                current = current.left;

            } else {
                var temp = postOrderStack.peek().right;
                if (temp != null) current = temp; //left subtree done, move to right
                else {
                    var top = postOrderStack.pop();
                    postOrderElements.add(top.value); //visit node if leaf node
                    while (!postOrderStack.isEmpty() && top == postOrderStack.peek().right) {
                        top = postOrderStack.pop(); // visit root of tree as right subtree done
                        postOrderElements.add(top.value);
                    }
                }
            }
        }
        return postOrderElements;
    }

    public static <T> List<T> postOrderByRecursion(Node<T> root) {
        List<T> postOrderElements = new ArrayList<>();
        postOrderByRecursion(root, postOrderElements);
        return postOrderElements;
    }

    private static <T> void postOrderByRecursion(Node<T> current, List<T> elements) {
        if (current == null) return;
        postOrderByRecursion(current.left, elements);
        postOrderByRecursion(current.right, elements);
        elements.add(current.value);
    }
}
