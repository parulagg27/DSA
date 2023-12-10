package dsa.linkedList.removeMiddleNode;

import dsa.linkedList.Node;

/**
 * Problem description: <a href="https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description">...</a>
 */
public class RemoveMiddleNode {

    /**
     * @Time_complexity O(n) = traversing entire list for size + half of list again to remove node (O(n+n/2))
     * @Space_complexity O(1)
     */
    public static <T> Node<T> deleteMiddle(Node<T> head) {
        if (head == null || head.next == null) return null;
        int size = getSizeOfLinkedList(head);
        int index = 0;
        Node<T> prev = new Node<>(null);
        Node<T> current = head;
        while (index < size / 2){
            prev = current;
            current = current.next;
            index++;
        }
        prev.next = current.next;
        return head;
    }

    private static <T> int getSizeOfLinkedList(Node<T> head) {
        int size = 0;
        Node<T> current = head;
        while(current != null){
            current = current.next;
            size++;
        }
        return size;
    }
}
