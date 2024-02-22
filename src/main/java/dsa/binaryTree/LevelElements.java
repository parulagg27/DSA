package dsa.binaryTree;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Problem Description: Write a method, treeLevels, that takes in the root of a binary tree.
 * The method should return a 2-Dimensional list where each sublist represents a level of the tree.
 */
public class LevelElements {

    /**
     * @Time_complexity O(n)
     * @Space_complexity O(n)
     */
    public static <T> List<List<T>> treeLevels(Node<T> root) {
        if (root == null) return List.of();
        Queue<Node<T>> bfsQueue = new ArrayDeque<>();
        Node<T> nullNode = new Node<>(null);
        bfsQueue.add(root);
        bfsQueue.add(nullNode);
        List<List<T>> allLevels = new ArrayList<>();
        List<T> levelNodes = new ArrayList<>();

        while (!bfsQueue.isEmpty()) {
            Node<T> first = bfsQueue.remove();
            if (first.value == null){
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
}
