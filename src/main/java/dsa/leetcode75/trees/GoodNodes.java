package dsa.leetcode75.trees;

import dsa.binaryTree.Node;

/**
 * Problem link: <a href="https://leetcode.com/problems/count-good-nodes-in-binary-tree/description">...</a>
 * Common question asked in Microsoft
 */
public class GoodNodes {

    /**
     * Approach: Pre-order search, process Node. Then left & then right.
     * While calling left & right subtree in call stack, pass maxValue so far while going to that left subtree.
     * And then max. val so far for right subtree.
     3
     / \
     1   4
     /   / \
     3   5   6

     5,4
     ------
     4,3
     -------
     3,3
     -------
     1,3
     -------
     3,3
     @Time_complexity O(n) -> traverse each node
     @Space_complexity O(h) -> max. height of tree, recursive stack space
     //TODO: Time taken: 1.5 hr. Challenge: Tracking max. value from tree-path so far.
     Solution video: <a href="https://youtu.be/7cp5imvDzl4?si=YhAmxRqoMDvzjfjo">...</a>
     */
    public int goodNodes(Node<Integer> root) {
        return goodNodes(root, root.value);
    }

    public int goodNodes(Node<Integer> node, int maxSoFar) {
        int count = 0;
        if (node == null) return count;
        if (node.value >= maxSoFar) {
            count = 1;
            maxSoFar = node.value;
        }
        count += goodNodes(node.left, maxSoFar);
        count += goodNodes(node.right, maxSoFar);
        return count;
    }
}
