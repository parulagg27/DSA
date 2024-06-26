package dsa.linkedList.insertNode;

import dsa.linkedList.Node;

public class InsertNode {

    /**
     * @Time_complexity O(n)
     * @Space_complexity O(1)
     */
    public static <T> Node<T> insertNodeIterative(Node<T> head, T value, int index) {
        Node<T> nodeToInsert = new Node<>(value);
        if (index == 0) {
            nodeToInsert.next = head;
            return nodeToInsert;
        }
        Node<T> current = head;
        int i = 0;
        while (i < index - 1) {
            current = current.next;
            i++;
        }
        Node<T> valueAfterNewNode = current.next;
        current.next = nodeToInsert;
        nodeToInsert.next = valueAfterNewNode;
        return head;
    }

    /**
     * @Time_complexity O(n)
     * @Space_complexity O(n)
     */
    public static <T> Node<T> insertNodeRecursive(Node<T> head, T value, int index) {
        return insertNodeRecursive(head, head, value, index, 0);
    }

    /**
     * @Time_complexity O(n)
     * @Space_complexity O(n)
     * TODO: Revisit and visualize this approach again
     */
    public static <T> Node<T> insertNodeRecursiveSimplified(Node<T> head, T value, int index) {
        return insertNodeRecursiveSimplified(head, null, value, index);
    }

    private static <T> Node<T> insertNodeRecursive(Node<T> current, Node<T> head, T value, int index, int currentIndex) {
        if (index == 0) {
            Node<T> nodeToInsert = new Node<>(value);
            nodeToInsert.next = head;
            return nodeToInsert;
        }
        if (currentIndex == index - 1) {
            Node<T> nodeToInsert = new Node<>(value);
            Node<T> valueAfterNewNode = current.next;
            current.next = nodeToInsert;
            nodeToInsert.next = valueAfterNewNode;
            return head;
        }
        return insertNodeRecursive(current.next, head, value, index, currentIndex + 1);
    }

    public static <T> Node<T> insertNodeRecursiveSimplified(Node<T> current, Node<T> prev, T value, int index) {
        if (index == 0) {
            Node<T> nodeToInsert = new Node<>(value);
            nodeToInsert.next = current;
            if (prev != null) prev.next = nodeToInsert;
            return nodeToInsert;
        }
        current.next = insertNodeRecursiveSimplified(current.next, current, value, index - 1);
        return current;
    }
}
