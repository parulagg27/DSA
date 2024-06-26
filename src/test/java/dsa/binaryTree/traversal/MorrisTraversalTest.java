package dsa.binaryTree.traversal;

import dsa.binaryTree.Node;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MorrisTraversalTest {

    @Nested
    class InOrder {
        @Test
        void shouldReturnEmptyListForTreeWithNoNodes() {
            var output = MorrisTraversal.inOrder(null);

            assertEquals(List.of(), output);
        }

        @Test
        void shouldReturnFirstNodeValueGivenTreeWithOneNode() {
            Node<Integer> root = new Node<>(1);

            var output = MorrisTraversal.inOrder(root);

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

            var output = MorrisTraversal.inOrder(a);

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

            var output = MorrisTraversal.inOrder(a);

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

            var output = MorrisTraversal.inOrder(a);

            assertEquals(List.of("a", "c", "d", "e", "b"), output);
        }

    }

    @Nested
    class InOrderSimplified {
        @Test
        void shouldReturnEmptyListForTreeWithNoNodes() {
            var output = MorrisTraversal.inOrderSimplified(null);

            assertEquals(List.of(), output);
        }

        @Test
        void shouldReturnFirstNodeValueGivenTreeWithOneNode() {
            Node<Integer> root = new Node<>(1);

            var output = MorrisTraversal.inOrderSimplified(root);

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

            var output = MorrisTraversal.inOrderSimplified(a);

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

            var output = MorrisTraversal.inOrderSimplified(a);

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

            var output = MorrisTraversal.inOrderSimplified(a);

            assertEquals(List.of("a", "c", "d", "e", "b"), output);
        }

    }

    @Nested
    class PreOrder {

        @Test
        void shouldReturnEmptyListForTreeWithNoNodes() {
            var output = MorrisTraversal.preOrder(null);

            assertEquals(List.of(), output);
        }

        @Test
        void shouldReturnFirstNodeValueGivenTreeWithOneNode() {
            Node<Integer> root = new Node<>(1);

            var output = MorrisTraversal.preOrder(root);

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

            var output = MorrisTraversal.preOrder(a);

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

            var output = MorrisTraversal.preOrder(a);

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

            var output = MorrisTraversal.preOrder(a);

            assertEquals(List.of("a", "b", "c", "d", "e"), output);
        }
    }

    @Nested
    class PostOrder {

        @Test
        void shouldReturnEmptyListForTreeWithNoNodes() {
            var output = MorrisTraversal.postOrder(null);

            assertEquals(List.of(), output);
        }

        @Test
        void shouldReturnFirstNodeValueGivenTreeWithOneNode() {
            Node<Integer> root = new Node<>(1);

            var output = MorrisTraversal.postOrder(root);

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

            var output = MorrisTraversal.postOrder(a);

            assertEquals(List.of("d", "e", "b", "f", "c", "a"), output);
        }

        @Test
        void shouldReturnNodesInDfsOrderForUnbalancedBinaryTree() {
            Node<Integer> one = new Node<>(1);
            Node<Integer> two = new Node<>(2);
            Node<Integer> three = new Node<>(3);
            Node<Integer> four = new Node<>(4);
            Node<Integer> five = new Node<>(5);
            Node<Integer> six = new Node<>(6);
            Node<Integer> seven = new Node<>(7);
            Node<Integer> eight = new Node<>(8);
            Node<Integer> nine = new Node<>(9);
            one.left = two;
            one.right = seven;
            two.left = three;
            three.right = four;
            four.left = five;
            four.right = six;
            seven.left = eight;
            seven.right = nine;
            /*
                     1
                    / \
                   2   7
                  /   / \
                 3    8  9
                  \
                   4
                  / \
                 5   6
             */

            var output = MorrisTraversal.postOrder(one);

            assertEquals(List.of(5, 6, 4, 3, 2, 8, 9, 7, 1), output);
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

            var output = MorrisTraversal.postOrder(a);

            assertEquals(List.of("e", "d", "c", "b", "a"), output);
        }
    }
}