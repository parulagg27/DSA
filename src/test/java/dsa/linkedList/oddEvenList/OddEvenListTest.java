package dsa.linkedList.oddEvenList;

import dsa.linkedList.Node;
import dsa.linkedList.createList.CreateLinkedList;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenListTest {

    @Nested
    class RearrangeOddEven {
        @Test
        void shouldRearrangeOddEvenIndexNodesInListOf5Nodes() {
            var listHead = CreateLinkedList.createList(List.of(1, 7, 3, 8));

            assert listHead != null;
            var output = OddEvenList.rearrangeOddEven(listHead);

            assertEquals(1, output.value);
            assertEquals(3, output.next.value);
            assertEquals(7, output.next.next.value);
            assertEquals(8, output.next.next.next.value);
            assertNull(output.next.next.next.next);
        }

        @Test
        void shouldReturnNullForNoElementInLinkedList() {
            var output = OddEvenList.rearrangeOddEven(null);

            assertNull(output);
        }

        @Test
        void shouldReturnNodeItselfIfOnly1NodeInList() {
            var input = new Node<>(1);

            var output = OddEvenList.rearrangeOddEven(input);

            assertEquals(input, output);
            assertNull(output.next);
        }

        @Test
        void shouldReturnListItselfIfListWith2Nodes() {
            var listHead = CreateLinkedList.createList(List.of(1, 7));

            assert listHead != null;
            var output = OddEvenList.rearrangeOddEven(listHead);

            assertEquals(1, output.value);
            assertEquals(7, output.next.value);
            assertNull(output.next.next);
        }

        @Test
        void shouldRearrangeOddEvenNodesInListOf5Elements(){
            var listHead = CreateLinkedList.createList(List.of(1, 2, 3, 4, 5));

            assert listHead != null;
            var output = OddEvenList.rearrangeOddEven(listHead);

            assertEquals(1, output.value);
            assertEquals(3, output.next.value);
            assertEquals(5, output.next.next.value);
            assertEquals(2, output.next.next.next.value);
            assertEquals(4, output.next.next.next.next.value);
            assertNull(output.next.next.next.next.next);
        }
    }

    @Nested
    class RearrangeOddEvenSimplified {
        @Test
        void shouldRearrangeOddEvenIndexNodesInListOf5Nodes() {
            var listHead = CreateLinkedList.createList(List.of(1, 7, 3, 8));

            assert listHead != null;
            var output = OddEvenList.rearrangeOddEvenSimplified(listHead);

            assertEquals(1, output.value);
            assertEquals(3, output.next.value);
            assertEquals(7, output.next.next.value);
            assertEquals(8, output.next.next.next.value);
            assertNull(output.next.next.next.next);
        }

        @Test
        void shouldReturnNullForNoElementInLinkedList() {
            var output = OddEvenList.rearrangeOddEvenSimplified(null);

            assertNull(output);
        }

        @Test
        void shouldReturnNodeItselfIfOnly1NodeInList() {
            var input = new Node<>(1);

            var output = OddEvenList.rearrangeOddEvenSimplified(input);

            assertEquals(input, output);
            assertNull(output.next);
        }

        @Test
        void shouldReturnListItselfIfListWith2Nodes() {
            var listHead = CreateLinkedList.createList(List.of(1, 7));

            assert listHead != null;
            var output = OddEvenList.rearrangeOddEvenSimplified(listHead);

            assertEquals(1, output.value);
            assertEquals(7, output.next.value);
            assertNull(output.next.next);
        }

        @Test
        void shouldRearrangeOddEvenNodesInListOf5Elements(){
            var listHead = CreateLinkedList.createList(List.of(1, 2, 3, 4, 5));

            assert listHead != null;
            var output = OddEvenList.rearrangeOddEvenSimplified(listHead);

            assertEquals(1, output.value);
            assertEquals(3, output.next.value);
            assertEquals(5, output.next.next.value);
            assertEquals(2, output.next.next.next.value);
            assertEquals(4, output.next.next.next.next.value);
            assertNull(output.next.next.next.next.next);
        }
    }
}