package dsa.linkedList.removeNode;

import dsa.linkedList.Node;

public class RemoveNode {

    /**
     * @Time_complexity O(n)
     * @Space_complexity O(1)
     */
    public static <T> Node<T> removeNodeIterative(Node<T> head, T target) {
        if (head.value == target) {
            return head.next;
        }
        Node<T> prev = null;
        Node<T> current = head;
        while (current != null) {
            if (current.value == target) {
                prev.next = current.next;
                break;
            } else {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }

    /**
     * @Time_complexity O(n)
     * @Space_complexity O(n)
     * TODO: Revisit this recursive approach of writing
     */
    public static <T> Node<T> removeNodeRecursiveSimplified(Node<T> head, T target) {
        if (head.value == target) return head.next;
        head.next = removeNodeRecursiveSimplified(head.next, target);
        return head;
    }

    /**
     * @Time_complexity O(n)
     * @Space_complexity O(n)
     */
    public static <T> Node<T> removeNodeRecursively(Node<T> head, T target) {
        if (head.value == target) return head.next;
        return removeNodeRecursively(head, null, head, target);
    }

    private static <T> Node<T> removeNodeRecursively(Node<T> head, Node<T> prev, Node<T> current, T target) {
        if (current == null) return head;
        if (current.value == target) {
            prev.next = current.next;
            return head;
        }
        return removeNodeRecursively(head, current, current.next, target);
    }
}
