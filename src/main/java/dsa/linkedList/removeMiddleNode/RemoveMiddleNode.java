package dsa.linkedList.removeMiddleNode;

import dsa.linkedList.Node;

/**
 * Problem description: <a href="https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description">...</a>
 * Time taken: 20 min
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

    /**
     * @Time_complexity O(n) - actual n/2 - since slow & fast pointer reduce number of nodes traversed to half
     * @Space_complexity O(1)
     * Learnings:
     * 1. How to traverse & find middle of linked list by half traversal using slow & fast pointer
     * 2. Here, slow points to previous node of middle node
     * 3. To properly delete node, not just skip it, set: slow.next.next [i.e. nodes reference] to be null.
     * If this is not done explicitly, GC takes care of it to remove object with no reference.
     */
    public static <T> Node<T> deleteMiddleBySlowFastPointer(Node<T> head) {
        if (head == null || head.next == null) return null;
        Node<T> slow = head;
        Node<T> fast = head.next.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
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
