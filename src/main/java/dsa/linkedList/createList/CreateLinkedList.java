package dsa.linkedList.createList;

import dsa.linkedList.Node;

import java.util.List;

public class CreateLinkedList {

    /**
     * @Time_complexity O(n)
     * @Space_complexity O(n)
     */
    public static <T> Node<T> createList(List<T> values) {
        if (values.isEmpty()) return null;
        Node<T> head = new Node<>(values.get(0));
        Node<T> prev = head;
        for (int i = 1; i < values.size(); i++){
            Node<T> newNode = new Node<>(values.get(i));
            prev.next = newNode;
            prev = newNode;
        }
        return head;
    }

    /**
     * @Time_complexity O(n)
     * @Space_complexity O(n)
     * TODO: Visualize this approach again
     */
    public static <T> Node<T> createListRecursive(List<T> values) {
        return createListRecursive(values, 0);
    }

    public static <T> Node<T> createListRecursive(List<T> values, int i) {
        if (i == values.size()){
            return null;
        }
        Node<T> newNode = new Node<>(values.get(i));
        newNode.next = createListRecursive(values, i + 1);
        return newNode;
    }
}
