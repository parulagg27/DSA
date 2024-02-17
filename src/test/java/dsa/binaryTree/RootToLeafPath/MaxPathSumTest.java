package dsa.binaryTree.RootToLeafPath;

import dsa.binaryTree.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class MaxPathSumTest {

    @Nested
    class maxPathSumIterative {
        @Test
        void shouldReturnOForNullRoot() {
            var output = MaxPathSum.maxPathSum(null);

            Assertions.assertEquals(0.0, output);
        }

        @Test
        void shouldReturnMaxValueOfPath() {
            Node<Double> a = new Node<>(3.);
            Node<Double> b = new Node<>(11.);
            Node<Double> c = new Node<>(4.);
            Node<Double> d = new Node<>(4.);
            Node<Double> e = new Node<>(-2.);
            Node<Double> f = new Node<>(1.);
            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            c.right = f;
            /*
                    3
                  /    \
                 11     4
                / \      \
               4   -2     1
             */

            var output = MaxPathSum.maxPathSum(a);

            Assertions.assertEquals(18, output);
        }

        @Test
        void shouldReturnMaxSumValueForTreeWithAllPositiveValues() {
            Node<Double> a = new Node<>(5.);
            Node<Double> b = new Node<>(11.);
            Node<Double> c = new Node<>(54.);
            Node<Double> d = new Node<>(20.);
            Node<Double> e = new Node<>(15.);
            Node<Double> f = new Node<>(1.);
            Node<Double> g = new Node<>(3.);
            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            e.left = f;
            e.right = g;
            //        5
            //     /    \
            //    11    54
            //  /   \
            // 20   15
            //      / \
            //     1  3

            var output = MaxPathSum.maxPathSum(a);

            Assertions.assertEquals(59, output);
        }

        @Test
        void shouldReturnMaxSumValueForTreeWithAllNegativeValues() {
            //TODO: Tricky case, where total sum had to be checked only if left and right node is null. Else not check [for node with value 0]
            Node<Double> a = new Node<>(-1.);
            Node<Double> b = new Node<>(-6.);
            Node<Double> c = new Node<>(-5.);
            Node<Double> d = new Node<>(-3.);
            Node<Double> e = new Node<>(0.);
            Node<Double> f = new Node<>(-13.);
            Node<Double> g = new Node<>(-1.);
            Node<Double> h = new Node<>(-2.);
            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            c.right = f;
            e.left = g;
            f.right = h;
            //        -1
            //      /   \
            //    -6    -5
            //   /  \     \
            // -3   0    -13
            //     /       \
            //    -1       -2

            var output = MaxPathSum.maxPathSum(a);

            Assertions.assertEquals(-8, output);
        }

        @Test
        void shouldReturnRootNodeValueAsMaxSumForTreeWith1Node() {
            Node<Double> a = new Node<>(42.);

            var output = MaxPathSum.maxPathSum(a);

            Assertions.assertEquals(42.0, output);
        }

    }

    @Nested
    class maxPathSumRecursive {

        @Test
        void shouldReturnMaxValueOfPath() {
            Node<Double> a = new Node<>(3.);
            Node<Double> b = new Node<>(11.);
            Node<Double> c = new Node<>(4.);
            Node<Double> d = new Node<>(4.);
            Node<Double> e = new Node<>(-2.);
            Node<Double> f = new Node<>(1.);
            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            c.right = f;
            /*
                    3
                  /    \
                 11     4
                / \      \
               4   -2     1
             */

            var output = MaxPathSum.maxPathSumRecursive(a);

            Assertions.assertEquals(18, output);
        }

        @Test
        void shouldReturnMaxSumValueForTreeWithAllPositiveValues() {
            Node<Double> a = new Node<>(5.);
            Node<Double> b = new Node<>(11.);
            Node<Double> c = new Node<>(54.);
            Node<Double> d = new Node<>(20.);
            Node<Double> e = new Node<>(15.);
            Node<Double> f = new Node<>(1.);
            Node<Double> g = new Node<>(3.);
            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            e.left = f;
            e.right = g;
            //        5
            //     /    \
            //    11    54
            //  /   \
            // 20   15
            //      / \
            //     1  3

            var output = MaxPathSum.maxPathSumRecursive(a);

            Assertions.assertEquals(59, output);
        }

        @Test
        void shouldReturnMaxSumValueForTreeWithAllNegativeValues() {
            //TODO: Tricky case, where total sum had to be checked only if left and right node is null. Else not check [for node with value 0]
            Node<Double> a = new Node<>(-1.);
            Node<Double> b = new Node<>(-6.);
            Node<Double> c = new Node<>(-5.);
            Node<Double> d = new Node<>(-3.);
            Node<Double> e = new Node<>(0.);
            Node<Double> f = new Node<>(-13.);
            Node<Double> g = new Node<>(-1.);
            Node<Double> h = new Node<>(-2.);
            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            c.right = f;
            e.left = g;
            f.right = h;
            //        -1
            //      /   \
            //    -6    -5
            //   /  \     \
            // -3   0    -13
            //     /       \
            //    -1       -2

            var output = MaxPathSum.maxPathSumRecursive(a);

            Assertions.assertEquals(-8, output);
        }

        @Test
        void shouldReturnRootNodeValueAsMaxSumForTreeWith1Node() {
            Node<Double> a = new Node<>(42.);

            var output = MaxPathSum.maxPathSumRecursive(a);

            Assertions.assertEquals(42.0, output);
        }
    }
}