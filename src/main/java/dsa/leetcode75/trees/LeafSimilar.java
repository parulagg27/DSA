package dsa.leetcode75.trees;

import dsa.binaryTree.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class LeafSimilar {

    /**
     * @Time_complexity O(n) + O(n) [since 2 trees]. O(n) in best case if trees not leaf similar - beats 15%
     * @Space_complexity O(h) - beats 48%
     */
    public boolean leafSimilar(Node<Integer> root1, Node<Integer> root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        List<Integer> firstTreeLeaves = new ArrayList<>();
        List<Integer> secondTreeLeaves = new ArrayList<>();
        Stack<Node<Integer>> stack = new Stack<>();
        stack.push(root1);

        while (!stack.isEmpty()) {
            Node<Integer> top = stack.pop();
            if (top.left == null && top.right == null) firstTreeLeaves.add(top.value);
            if (top.right != null) stack.push(top.right);
            if (top.left != null) stack.push(top.left);
        }

        stack.push(root2);
        int i = 0;
        int leafNodesSize = firstTreeLeaves.size();
        while (!stack.isEmpty()) {
            Node<Integer> top = stack.pop();
            if (top.left == null && top.right == null){
                if (i >= leafNodesSize || !Objects.equals(top.value, firstTreeLeaves.get(i))){
                    return false;
                }
                i++;
                secondTreeLeaves.add(top.value);
            }
            if (top.right != null) stack.push(top.right);
            if (top.left != null) stack.push(top.left);
        }
        return firstTreeLeaves.size() == secondTreeLeaves.size();
    }

    /**
     * @Time_complexity O(2n) - Beats 100% of users
     * @Space_complexity O(h) = beats 95% users
     */
    public boolean leafSimilarViaRecursion(Node<Integer> root1, Node<Integer> root2) {
        List<Integer> tree1Leaves = new ArrayList<>();
        List<Integer> tree2Leaves = new ArrayList<>();
        leafSimilar(root1, tree1Leaves);
        leafSimilar(root2, tree2Leaves);
        return tree1Leaves.equals(tree2Leaves);
    }

    private void leafSimilar(Node<Integer> root, List<Integer> leafs){
        if (root == null) return;
        if (root.left == null && root.right == null) leafs.add(root.value);
        leafSimilar(root.left, leafs);
        leafSimilar(root.right, leafs);
    }
}
