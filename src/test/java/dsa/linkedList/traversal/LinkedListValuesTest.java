package dsa.linkedList.traversal;

import dsa.linkedList.Node;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListValuesTest {

    @Nested
    class GetValuesIteratively {

        @Test
        void shouldReturnEmptyListIfLinkedListHasNoNodes() {
            var output = LinkedListValues.values(null);

            assertEquals(new ArrayList<>(), output);
        }

        @Test
        void shouldReturnListOfSize1ForLinkedListWithOneNode() {
            Node<String> head = new Node<>("a");

            var output = LinkedListValues.values(head);

            assertEquals(List.of("a"), output);
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

            assertEquals(List.of("a", "b", "c", "d"), output);
        }

        @Test
        void shouldReturnAllValuesGivenLinkedListWith2Nodes() {
            Node<String> x = new Node<>("x");
            x.next = new Node<>("y");

            var output = LinkedListValues.values(x);

            assertEquals(List.of("x", "y"), output);
        }
    }

    @Nested
    class GetValuesRecursively {

        @Test
        void shouldReturnEmptyListIfLinkedListHasNoNodes() {
            var output = LinkedListValues.valuesRecursive(null);

            assertEquals(new ArrayList<>(), output);
        }

        @Test
        void shouldReturnListOfSize1ForLinkedListWithOneNode() {
            Node<String> head = new Node<>("a");

            var output = LinkedListValues.valuesRecursive(head);

            assertEquals(List.of("a"), output);
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

            assertEquals(List.of("a", "b", "c", "d"), output);
        }

        @Test
        void shouldReturnAllValuesGivenLinkedListWith2Nodes() {
            Node<String> x = new Node<>("x");
            x.next = new Node<>("y");

            var output = LinkedListValues.valuesRecursive(x);

            assertEquals(List.of("x", "y"), output);
        }
    }

    @Nested
    class GetSumOfValuesIteratively {

        @Test
        void shouldReturnSumAsZeroIfNoNodePresentInLinkedList() {
            var output = LinkedListValues.sumList(null);

            assertEquals(0, output);
        }

        @Test
        void shouldReturnValueOfHeadAsSumIfOnly1NodeInLinkedList() {
            Node<Integer> head = new Node<>(10);

            var output = LinkedListValues.sumList(head);

            assertEquals(10, output);
        }

        @Test
        void shouldReturnSumOfValuesOfAllNodesInLinkedList() {
            Node<Integer> a = new Node<>(2);
            Node<Integer> b = new Node<>(8);
            Node<Integer> c = new Node<>(3);
            Node<Integer> d = new Node<>(-1);
            Node<Integer> e = new Node<>(7);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;

            var output = LinkedListValues.sumList(a);

            assertEquals(19, output);
        }

        @Test
        void shouldReturnSumOfValuesGivenLinkedListOfSize2() {
            Node<Integer> x = new Node<>(38);
            x.next = new Node<>(4);

            var output = LinkedListValues.sumList(x);

            assertEquals(42, output);
        }
    }

    @Nested
    class GetSumOfValuesRecursively {

        @Test
        void shouldReturnSumAsZeroIfNoNodePresentInLinkedList() {
            var output = LinkedListValues.sumListRecursive(null);

            assertEquals(0, output);
        }

        @Test
        void shouldReturnValueOfHeadAsSumIfOnly1NodeInLinkedList() {
            Node<Integer> head = new Node<>(10);

            var output = LinkedListValues.sumListRecursive(head);

            assertEquals(10, output);
        }

        @Test
        void shouldReturnSumOfValuesOfAllNodesInLinkedList() {
            Node<Integer> a = new Node<>(2);
            Node<Integer> b = new Node<>(8);
            Node<Integer> c = new Node<>(3);
            Node<Integer> d = new Node<>(-1);
            Node<Integer> e = new Node<>(7);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;

            var output = LinkedListValues.sumListRecursive(a);

            assertEquals(19, output);
        }

        @Test
        void shouldReturnSumOfValuesGivenLinkedListOfSize2() {
            Node<Integer> x = new Node<>(38);
            x.next = new Node<>(4);

            var output = LinkedListValues.sumListRecursive(x);

            assertEquals(42, output);
        }
    }

    @Nested
    class FindTargetValueIteratively {

        @Test
        void shouldReturnFalseIfLinkedListDoesntContainAnyNode() {
            var output = LinkedListValues.linkedListFind(null, 1);

            assertFalse(output);
        }

        @Test
        void shouldReturnFalseIfTargetValuePresentInLinkedListOfSize1() {
            var output = LinkedListValues.linkedListFind(new Node<>(42), 100);

            assertFalse(output);
        }

        @Test
        void shouldReturnTrueIfTargetValuePresentInLinkedListOfSize1() {
            var output = LinkedListValues.linkedListFind(new Node<>(42), 42);

            assertTrue(output);
        }

        @Test
        void shouldReturnTrueIfTargetValueNotInLinkedListOfStrings() {
            Node<String> node1 = new Node<>("jason");
            node1.next = new Node<>("july");

            var output = LinkedListValues.linkedListFind(node1, "jason");

            assertTrue(output);
        }

        @Test
        void shouldReturnTrueIfTargetValueNotInLinkedListOfStringsWithSize4() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            a.next = b;
            b.next = c;
            c.next = d;

            var output = LinkedListValues.linkedListFind(a, "c");

            assertTrue(output);
        }

        @Test
        void shouldReturnFalseIfTargetValueNotInLinkedListOfStringsWithSize4() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            a.next = b;
            b.next = c;
            c.next = d;

            var output = LinkedListValues.linkedListFind(a, "q");

            assertFalse(output);
        }
    }

    @Nested
    class FindTargetValueRecursively {

        @Test
        void shouldReturnFalseIfTargetValuePresentInLinkedListOfSize1() {
            var output = LinkedListValues.linkedListRecursively(new Node<>(42), 100);

            assertFalse(output);
        }

        @Test
        void shouldReturnTrueIfTargetValuePresentInLinkedListOfSize1() {
            var output = LinkedListValues.linkedListRecursively(new Node<>(42), 42);

            assertTrue(output);
        }

        @Test
        void shouldReturnTrueIfTargetValueNotInLinkedListOfStrings() {
            Node<String> node1 = new Node<>("jason");
            node1.next = new Node<>("july");

            var output = LinkedListValues.linkedListRecursively(node1, "jason");

            assertTrue(output);
        }

        @Test
        void shouldReturnTrueIfTargetValueNotInLinkedListOfStringsWithSize4() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            a.next = b;
            b.next = c;
            c.next = d;

            var output = LinkedListValues.linkedListRecursively(a, "c");

            assertTrue(output);
        }

        @Test
        void shouldReturnFalseIfTargetValueNotInLinkedListOfStringsWithSize4() {
            Node<String> a = new Node<>("a");
            Node<String> b = new Node<>("b");
            Node<String> c = new Node<>("c");
            Node<String> d = new Node<>("d");
            a.next = b;
            b.next = c;
            c.next = d;

            var output = LinkedListValues.linkedListRecursively(a, "q");

            assertFalse(output);
        }
    }
}