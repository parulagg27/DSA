package dsa.linkedList.univalueList;

import dsa.linkedList.Node;

/**
 * Problem statement:  Indicate whether the linked list contains exactly one unique value.
 */
public class UniValueList {

    /**
     * @Time_complexity O(n)
     * @Space_complexity O(1)
     */
    public static <T> boolean isUniValueList(Node<T> head) {
        Node<T> current = head;
        Node<T> next = head.next;

        while (next != null) {
            if (current.value != next.value) return false;
            current = current.next;
            next = next.next;
        }
        return true;
    }

    /**
     * @Time_complexity O(n)
     * @Space_complexity O(n)
     */
    public static <T> boolean isUniValueListRecursive(Node<T> head) {
        if (head.next == null) return true;
        if (head.value != head.next.value) return false;
        return isUniValueListRecursive(head.next);
    }
}
