package dsa.binaryTree.RootToLeafPath;

import dsa.binaryTree.Node;

public class HasPathSum {

    /**
     * Leetcode problem: <a href="https://leetcode.com/problems/path-sum/">...</a>
     * @Time_complexity O(n)
     * @Space_complexity O(max height of tree)
     * TODO: Recursive solution. Beats 100% leet code users in runtime.
     * TODO: Iterative approach in #MaxPathSum file beats only 8% of java users in runtime
     */
    public boolean hasPathSum(Node<Integer> root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null && targetSum - root.value == 0) return true;
        return hasPathSum(root.left, targetSum - root.value) || hasPathSum(root.right, targetSum - root.value);
    }
}
