package dsa.linkedList.merge;

import dsa.linkedList.Node;

/**
 * Problem description: Input: head of two sorted linked lists as arguments.
 * The method should merge the two lists together into single sorted linked list and return its head.
 * Do this in-place, by mutating the original Nodes.
 */
public class MergeLists {

    /**
     * Approach: Move current pointers in each node to next value. If end of 1 list reached, append remaining elements from second list.
     * Learning: Tail points to head currently. So tail.next assigns value to head.next, since reference of head is in tail in beginning.
     * So, no need to assign head value separately outside while loop. Tail pointer & its reference to any node essentially assigns
     * value to that node only.
     * @Time_complexity O(min[m, n]) - smaller list is fully traversed.
     * @Space_complexity O(1) - no new nodes, only constant number of pointers with reference to a node are created with increasing input size.
     */
    public static Node<Integer> mergeLists(Node<Integer> head1, Node<Integer> head2) {
        Node<Integer> current1 = head1;
        Node<Integer> current2 = head2;
        Node<Integer> head = new Node<>(0);
        Node<Integer> tail = head;
        while (current1 != null && current2 != null) {
            if (current1.value < current2.value) {
                tail.next = current1;
                current1 = current1.next;
            } else {
                tail.next = current2;
                current2 = current2.next;
            }
            tail = tail.next;
        }
        if (current1 == null) tail.next = current2;
        if (current2 == null) tail.next = current1;
        return head.next;
    }

    /**
     * @Time_complexity O(min(n, m))
     * @Space_complexity O(n)
     */
    public static Node<Integer> mergeListsRecursively(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        if (head1.value < head2.value){
            head1.next = mergeListsRecursively(head1.next, head2);
            return head1;
        }
        else {
            head2.next = mergeListsRecursively(head1, head2.next);
            return head2;
        }
    }
}
