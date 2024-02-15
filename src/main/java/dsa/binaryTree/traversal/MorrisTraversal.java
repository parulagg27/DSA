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
     *
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

    /**
     * Print if:
     * a) Left child is null, print current
     * b) Thread is created, print current [root]
     * Move to right if:
     * a) Left node is null
     * b) Right most node == current node, i.e. when thread to be broken, which indicates that left-subtree is done.
     *
     * @Time_complexity O(n). Internally - O(3n) since each node is traversed thrice on an average.
     * @Space_complexity O(1) -> constant auxiliary space [2 pointers] used for processing nodes.
     */
    public static <T> List<T> preOrder(Node<T> root) {
        List<T> preOrderValues = new ArrayList<>();
        if (root == null) return preOrderValues;
        Node<T> current = root;
        while (current != null) {
            Node<T> left = current.left;
            if (left == null) {
                preOrderValues.add(current.value);
                current = current.right;
            } else {
                Node<T> rightMostNode = findRightMostNode(left, current);
                if (rightMostNode.right == null) { //thread creation
                    preOrderValues.add(current.value);
                    rightMostNode.right = current;
                    current = current.left;
                } else if (rightMostNode.right == current) { //thread cut down
                    rightMostNode.right = null;
                    current = current.right;
                }
            }
        }
        return preOrderValues;
    }

    /**
     * 1. Symmetrically opposite of preorder morris traversal, i.e., NLR --> NRL
     * 2. Then reverse the resulting list, i.e., NRL --> LRN
     * Visit left if:
     *  a) Right == null
     *  b) Thread is broken
     * Print node if:
     * a) Thread is created [root node]
     * b) right node is null
     *
     * @Time_complexity O(n) + O(n/2) [to reverse array]
     * @Space_complexity O(1) - no auxiliary space used + array reversed in place.
     */
    public static <T> List<T> postOrder(Node<T> root) {
        List<T> nRLElements = new ArrayList<>();
        if (root == null) return nRLElements;
        Node<T> current = root;
        while (current != null) {
            Node<T> right = current.right;
            if (right == null) {
                nRLElements.add(current.value); //visit node if right subtree done
                current = current.left;
            } else {
                Node<T> leftMostNode = findLeftMostNode(right, current);
                if (leftMostNode.left == null) {
                    leftMostNode.left = current;
                    nRLElements.add(current.value); //visit node if thread created: indicating root node
                    current = current.right;
                } else {
                    leftMostNode.left = null;
                    current = current.left;
                }
            }
        }
        return reverseArray(nRLElements);
    }

    private static <T> Node<T> findRightMostNode(Node<T> leftNode, Node<T> current) {
        while (leftNode.right != null && leftNode.right != current) {
            leftNode = leftNode.right;
        }
        return leftNode;
    }

    private static <T> Node<T> findLeftMostNode(Node<T> rightNode, Node<T> current) {
        while (rightNode.left != null && rightNode.left != current){
            rightNode = rightNode.left;
        }
        return rightNode;
    }

    private static <T> List<T> reverseArray(List<T> elements) {
        int size = elements.size();
        for (int i = 0; i < size / 2; i++) {
            int compliment = size - i - 1;
            T temp = elements.get(i);
            elements.set(i, elements.get(compliment));
            elements.set(compliment, temp);
        }
        return elements;
    }
}
