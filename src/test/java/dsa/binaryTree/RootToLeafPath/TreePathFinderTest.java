package dsa.binaryTree.RootToLeafPath;

import dsa.binaryTree.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class TreePathFinderTest {

    @Test
    void shouldReturnNullIfTargetNodeNotFound() {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        //      a
        //    /   \
        //   b     c
        //  / \     \
        // d   e     f

        var output = TreePathFinder.findPathToNode(a, "p");

        Assertions.assertNull(output);
    }

    @Nested
    class findPathToNodeRecursive {

        @Test
        void shouldReturnNullIfTargetNodeNotFound() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            Node<String> e = new Node<>("e");
            Node<String> f = new Node<>("f");
            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            c.right = f;
            //      a
            //    /   \
            //   b     c
            //  / \     \
            // d   e     f

            var output = TreePathFinder.findPathToNodeRecursive(a, "p");

            Assertions.assertNull(output);
        }
    }
}