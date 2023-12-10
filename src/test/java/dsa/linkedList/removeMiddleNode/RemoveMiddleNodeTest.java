package dsa.linkedList.removeMiddleNode;

import dsa.linkedList.Node;
import dsa.linkedList.createList.CreateLinkedList;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RemoveMiddleNodeTest {

    @Nested
    class DeleteMiddle {

        @Test
        void shouldReturnNullIfNoNodesInLinkedList() {
            var output = RemoveMiddleNode.deleteMiddle(null);

            assertNull(output);
        }

        @Test
        void shouldReturnNullIfOnly1NodeInList(){
            var input = new Node<>("a");

            var output = RemoveMiddleNode.deleteMiddle(input);

            assertNull(output);
        }

        @Test
        void shouldRemoveLastNodeIf2NodesInList(){
            var listHead = CreateLinkedList.createList(List.of(1, 3));

            var output = RemoveMiddleNode.deleteMiddle(listHead);

            assert output != null;
            assertEquals(1, output.value);
            assertNull(output.next);
        }

        @Test
        void shouldRemove2ndNodeInAListOf3Nodes(){
            var listHead = CreateLinkedList.createList(List.of(1, 2, 3));

            var output = RemoveMiddleNode.deleteMiddle(listHead);

            assert output != null;
            assertEquals(1, output.value);
            assertEquals(3, output.next.value);
            assertNull( output.next.next);
        }

        @Test
        void shouldRemoveMiddleNodeFromListOf7Nodes(){
            var listHead = CreateLinkedList.createList(List.of(1,3,4,7,1,2,6));

            var output = RemoveMiddleNode.deleteMiddle(listHead);

            assert output != null;
            assertEquals(1, output.value);
            assertEquals(3, output.next.value);
            assertEquals(4, output.next.next.value);
            assertEquals(1, output.next.next.next.value);
            assertEquals(2, output.next.next.next.next.value);
            assertEquals(6, output.next.next.next.next.next.value);
            assertNull(output.next.next.next.next.next.next);
        }
    }
}