package dsa.binaryTree.traversal;

import dsa.binaryTree.Node;

import java.util.ArrayList;
import java.util.List;
public class PostOrderDFS {

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
