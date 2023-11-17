package dsa.linkedList.traversal;

import dsa.linkedList.Node;

import java.util.List;
import java.util.ArrayList;

public class LinkedListValues {

    /**
     * @Time_complexity O(n): traversing entire list
     * @Space_complexity O(n): size of valuesArray increases as per number of nodes in linked list
     */
    public static List<String> values(Node<String> head) {
        Node<String> current = head;
        List<String> values = new ArrayList<>();
        while (current != null) {
            values.add(current.value);
            current = current.next;
        }
        return values;
    }

    /**
     * @Time_complexity O(n): traversing entire list
     * @Space_complexity O(n): size of valuesArray increases as per number of nodes in linked list
     */
    public static List<String> valuesRecursive(Node<String> head) {
        List<String> values = new ArrayList<>();
        return valuesRecursive(head, values);
    }

    private static List<String> valuesRecursive(Node<String> head, List<String> values){
        if (head == null) return values;
        values.add(head.value);
        head = head.next;
        return valuesRecursive(head, values);
    }
}
