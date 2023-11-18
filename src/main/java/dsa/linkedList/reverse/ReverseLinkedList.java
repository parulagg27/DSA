package dsa.linkedList.reverse;

import dsa.linkedList.Node;

public class ReverseLinkedList {

    /**
     * @Time_complexity O(n)
     * @Space_complexity O(1) - using constant space with increasing input size
     */
    public static <T> Node<T> reverseList(Node<T> head) {
        Node<T> prev = null;
        Node<T> current = head;
        while (current != null) {
            Node<T> next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    /**
     * @Time_complexity O(n)
     * @Space_complexity O(n)
     */
    public static <T> Node<T> reverseListRecursive(Node<T> head) {
        return reverseListRecursive(null, head);
    }

    private static <T> Node<T> reverseListRecursive(Node<T> prev, Node<T> current){
        if (current == null) return prev;
        Node<T> next = current.next;
        current.next = prev;
        return reverseListRecursive(current, next);
    }
}
