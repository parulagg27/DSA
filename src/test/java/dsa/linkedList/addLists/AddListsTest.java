package dsa.linkedList.addLists;

import dsa.linkedList.Node;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddListsTest {

    @Nested
    class Add2ListsIterative {

        @Test
        void shouldReturnNullIf2ListsAreEmpty() {
            var output = AddLists.add2Lists(null, null);

            assertNull(output);
        }

        @Test
        void shouldAddAnEmptyAndNonEmptyList() {
            Node<Integer> a = new Node<>(2);
            a.next = new Node<>(3);

            var output = AddLists.add2Lists(null, a);

            assertEquals(2, output.value);
            assertEquals(3, output.next.value);
            assertNull(output.next.next);
        }

        @Test
        void shouldAdd2ListsOfEqualSizeWithNoCarryForward() {
            Node<Integer> a1 = new Node<>(1);
            Node<Integer> a2 = new Node<>(2);
            Node<Integer> a3 = new Node<>(6);
            a1.next = a2;
            a2.next = a3;
            Node<Integer> b1 = new Node<>(4);
            Node<Integer> b2 = new Node<>(5);
            Node<Integer> b3 = new Node<>(3);
            b1.next = b2;
            b2.next = b3;

            var output = AddLists.add2Lists(a1, b1);

            assertEquals(5, output.value);
            assertEquals(7, output.next.value);
            assertEquals(9, output.next.next.value);
            assertNull(output.next.next.next);
        }

        @Test
        void shouldSum2ListsOfEqualSizeWithCarryForwardInBeginning() {
            Node<Integer> a1 = new Node<>(9);
            a1.next = new Node<>(3);
            Node<Integer> b1 = new Node<>(7);
            b1.next = new Node<>(4);

            var output = AddLists.add2Lists(a1, b1);

            assertEquals(6, output.value);
            assertEquals(8, output.next.value);
            assertNull(output.next.next);
        }

        @Test
        void shouldSum2ListsOfEqualSizeWithCarryForwardAfterEndOfTwoLists() {
            Node<Integer> a1 = new Node<>(9);
            a1.next = new Node<>(8);
            Node<Integer> b1 = new Node<>(7);
            b1.next = new Node<>(4);

            var output = AddLists.add2Lists(a1, b1);

            assertEquals(6, output.value);
            assertEquals(3, output.next.value);
            assertEquals(1, output.next.next.value);
            assertNull(output.next.next.next);
        }

        @Test
        void shouldSum2ListsOfUnequalSizeAndNoCarryForward() {
            Node<Integer> a1 = new Node<>(1);
            Node<Integer> a2 = new Node<>(4);
            Node<Integer> a3 = new Node<>(5);
            Node<Integer> a4 = new Node<>(7);
            a1.next = a2;
            a2.next = a3;
            a3.next = a4;
            Node<Integer> b1 = new Node<>(2);
            b1.next = new Node<>(3);

            var output = AddLists.add2Lists(a1, b1);

            assertEquals(3, output.value);
            assertEquals(7, output.next.value);
            assertEquals(5, output.next.next.value);
            assertEquals(7, output.next.next.next.value);
            assertNull(output.next.next.next.next);
        }

        @Test
        void shouldSum2ListsOfUnequalSizesWithCarryForward() {
            Node<Integer> a1 = new Node<>(9);
            Node<Integer> a2 = new Node<>(9);
            Node<Integer> a3 = new Node<>(9);
            a1.next = a2;
            a2.next = a3;
            Node<Integer> b1 = new Node<>(6);

            var output = AddLists.add2Lists(a1, b1);

            assertEquals(5, output.value);
            assertEquals(0, output.next.value);
            assertEquals(0, output.next.next.value);
            assertEquals(1, output.next.next.next.value);
            assertNull(output.next.next.next.next);
        }
    }

    @Nested
    class Add2ListsRecursively {

        @Test
        void shouldReturnNullIf2ListsAreEmpty() {
            var output = AddLists.add2ListsRecursively(null, null);

            assertNull(output);
        }

        @Test
        void shouldAddAnEmptyAndNonEmptyList() {
            Node<Integer> a = new Node<>(2);
            a.next = new Node<>(3);

            var output = AddLists.add2ListsRecursively(null, a);

            assertEquals(2, output.value);
            assertEquals(3, output.next.value);
            assertNull(output.next.next);
        }

        @Test
        void shouldAdd2ListsOfEqualSizeWithNoCarryForward() {
            Node<Integer> a1 = new Node<>(1);
            Node<Integer> a2 = new Node<>(2);
            Node<Integer> a3 = new Node<>(6);
            a1.next = a2;
            a2.next = a3;
            Node<Integer> b1 = new Node<>(4);
            Node<Integer> b2 = new Node<>(5);
            Node<Integer> b3 = new Node<>(3);
            b1.next = b2;
            b2.next = b3;

            var output = AddLists.add2ListsRecursively(a1, b1);

            assertEquals(5, output.value);
            assertEquals(7, output.next.value);
            assertEquals(9, output.next.next.value);
            assertNull(output.next.next.next);
        }

        @Test
        void shouldSum2ListsOfEqualSizeWithCarryForwardInBeginning() {
            Node<Integer> a1 = new Node<>(9);
            a1.next = new Node<>(3);
            Node<Integer> b1 = new Node<>(7);
            b1.next = new Node<>(4);

            var output = AddLists.add2ListsRecursively(a1, b1);

            assertEquals(6, output.value);
            assertEquals(8, output.next.value);
            assertNull(output.next.next);
        }

        @Test
        void shouldSum2ListsOfEqualSizeWithCarryForwardAfterEndOfTwoLists() {
            Node<Integer> a1 = new Node<>(9);
            a1.next = new Node<>(8);
            Node<Integer> b1 = new Node<>(7);
            b1.next = new Node<>(4);

            var output = AddLists.add2ListsRecursively(a1, b1);

            assertEquals(6, output.value);
            assertEquals(3, output.next.value);
            assertEquals(1, output.next.next.value);
            assertNull(output.next.next.next);
        }

        @Test
        void shouldSum2ListsOfUnequalSizeAndNoCarryForward() {
            Node<Integer> a1 = new Node<>(1);
            Node<Integer> a2 = new Node<>(4);
            Node<Integer> a3 = new Node<>(5);
            Node<Integer> a4 = new Node<>(7);
            a1.next = a2;
            a2.next = a3;
            a3.next = a4;
            Node<Integer> b1 = new Node<>(2);
            b1.next = new Node<>(3);

            var output = AddLists.add2ListsRecursively(a1, b1);

            assertEquals(3, output.value);
            assertEquals(7, output.next.value);
            assertEquals(5, output.next.next.value);
            assertEquals(7, output.next.next.next.value);
            assertNull(output.next.next.next.next);
        }

        @Test
        void shouldSum2ListsOfUnequalSizesWithCarryForward() {
            Node<Integer> a1 = new Node<>(9);
            Node<Integer> a2 = new Node<>(9);
            Node<Integer> a3 = new Node<>(9);
            a1.next = a2;
            a2.next = a3;
            Node<Integer> b1 = new Node<>(6);

            var output = AddLists.add2ListsRecursively(a1, b1);

            assertEquals(5, output.value);
            assertEquals(0, output.next.value);
            assertEquals(0, output.next.next.value);
            assertEquals(1, output.next.next.next.value);
            assertNull(output.next.next.next.next);
        }
    }

    @Nested
    class Add2ListsRecursivelySimplified {

        @Test
        void shouldReturnNullIf2ListsAreEmpty() {
            var output = AddLists.add2ListsRecursivelySimplified(null, null);

            assertNull(output);
        }

        @Test
        void shouldAddAnEmptyAndNonEmptyList() {
            Node<Integer> a = new Node<>(2);
            a.next = new Node<>(3);

            var output = AddLists.add2ListsRecursivelySimplified(null, a);

            assertEquals(2, output.value);
            assertEquals(3, output.next.value);
            assertNull(output.next.next);
        }

        @Test
        void shouldAdd2ListsOfEqualSizeWithNoCarryForward() {
            Node<Integer> a1 = new Node<>(1);
            Node<Integer> a2 = new Node<>(2);
            Node<Integer> a3 = new Node<>(6);
            a1.next = a2;
            a2.next = a3;
            Node<Integer> b1 = new Node<>(4);
            Node<Integer> b2 = new Node<>(5);
            Node<Integer> b3 = new Node<>(3);
            b1.next = b2;
            b2.next = b3;

            var output = AddLists.add2ListsRecursivelySimplified(a1, b1);

            assertEquals(5, output.value);
            assertEquals(7, output.next.value);
            assertEquals(9, output.next.next.value);
            assertNull(output.next.next.next);
        }

        @Test
        void shouldSum2ListsOfEqualSizeWithCarryForwardInBeginning() {
            Node<Integer> a1 = new Node<>(9);
            a1.next = new Node<>(3);
            Node<Integer> b1 = new Node<>(7);
            b1.next = new Node<>(4);

            var output = AddLists.add2ListsRecursivelySimplified(a1, b1);

            assertEquals(6, output.value);
            assertEquals(8, output.next.value);
            assertNull(output.next.next);
        }

        @Test
        void shouldSum2ListsOfEqualSizeWithCarryForwardAfterEndOfTwoLists() {
            Node<Integer> a1 = new Node<>(9);
            a1.next = new Node<>(8);
            Node<Integer> b1 = new Node<>(7);
            b1.next = new Node<>(4);

            var output = AddLists.add2ListsRecursivelySimplified(a1, b1);

            assertEquals(6, output.value);
            assertEquals(3, output.next.value);
            assertEquals(1, output.next.next.value);
            assertNull(output.next.next.next);
        }

        @Test
        void shouldSum2ListsOfUnequalSizeAndNoCarryForward() {
            Node<Integer> a1 = new Node<>(1);
            Node<Integer> a2 = new Node<>(4);
            Node<Integer> a3 = new Node<>(5);
            Node<Integer> a4 = new Node<>(7);
            a1.next = a2;
            a2.next = a3;
            a3.next = a4;
            Node<Integer> b1 = new Node<>(2);
            b1.next = new Node<>(3);

            var output = AddLists.add2ListsRecursivelySimplified(a1, b1);

            assertEquals(3, output.value);
            assertEquals(7, output.next.value);
            assertEquals(5, output.next.next.value);
            assertEquals(7, output.next.next.next.value);
            assertNull(output.next.next.next.next);
        }

        @Test
        void shouldSum2ListsOfUnequalSizesWithCarryForward() {
            Node<Integer> a1 = new Node<>(9);
            Node<Integer> a2 = new Node<>(9);
            Node<Integer> a3 = new Node<>(9);
            a1.next = a2;
            a2.next = a3;
            Node<Integer> b1 = new Node<>(6);

            var output = AddLists.add2ListsRecursivelySimplified(a1, b1);

            assertEquals(5, output.value);
            assertEquals(0, output.next.value);
            assertEquals(0, output.next.next.value);
            assertEquals(1, output.next.next.next.value);
            assertNull(output.next.next.next.next);
        }
    }
}