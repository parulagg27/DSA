package dsa.linkedList.createList;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class CreateLinkedListTest {

    @Nested
    class CreateList {

        @Test
        void shouldReturnNullIfEmptyListPassed() {
            var output = CreateLinkedList.createList(List.of());

            assertNull(output);
        }

        @Test
        void shouldCreateLinkedListOfSize1() {
            var output = CreateLinkedList.createList(List.of(1));

            assert output != null;
            assertEquals(1, output.value);
        }

        @Test
        void shouldCreateStringLinkedListOfSize3() {
            var output = CreateLinkedList.createList(List.of("h", "e", "y"));

            assert output != null;
            assertEquals("h", output.value);
            assertEquals("e", output.next.value);
            assertEquals("y", output.next.next.value);
            assertNull(output.next.next.next);
        }

        @Test
        void shouldCreateIntLinkedListOfSize4(){
            var output = CreateLinkedList.createList(List.of(1, 7, 1, 8));

            assert output != null;
            assertEquals(1, output.value);
            assertEquals(7, output.next.value);
            assertEquals(1, output.next.next.value);
            assertEquals(8, output.next.next.next.value);
            assertNull(output.next.next.next.next);
        }
    }

    @Nested
    class CreateListRecursive {

        @Test
        void shouldReturnNullIfEmptyListPassed() {
            var output = CreateLinkedList.createListRecursive(List.of());

            assertNull(output);
        }

        @Test
        void shouldCreateLinkedListOfSize1() {
            var output = CreateLinkedList.createListRecursive(List.of(1));

            assert output != null;
            assertEquals(1, output.value);
        }

        @Test
        void shouldCreateStringLinkedListOfSize3() {
            var output = CreateLinkedList.createListRecursive(List.of("h", "e", "y"));

            assert output != null;
            assertEquals("h", output.value);
            assertEquals("e", output.next.value);
            assertEquals("y", output.next.next.value);
            assertNull(output.next.next.next);
        }

        @Test
        void shouldCreateIntLinkedListOfSize4(){
            var output = CreateLinkedList.createListRecursive(List.of(1, 7, 1, 8));

            assert output != null;
            assertEquals(1, output.value);
            assertEquals(7, output.next.value);
            assertEquals(1, output.next.next.value);
            assertEquals(8, output.next.next.next.value);
            assertNull(output.next.next.next.next);
        }
    }
}