package dsa.linkedList.traversal;

import dsa.linkedList.Node;

import java.util.List;
import java.util.ArrayList;

public class LinkedListValues {

    /**
     * @Time_complexity O(n): traversing entire list
     * @Space_complexity O(n): size of valuesArray increases as per number of nodes in linked list
     */
    public static <T> List<T> values(Node<T> head) {
        Node<T> current = head;
        List<T> values = new ArrayList<>();
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
    public static <T> List<T> valuesRecursive(Node<T> head) {
        List<T> values = new ArrayList<>();
        return valuesRecursive(head, values);
    }

    /**
     * @Time_complexity O(n): traversing entire list
     * @Space_complexity O(1): constant space of size 1 [i.e.sum], independent of linked list size
     */
    public static Integer sumList(Node<Integer> head) {
        int sum = 0;
        Node<Integer> current = head;
        while (current != null) {
            sum += current.value;
            current = current.next;
        }
        return sum;
    }

    /**
     * @Time_complexity O(n): traversing entire list
     * @Space_complexity O(n): Call trace will contain all function calls till last node is reached & value is returned.
     */
    public static Integer sumListRecursive(Node<Integer> head) {
        if (head == null) return 0;
        return head.value + sumListRecursive(head.next);
    }

    /**
     * @Time_complexity O(n): traversing entire list
     * @Space_complexity O(1): constant space used with increasing list size
     */
    public static <T> boolean linkedListFind(Node<T> head, T target) {
        Node<T> current = head;
        while (current != null) {
            if (target == current.value) return true;
            current = current.next;
        }
        return false;
    }

    /**
     * @Time_complexity O(n)
     * @Space_complexity O(n)
     */
    public static <T> boolean linkedListRecursively(Node<T> head, T target) {
        if (head == null) return false;
        if (head.value == target) return true;
        return linkedListRecursively(head.next, target);
    }

    private static <T> List<T> valuesRecursive(Node<T> current, List<T> values) {
        if (current == null) return values;
        values.add(current.value);
        current = current.next;
        return valuesRecursive(current, values);
    }
}
