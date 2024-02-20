package dsa.binaryTree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class HeightOfTreeTest {

    @Nested
    class HeightViaRecursion {

        @Test
        void shouldReturnNeg1IfRootIsNull() {
            var output = HeightOfTree.howHigh(null);

            Assertions.assertEquals(-1, output);
        }

        @Test
        void shouldReturn0IfRootIsOnlyNode() {
            var output = HeightOfTree.howHigh(new Node<>("2"));

            Assertions.assertEquals(0, output);
        }

        @Test
        void shouldReturnHeightForBalancedTree() {
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

            var output = HeightOfTree.howHigh(a);

            Assertions.assertEquals(2, output);
        }

        @Test
        void shouldReturnHeightForUnbalancedTree() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            Node<String> e = new Node<>("e");
            Node<String> f = new Node<>("f");
            Node<String> g = new Node<>("g");
            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            c.right = f;
            e.left = g;
            //      a
            //    /   \
            //   b     c
            //  / \     \
            // d   e     f
            //    /
            //   g

            var output = HeightOfTree.howHigh(a);

            Assertions.assertEquals(3, output);
        }

        @Test
        void shouldReturnHeightForLeftSkewedTree() {
            Node<String> a = new Node<>("a");
            a.right = new Node<>("c");
            //      a
            //       \
            //        c

            var output = HeightOfTree.howHigh(a);

            Assertions.assertEquals(1, output);
        }
    }

    @Nested
    class HeightViaLevelOrder {

        @Test
        void shouldReturnNeg1IfRootIsNull() {
            var output = HeightOfTree.heightViaLevelOrder(null);

            Assertions.assertEquals(-1, output);
        }

        @Test
        void shouldReturn0IfRootIsOnlyNode() {
            var output = HeightOfTree.heightViaLevelOrder(new Node<>("2"));

            Assertions.assertEquals(0, output);
        }

        @Test
        void shouldReturnHeightForBalancedTree() {
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

            var output = HeightOfTree.heightViaLevelOrder(a);

            Assertions.assertEquals(2, output);
        }

        @Test
        void shouldReturnHeightForUnbalancedTree() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            Node<String> e = new Node<>("e");
            Node<String> f = new Node<>("f");
            Node<String> g = new Node<>("g");
            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            c.right = f;
            e.left = g;
            //      a
            //    /   \
            //   b     c
            //  / \     \
            // d   e     f
            //    /
            //   g

            var output = HeightOfTree.heightViaLevelOrder(a);

            Assertions.assertEquals(3, output);
        }

        @Test
        void shouldReturnHeightForLeftSkewedTree() {
            Node<String> a = new Node<>("a");
            a.right = new Node<>("c");
            //      a
            //       \
            //        c

            var output = HeightOfTree.heightViaLevelOrder(a);

            Assertions.assertEquals(1, output);
        }
    }
}