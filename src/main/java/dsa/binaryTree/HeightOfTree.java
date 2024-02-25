package dsa.binaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class HeightOfTree {

    /**
     * @Time_complexity O(n) - Beats 100% users
     * @Space_complexity O(h) - h: height of binary tree - Beats 64% users
     */
    public static <T> int howHigh(Node<T> root) {
        if (root == null) return -1;
        if (root.left == null && root.right == null) return 0;
        return 1 + Math.max(howHigh(root.left), howHigh(root.right));
    }

    /**
     * Approach: To mark completion of a level in level-order, we add null nodes to the queue.
     * So everytime, null node is encountered, it indicates: that level is done, moving to next level.
     * @Time_complexity O(n) - Beats 11% users
     * @Space_complexity O(n) - O(h + h) - extra space used for number of null nodes = height of tree - beats 94% users
     */
    public static <T> int heightViaLevelOrder(Node<T> root) {
        int height = -1;
        if (root == null) return height;
        Queue<Node<T>> queue = new ArrayDeque<>();
        Node<T> nullNode = new Node<>(null);
        queue.add(root);
        queue.add(nullNode);

        while (!queue.isEmpty()) {
            var first = queue.remove();
            if (first.value == null) {
                height ++;
                //base case to prevent infinite loop. If null node was last node, which was removed, avoid keeping on adding null nodes again
                if (!queue.isEmpty()) queue.add(nullNode);
            }
            else {
                if (first.left != null) queue.add(first.left);
                if (first.right != null) queue.add(first.right);
            }
        }
        return height;
    }
}
