package dsa.binaryTree;

import dsa.binaryTree.traversal.PreOrderDFS;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PreOrderDFSTest {

    @Nested
    class PreOrderDFSByStack {

        @Test
        void shouldReturnEmptyListForTreeWithNoNodes() {
            var output = PreOrderDFS.preOrderDepthFirstByStack(null);

            assertEquals(List.of(), output);
        }

        @Test
        void shouldReturnFirstNodeValueGivenTreeWithOneNode() {
            Node<Integer> root = new Node<>(1);

            var output = PreOrderDFS.preOrderDepthFirstByStack(root);

            assertEquals(List.of(1), output);
        }

        @Test
        void shouldReturnNodesInDfsOrderForBalancedBinaryTree() {
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

            var output = PreOrderDFS.preOrderDepthFirstByStack(a);

            assertEquals(List.of("a", "b", "d", "e", "c", "f"), output);
        }

        @Test
        void shouldReturnNodesInDfsOrderForUnbalancedBinaryTree() {
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

            var output = PreOrderDFS.preOrderDepthFirstByStack(a);

            assertEquals(List.of("a", "b", "d", "e", "g", "c", "f"), output);
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

            var output = PreOrderDFS.preOrderDepthFirstByStack(a);

            assertEquals(List.of("a", "b", "c", "d", "e"), output);
        }
    }

    @Nested
    class preOrderDFSByRecursion {

        @Test
        void shouldReturnEmptyListForTreeWithNoNodes() {
            var output = PreOrderDFS.preOrderDFSByRecursion(null);

            assertEquals(List.of(), output);
        }

        @Test
        void shouldReturnFirstNodeValueGivenTreeWithOneNode() {
            Node<Integer> root = new Node<>(1);

            var output = PreOrderDFS.preOrderDFSByRecursion(root);

            assertEquals(List.of(1), output);
        }

        @Test
        void shouldReturnNodesInDfsOrderForBalancedBinaryTree() {
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

            var output = PreOrderDFS.preOrderDFSByRecursion(a);

            assertEquals(List.of("a", "b", "d", "e", "c", "f"), output);
        }

        @Test
        void shouldReturnNodesInDfsOrderForUnbalancedBinaryTree() {
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

            var output = PreOrderDFS.preOrderDFSByRecursion(a);

            assertEquals(List.of("a", "b", "d", "e", "g", "c", "f"), output);
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

            var output = PreOrderDFS.preOrderDFSByRecursion(a);

            assertEquals(List.of("a", "b", "c", "d", "e"), output);
        }
    }
}