package dsa.binaryTree.traversal;

import dsa.binaryTree.Node;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InOrderDFSTest {

    @Nested
    class DFSInOrderByStack {

        @Test
        void shouldReturnEmptyListForTreeWithNoNodes() {
            var output = InOrderDFS.inorderDepthFirstByStack(null);

            assertEquals(List.of(), output);
        }

        @Test
        void shouldReturnFirstNodeValueGivenTreeWithOneNode() {
            Node<Integer> root = new Node<>(1);

            var output = InOrderDFS.inorderDepthFirstByStack(root);

            assertEquals(List.of(1), output);
        }

        @Test
        void shouldReturnNodesInOrderForBalancedBinaryTree() {
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
            /*
                     a
                    / \
                   b   c
                  /\    \
                 d  e    f
             */

            var output = InOrderDFS.inorderDepthFirstByStack(a);

            assertEquals(List.of("d", "b", "e", "a", "c", "f"), output);
        }

        @Test
        void shouldReturnNodesInOrderForUnbalancedBinaryTree() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            Node<String> e = new Node<>("e");
            Node<String> f = new Node<>("f");
            Node<String> g = new Node<>("g");
            /*
                    a
                   / \
                  b   c
                 / \   \
                d   e   f
                   /
                  g
            */
            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            e.left = g;
            c.right = f;

            var output = InOrderDFS.inorderDepthFirstByStack(a);

            assertEquals(List.of("d", "b", "g", "e", "a", "c", "f"), output);
        }

        @Test
        void shouldReturnNodeValuesInDfsOrderForRightSkewedBinaryTree() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            Node<String> e = new Node<>("e");
            a.right = b;
            b.left = c;
            c.right = d;
            d.right = e;
            /*
                a
                 \
                  b
                 /
                c
                 \
                  d
                   \
                    e
            */

            var output = InOrderDFS.inorderDepthFirstByStack(a);

            assertEquals(List.of("a", "c", "d", "e", "b"), output);
        }
    }

    @Nested
    class DFSInorderByRecursion {

        @Test
        void shouldReturnEmptyListForTreeWithNoNodes() {
            var output = InOrderDFS.inorderSearchByRecursion(null);

            assertEquals(List.of(), output);
        }

        @Test
        void shouldReturnFirstNodeValueGivenTreeWithOneNode() {
            Node<Integer> root = new Node<>(1);

            var output = InOrderDFS.inorderSearchByRecursion(root);

            assertEquals(List.of(1), output);
        }

        @Test
        void shouldReturnNodesInOrderForBalancedBinaryTree() {
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
            /*
                     a
                    / \
                   b   c
                  /\    \
                 d  e    f
             */

            var output = InOrderDFS.inorderSearchByRecursion(a);

            assertEquals(List.of("d", "b", "e", "a", "c", "f"), output);
        }

        @Test
        void shouldReturnNodesInOrderForUnbalancedBinaryTree() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            Node<String> e = new Node<>("e");
            Node<String> f = new Node<>("f");
            Node<String> g = new Node<>("g");
            /*
                    a
                   / \
                  b   c
                 / \   \
                d   e   f
                   /
                  g
            */
            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            e.left = g;
            c.right = f;

            var output = InOrderDFS.inorderSearchByRecursion(a);

            assertEquals(List.of("d", "b", "g", "e", "a", "c", "f"), output);
        }

        @Test
        void shouldReturnNodeValuesInDfsOrderForRightSkewedBinaryTree() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            Node<String> e = new Node<>("e");
            a.right = b;
            b.left = c;
            c.right = d;
            d.right = e;
            /*
                a
                 \
                  b
                 /
                c
                 \
                  d
                   \
                    e
            */

            var output = InOrderDFS.inorderSearchByRecursion(a);

            assertEquals(List.of("a", "c", "d", "e", "b"), output);
        }
    }
}