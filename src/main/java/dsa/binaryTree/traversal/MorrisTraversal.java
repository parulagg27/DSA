package dsa.binaryTree.traversal;

import dsa.binaryTree.Node;

import java.util.List;
import java.util.ArrayList;

public class MorrisTraversal {
    public static <T> List<T> inOrder(Node<T> root) {
        Node<T> current = root;
        List<T> inorderNodes = new ArrayList<>();
        if (root == null) return inorderNodes;
        Node<T> left = current.left;
        Node<T> right = left;
        while (current != null) {
            if (left == null) {
                inorderNodes.add(current.value);
                current = current.right;
                if (current != null) left = current.left;
                right = left;
            } else {
                if (right.right == null) {
                    right.right = current;
                    current = current.left;
                    left = current.left;
                    right = left;
                } else if (right.right == current) {
                    inorderNodes.add(current.value);
                    right.right = null;
                    current = current.right;
                    if (current != null) left = current.left;
                    if (current != null) right = left;
                } else {
                    right = right.right;
                }
            }
        }
        return inorderNodes;
    }

    /**
     * Video context: <a href="https://youtu.be/oz17ihxBxgU">...</a>
     * @Time_complexity O(n). Internally - O(3n) since each node is traversed thrice on an average.
     * @Space_complexity O(1) -> constant auxiliary space [2 pointers] used for processing nodes.
     */
    public static <T> List<T> inOrderSimplified(Node<T> root) {
        List<T> inorderNodes = new ArrayList<>();
        Node<T> current = root;
        Node<T> left;

        while (current != null) {
            left = current.left;
            if (left == null) {
                inorderNodes.add(current.value);
                current = current.right;
            } else {
              Node<T> rightMostNode = findRightMostNode(left, current);
              if (rightMostNode.right == null) {
                  //create thread
                  rightMostNode.right = current;
                  current = current.left;
              } else {
                  //break thread
                  rightMostNode.right = null;
                  inorderNodes.add(current.value);
                  current = current.right;
              }
            }
        }
        return inorderNodes;
    }

    private static <T> Node<T> findRightMostNode(Node<T> leftNode, Node<T> current) {
        while (leftNode.right != null && leftNode.right != current) {
            leftNode = leftNode.right;
        }
        return leftNode;
    }
}
