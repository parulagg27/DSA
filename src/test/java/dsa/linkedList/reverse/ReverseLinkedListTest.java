package dsa.linkedList.reverse;

import dsa.linkedList.Node;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReverseLinkedListTest {

    @Nested
    class ReverseList {

        @Test
        void returnReversedLinkedListOfSize4(){
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            a.next = b;
            b.next = c;
            c.next = d;

            var output = ReverseLinkedList.reverseList(a);

            assertEquals(d, output);
            assertEquals(d.next, c);
            assertEquals(c.next, b);
            assertEquals(b.next, a);
            assertNull(a.next);
        }

        @Test
        void returnReversedLinkedListOfSize2(){
            Node<String> x = new Node<>("x");
            Node<String> y = new Node<>("y");
            x.next = y;

            var output = ReverseLinkedList.reverseList(x);

            assertEquals(y, output);
            assertEquals(y.next, x);
            assertNull(x.next);
        }

        @Test
        void returnReversedLinkedListOfSize1(){
            Node<String> p = new Node<>("p");

            var output = ReverseLinkedList.reverseList(p);

            assertEquals(p, output);
        }

        @Test
        void returnReversedLinkedListOfSize0(){
            var output = ReverseLinkedList.reverseList(null);

            assertNull(output);
        }
    }

    @Nested
    class ReverseListRecursively {

        @Test
        void returnReversedLinkedListOfSize4(){
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            a.next = b;
            b.next = c;
            c.next = d;

            var output = ReverseLinkedList.reverseListRecursive(a);

            assertEquals(d, output);
            assertEquals(d.next, c);
            assertEquals(c.next, b);
            assertEquals(b.next, a);
            assertNull(a.next);
        }

        @Test
        void returnReversedLinkedListOfSize2(){
            Node<String> x = new Node<>("x");
            Node<String> y = new Node<>("y");
            x.next = y;

            var output = ReverseLinkedList.reverseListRecursive(x);

            assertEquals(y, output);
            assertEquals(y.next, x);
            assertNull(x.next);
        }

        @Test
        void returnReversedLinkedListOfSize1(){
            Node<String> p = new Node<>("p");

            var output = ReverseLinkedList.reverseListRecursive(p);

            assertEquals(p, output);
        }
    }
}