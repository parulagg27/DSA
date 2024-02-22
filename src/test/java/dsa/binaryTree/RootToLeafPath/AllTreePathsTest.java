package dsa.binaryTree.RootToLeafPath;

import dsa.binaryTree.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

class AllTreePathsTest {

    @Nested
    class ViaRecursionBruteForce {

        @Test
        void shouldReturnAllPathsForBalancedBinaryTree() {
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

            var output = AllTreePaths.allTreePaths(a);

            List<List<String>> expected = List.of(
                    List.of("a", "b", "d"),
                    List.of("a", "b", "e"),
                    List.of("a", "c", "f")
            );
            Assertions.assertEquals(expected, output);
        }

        @Test
        void shouldReturnAllPathsForTree() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            Node<String> e = new Node<>("e");
            Node<String> f = new Node<>("f");
            Node<String> g = new Node<>("g");
            Node<String> h = new Node<>("h");
            Node<String> i = new Node<>("i");
            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            c.right = f;
            e.left = g;
            e.right = h;
            f.left = i;
            //         a
            //      /    \
            //     b      c
            //   /  \      \
            //  d    e      f
            //      / \    /
            //     g  h   i

            var output = AllTreePaths.allTreePaths(a);

            List<List<String>> expected = List.of(
                    List.of("a", "b", "d"),
                    List.of("a", "b", "e", "g"),
                    List.of("a", "b", "e", "h"),
                    List.of("a", "c", "f", "i")
            );
            Assertions.assertEquals(expected, output);
        }

        @Test
        void shouldReturnAllPathsForLeftSkewedTree() {
            Node<String> q = new Node<>("q");
            Node<String> r = new Node<>("r");
            Node<String> s = new Node<>("s");
            Node<String> t = new Node<>("t");
            Node<String> u = new Node<>("u");
            Node<String> v = new Node<>("v");
            q.left = r;
            q.right = s;
            r.right = t;
            t.left = u;
            u.right = v;
            //      q
            //    /   \
            //   r     s
            //    \
            //     t
            //    /
            //   u
            //  /
            // v

            var output = AllTreePaths.allTreePaths(q);

            List<List<String>> expected = List.of(
                    List.of("q", "r","t", "u", "v"),
                    List.of("q", "s")
            );
            Assertions.assertEquals(expected, output);
        }

        @Test
        void shouldReturnPathForSingleNodeTree() {
            Node<String> z = new Node<>("z");
            //    z

            var output = AllTreePaths.allTreePaths(z);

            var expected = List.of(List.of("z"));
            Assertions.assertEquals(expected, output);
        }
    }

    @Nested
    class ViaPostOrder {

        @Test
        void shouldReturnAllPathsForBalancedBinaryTree() {
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

            var output = AllTreePaths.viaPostOrder(a);

            List<List<String>> expected = List.of(
                    List.of("a", "b", "d"),
                    List.of("a", "b", "e"),
                    List.of("a", "c", "f")
            );
            Assertions.assertEquals(expected, output);
        }

        @Test
        void shouldReturnAllPathsForTree() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            Node<String> e = new Node<>("e");
            Node<String> f = new Node<>("f");
            Node<String> g = new Node<>("g");
            Node<String> h = new Node<>("h");
            Node<String> i = new Node<>("i");
            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            c.right = f;
            e.left = g;
            e.right = h;
            f.left = i;
            //         a
            //      /    \
            //     b      c
            //   /  \      \
            //  d    e      f
            //      / \    /
            //     g  h   i

            var output = AllTreePaths.viaPostOrder(a);

            List<List<String>> expected = List.of(
                    List.of("a", "b", "d"),
                    List.of("a", "b", "e", "g"),
                    List.of("a", "b", "e", "h"),
                    List.of("a", "c", "f", "i")
            );
            Assertions.assertEquals(expected, output);
        }

        @Test
        void shouldReturnAllPathsForLeftSkewedTree() {
            Node<String> q = new Node<>("q");
            Node<String> r = new Node<>("r");
            Node<String> s = new Node<>("s");
            Node<String> t = new Node<>("t");
            Node<String> u = new Node<>("u");
            Node<String> v = new Node<>("v");
            q.left = r;
            q.right = s;
            r.right = t;
            t.left = u;
            u.right = v;
            //      q
            //    /   \
            //   r     s
            //    \
            //     t
            //    /
            //   u
            //  /
            // v

            var output = AllTreePaths.viaPostOrder(q);

            List<List<String>> expected = List.of(
                    List.of("q", "r","t", "u", "v"),
                    List.of("q", "s")
            );
            Assertions.assertEquals(expected, output);
        }

        @Test
        void shouldReturnPathForSingleNodeTree() {
            Node<String> z = new Node<>("z");
            //    z

            var output = AllTreePaths.viaPostOrder(z);

            var expected = List.of(List.of("z"));
            Assertions.assertEquals(expected, output);
        }
    }
}