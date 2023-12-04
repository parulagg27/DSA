package dsa.linkedList.insertNode;


import dsa.linkedList.Node;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InsertNodeTest {

    @Nested
    class insertNodeIterative {

        @Test
        void shouldInsertAtBeginningOfLinkedList() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            a.next = b;
            Node<String> z = new Node<>("z");

            var output = InsertNode.insertNodeIterative(a, "z", 0);

            assertEquals(z.value, output.value);
            assertEquals(output.next, a);
            assertEquals(a.next, b);
        }

        @Test
        void shouldInsertAtTheEndOfLinkedList() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            a.next = b;
            b.next = c;
            c.next = d;

            var output = InsertNode.insertNodeIterative(a, "m", 4);

            assertEquals(a, output);
            assertEquals(a.next, b);
            assertEquals(b.next, c);
            assertEquals(c.next, d);
            assertEquals(d.next.value, "m");
        }

        @Test
        void shouldInsertAtTheMiddleOfLinkedList() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            a.next = b;
            b.next = c;
            c.next = d;

            var output = InsertNode.insertNodeIterative(a, "v", 3);

            assertEquals(a, output);
            assertEquals(a.next, b);
            assertEquals(b.next, c);
            assertEquals(c.next.value, "v");
            assertEquals(c.next.next, d);
        }

        @Test
        void shouldInsertNodeAtGivenPositionInLinkedList() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            a.next = b;
            b.next = c;
            c.next = d;

            var output = InsertNode.insertNodeIterative(a, "x", 2);

            assertEquals(a, output);
            assertEquals(a.next, b);
            assertEquals(b.next.value, "x");
            assertEquals(b.next.next, c);
            assertEquals(c.next, d);
        }
    }

    @Nested
    class insertNodeRecursive {

        @Test
        void shouldInsertAtBeginningOfLinkedList() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            a.next = b;
            Node<String> z = new Node<>("z");

            var output = InsertNode.insertNodeRecursive(a, "z", 0);

            assertEquals(z.value, output.value);
            assertEquals(output.next, a);
            assertEquals(a.next, b);
        }

        @Test
        void shouldInsertAtTheEndOfLinkedList() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            a.next = b;
            b.next = c;
            c.next = d;

            var output = InsertNode.insertNodeRecursive(a, "m", 4);

            assertEquals(a, output);
            assertEquals(a.next, b);
            assertEquals(b.next, c);
            assertEquals(c.next, d);
            assertEquals(d.next.value, "m");
        }

        @Test
        void shouldInsertAtTheMiddleOfLinkedList() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            a.next = b;
            b.next = c;
            c.next = d;

            var output = InsertNode.insertNodeRecursive(a, "v", 3);

            assertEquals(a, output);
            assertEquals(a.next, b);
            assertEquals(b.next, c);
            assertEquals(c.next.value, "v");
            assertEquals(c.next.next, d);
        }

        @Test
        void shouldInsertNodeAtGivenPositionInLinkedList() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            a.next = b;
            b.next = c;
            c.next = d;

            var output = InsertNode.insertNodeRecursive(a, "x", 2);

            assertEquals(a, output);
            assertEquals(a.next, b);
            assertEquals(b.next.value, "x");
            assertEquals(b.next.next, c);
            assertEquals(c.next, d);
        }
    }
}