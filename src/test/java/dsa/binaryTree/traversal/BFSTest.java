package dsa.binaryTree.traversal;

import dsa.binaryTree.Node;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BFSTest {

    @Nested
    class BFSByQueue {

        @Test
        void shouldReturnEmptyListForTreeWithNoNodes() {
            var output = BFS.bfsByQueue(null);

            assertEquals(List.of(), output);
        }

        @Test
        void shouldReturnFirstNodeValueGivenTreeWithOneNode() {
            Node<Integer> root = new Node<>(1);

            var output = BFS.bfsByQueue(root);

            assertEquals(List.of(1), output);
        }

        @Test
        void shouldReturnNodesInBfsOrderForBalancedBinaryTree() {
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

            var output = BFS.bfsByQueue(a);

            assertEquals(List.of("a", "b", "c", "d", "e", "f"), output);
        }

        @Test
        void shouldReturnNodesInBfsOrderForUnbalancedBinaryTree() {
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

            var output = BFS.bfsByQueue(one);

            assertEquals(List.of(1, 2, 7, 3, 8, 9, 4, 5, 6), output);
        }

        @Test
        void shouldReturnNodeValuesInBfsOrderForRightSkewedBinaryTree() {
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

            var output = BFS.bfsByQueue(a);

            assertEquals(List.of("a", "b", "c", "d", "e"), output);
        }
    }
}