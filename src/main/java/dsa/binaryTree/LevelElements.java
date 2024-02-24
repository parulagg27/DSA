package dsa.binaryTree;


import java.util.*;
import java.util.AbstractMap.SimpleEntry;

/**
 * Problem Description: Write a method, treeLevels, that takes in the root of a binary tree.
 * The method should return a 2-Dimensional list where each sublist represents a level of the tree.
 */
public class LevelElements {

    /**
     * Approach: Use BFS via Queue + null node to represent completion of each level in tree.
     *
     * @Time_complexity O(n)
     * @Space_complexity O(h) [height of tree] + number of levels in tree [for space taken by null nodes]
     */
    public static <T> List<List<T>> treeLevelsByBFSNullNode(Node<T> root) {
        if (root == null) return List.of();
        Queue<Node<T>> bfsQueue = new ArrayDeque<>();
        Node<T> nullNode = new Node<>(null);
        bfsQueue.add(root);
        bfsQueue.add(nullNode);
        List<List<T>> allLevels = new ArrayList<>();
        List<T> levelNodes = new ArrayList<>();

        while (!bfsQueue.isEmpty()) {
            Node<T> first = bfsQueue.remove();
            if (first.value == null) {
                allLevels.add(levelNodes);
                if (!bfsQueue.isEmpty()) {
                    bfsQueue.add(nullNode);
                    levelNodes = new ArrayList<>();
                }
            } else {
                levelNodes.add(first.value);
                if (first.left != null) bfsQueue.add(first.left);
                if (first.right != null) bfsQueue.add(first.right);
            }
        }
        return allLevels;
    }

    /**
     * Approach Pattern: Root node: level 0, child node: 0+1, => n+1. Store each node with its level. Level = index of sub-array list
     * [indicating each level]
     * @Time_complexity O(n) + time to access list, modify and update values in it
     * @Space_complexity O(h) + O(h) [h: height of tree = max. number of elements in stack at any point. Another O(h)
     * cuz of additional map to indicate level of each node
     */
    public static <T> List<List<T>> treeLevelsByDFSAndLevelMark(Node<T> root) {
        if (root == null) return List.of();
        Stack<SimpleEntry<Integer, Node<T>>> stack = new Stack<>();
        stack.push(new SimpleEntry<>(0, root));
        List<List<T>> levels = new ArrayList<>();

        while (!stack.isEmpty()) {
            var top = stack.pop();
            int level = top.getKey();
            Node<T> node = top.getValue();

            //indicates that size is one less than desired level. number of existing elements = 2 [0,1], but desired level = 2 [i.e., 0,1,2]
            if (level == levels.size()) {
                List<T> levelElement = new ArrayList<>();
                levelElement.add(node.value);
                levels.add(levelElement);
            } else if (level < levels.size()){
                //modifies list in place
                levels.get(level).add(node.value);
            }
            if (node.right != null) stack.add(new SimpleEntry<>(level + 1, node.right));
            if (node.left != null) stack.add(new SimpleEntry<>(level + 1, node.left));
        }
        return levels;
    }
}
