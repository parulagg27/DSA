package dsa.linkedList.removeNode;

import dsa.linkedList.Node;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RemoveNodeTest {

    @Nested
    class RemoveNodeIterative {

        @Test
        void shouldRemoveNodeFromListOfSize1(){
            Node<String> a = new Node<>("A");

            var output = RemoveNode.removeNodeIterative(a, "A");

            assertNull(output);
        }

        @Test
        void shouldRemoveFromMiddleOfList() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            Node<String> e = new Node<>("e");
            Node<String> f = new Node<>("f");
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;

            var output = RemoveNode.removeNodeIterative(a, "c");

            assertEquals(a, output);
            assertEquals(a.next, b);
            assertEquals(b.next, d);
            assertEquals(d.next, e);
            assertEquals(e.next, f);
        }

        @Test
        void shouldRemoveNodeFromEndOfLinkedList() {
            Node<String> x = new Node<>("x");
            Node<String> y = new Node<>("y");
            Node<String> z = new Node<>("z");
            x.next = y;
            y.next = z;

            var output = RemoveNode.removeNodeIterative(x, "z");

            assertEquals(x, output);
            assertEquals(x.next, y);
            assertNull(y.next);
        }

        @Test
        void shouldRemoveNodeFromBeginningOfLinkedList() {
            Node<String> x = new Node<>("x");
            Node<String> y = new Node<>("y");
            Node<String> z = new Node<>("z");
            x.next = y;
            y.next = z;

            var output = RemoveNode.removeNodeIterative(x, "x");

            assertEquals(y, output);
            assertEquals(y.next, z);
        }

        @Test
        void shouldRemoveFirstOccuranceOfValue() {
            Node<String> node1 = new Node<>("h");
            Node<String> node2 = new Node<>("i");
            Node<String> node3 = new Node<>("j");
            Node<String> node4 = new Node<>("i");
            node1.next = node2;
            node2.next = node3;
            node3.next = node4;

            var output = RemoveNode.removeNodeIterative(node1, "i");

            assertEquals(node1, output);
            assertEquals(node1.next, node3);
            assertEquals(node3.next, node4);
            assertNull(node4.next);
        }
    }

    @Nested
    class RemoveNodeRecursively {

        @Test
        void shouldRemoveNodeFromListOfSize1(){
            Node<String> a = new Node<>("A");

            var output = RemoveNode.removeNodeRecursively(a, "A");

            assertNull(output);
        }

        @Test
        void shouldRemoveFromMiddleOfList() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            Node<String> e = new Node<>("e");
            Node<String> f = new Node<>("f");
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;

            var output = RemoveNode.removeNodeRecursively(a, "c");

            assertEquals(a, output);
            assertEquals(a.next, b);
            assertEquals(b.next, d);
            assertEquals(d.next, e);
            assertEquals(e.next, f);
        }

        @Test
        void shouldRemoveNodeFromEndOfLinkedList() {
            Node<String> x = new Node<>("x");
            Node<String> y = new Node<>("y");
            Node<String> z = new Node<>("z");
            x.next = y;
            y.next = z;

            var output = RemoveNode.removeNodeRecursively(x, "z");

            assertEquals(x, output);
            assertEquals(x.next, y);
            assertNull(y.next);
        }

        @Test
        void shouldRemoveNodeFromBeginningOfLinkedList() {
            Node<String> x = new Node<>("x");
            Node<String> y = new Node<>("y");
            Node<String> z = new Node<>("z");
            x.next = y;
            y.next = z;

            var output = RemoveNode.removeNodeRecursively(x, "x");

            assertEquals(y, output);
            assertEquals(y.next, z);
        }

        @Test
        void shouldRemoveFirstOccuranceOfValue() {
            Node<String> node1 = new Node<>("h");
            Node<String> node2 = new Node<>("i");
            Node<String> node3 = new Node<>("j");
            Node<String> node4 = new Node<>("i");
            node1.next = node2;
            node2.next = node3;
            node3.next = node4;

            var output = RemoveNode.removeNodeRecursively(node1, "i");

            assertEquals(node1, output);
            assertEquals(node1.next, node3);
            assertEquals(node3.next, node4);
            assertNull(node4.next);
        }
    }

    @Nested
    class RemoveNodeRecursiveSimplified {

        @Test
        void shouldRemoveNodeFromListOfSize1(){
            Node<String> a = new Node<>("A");

            var output = RemoveNode.removeNodeRecursiveSimplified(a, "A");

            assertNull(output);
        }

        @Test
        void shouldRemoveFromMiddleOfList() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            Node<String> e = new Node<>("e");
            Node<String> f = new Node<>("f");
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;

            var output = RemoveNode.removeNodeRecursiveSimplified(a, "c");

            assertEquals(a, output);
            assertEquals(a.next, b);
            assertEquals(b.next, d);
            assertEquals(d.next, e);
            assertEquals(e.next, f);
        }

        @Test
        void shouldRemoveNodeFromEndOfLinkedList() {
            Node<String> x = new Node<>("x");
            Node<String> y = new Node<>("y");
            Node<String> z = new Node<>("z");
            x.next = y;
            y.next = z;

            var output = RemoveNode.removeNodeRecursiveSimplified(x, "z");

            assertEquals(x, output);
            assertEquals(x.next, y);
            assertNull(y.next);
        }

        @Test
        void shouldRemoveNodeFromBeginningOfLinkedList() {
            Node<String> x = new Node<>("x");
            Node<String> y = new Node<>("y");
            Node<String> z = new Node<>("z");
            x.next = y;
            y.next = z;

            var output = RemoveNode.removeNodeRecursiveSimplified(x, "x");

            assertEquals(y, output);
            assertEquals(y.next, z);
        }

        @Test
        void shouldRemoveFirstOccuranceOfValue() {
            Node<String> node1 = new Node<>("h");
            Node<String> node2 = new Node<>("i");
            Node<String> node3 = new Node<>("j");
            Node<String> node4 = new Node<>("i");
            node1.next = node2;
            node2.next = node3;
            node3.next = node4;

            var output = RemoveNode.removeNodeRecursiveSimplified(node1, "i");

            assertEquals(node1, output);
            assertEquals(node1.next, node3);
            assertEquals(node3.next, node4);
            assertNull(node4.next);
        }
    }
}