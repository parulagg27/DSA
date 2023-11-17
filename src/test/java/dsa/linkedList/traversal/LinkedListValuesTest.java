package dsa.linkedList.traversal;

import dsa.linkedList.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class LinkedListValuesTest {

    @Nested
    class IterativeApproach {

        @Test
        void shouldReturnEmptyListIfLinkedListHasNoNodes() {
            var output = LinkedListValues.values(null);

            Assertions.assertEquals(new ArrayList<>(), output);
        }

        @Test
        void shouldReturnListOfSize1ForLinkedListWithOneNode() {
            Node<String> head = new Node<>("a");

            var output = LinkedListValues.values(head);

            Assertions.assertEquals(List.of("a"), output);
        }

        @Test
        void shouldReturnAllValuesGivenLinkedListWith4Nodes() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            a.next = b;
            b.next = c;
            c.next = d;

            var output = LinkedListValues.values(a);

            Assertions.assertEquals(List.of("a", "b", "c", "d"), output);
        }

        @Test
        void shouldReturnAllValuesGivenLinkedListWith2Nodes() {
            Node<String> x = new Node<>("x");
            x.next = new Node<>("y");

            var output = LinkedListValues.values(x);

            Assertions.assertEquals(List.of("x", "y"), output);
        }
    }

    @Nested
    class RecursiveApproach {

        @Test
        void shouldReturnEmptyListIfLinkedListHasNoNodes() {
            var output = LinkedListValues.valuesRecursive(null);

            Assertions.assertEquals(new ArrayList<>(), output);
        }

        @Test
        void shouldReturnListOfSize1ForLinkedListWithOneNode() {
            Node<String> head = new Node<>("a");

            var output = LinkedListValues.valuesRecursive(head);

            Assertions.assertEquals(List.of("a"), output);
        }

        @Test
        void shouldReturnAllValuesGivenLinkedListWith4Nodes() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            a.next = b;
            b.next = c;
            c.next = d;

            var output = LinkedListValues.valuesRecursive(a);

            Assertions.assertEquals(List.of("a", "b", "c", "d"), output);
        }

        @Test
        void shouldReturnAllValuesGivenLinkedListWith2Nodes() {
            Node<String> x = new Node<>("x");
            x.next = new Node<>("y");

            var output = LinkedListValues.valuesRecursive(x);

            Assertions.assertEquals(List.of("x", "y"), output);
        }
    }
}