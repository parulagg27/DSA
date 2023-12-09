package dsa.linkedList.addLists;

import dsa.linkedList.Node;

public class AddLists {

    /**
     * @Time_complexity O(max( n, m))
     * @Space_complexity O(max( n, m)): new nodes are created.
     * Learnings:
     * 1.Visualisation of OR, AND gate, using it to decide below if condition.
     * 2. Pointer movement to handle unequal sizes
     */
    public static Node<Integer> add2Lists(Node<Integer> head1, Node<Integer> head2) {
        Node<Integer> current1 = head1;
        Node<Integer> current2 = head2;
        Node<Integer> dummyHead = new Node<>(0);
        Node<Integer> current = dummyHead;
        int carry = 0;

        while (current1 != null || current2 != null || carry != 0) {
            int digit1 = getValueIfNonNull(current1);
            int digit2 = getValueIfNonNull(current2);
            int sum = digit1 + digit2 + carry;
            current.next = new Node<>(sum % 10);
            current = current.next;
            carry = sum / 10;

            if (current1 != null) current1 = current1.next;
            if (current2 != null) current2 = current2.next;
        }
        return dummyHead.next;
    }

    /**
     * @Time_complexity O(max(n, m))
     * @Space_complexity O(max(n, m))
     */
    public static Node<Integer> add2ListsRecursively(Node<Integer> head1, Node<Integer> head2) {
        Node<Integer> dummyHead = new Node<>(0);
        return add2ListsRecursively(head1, head2, dummyHead, dummyHead, 0);
    }

    /**
     * @Time_complexity O(max(n, m))
     * @Space_complexity O(max(n, m))
     * Learnings:
     * 1. Hiding current pointer and head details from implementation.
     * 2. Need to have reference of last node and its next value in each recursive call.
     * So sum digit is created traversing forward, but .next value of node is assigned moving down recursively
     */
    public static Node<Integer> add2ListsRecursivelySimplified(Node<Integer> head1, Node<Integer> head2) {
        return add2ListsRecursivelySimplified(head1, head2, 0);
    }

    private static Node<Integer> add2ListsRecursivelySimplified(Node<Integer> current1, Node<Integer> current2, int carry){
        if (current1 ==  null && current2 == null && carry == 0) return null;
        int value1 = getValueIfNonNull(current1);
        int value2 = getValueIfNonNull(current2);
        int sum = value1 + value2 + carry;
        Node<Integer> nextNode = new Node<>(sum % 10);
        if (current1 != null) current1 = current1.next;
        if (current2 != null) current2 = current2.next;
        nextNode.next = add2ListsRecursivelySimplified(current1, current2, sum / 10);
        return nextNode;
    }

    private static Node<Integer> add2ListsRecursively(Node<Integer> current1, Node<Integer> current2, Node<Integer> prev, Node<Integer> head, int carry){
        if (current1 == null && current2 == null && carry == 0) return head.next;
        int value1 = getValueIfNonNull(current1);
        int value2 = getValueIfNonNull(current2);
        int sum = value1 + value2 + carry;
        prev.next = new Node<>(sum % 10);
        if (current1 != null) current1 = current1.next;
        if (current2 != null) current2 = current2.next;
        return add2ListsRecursively(current1, current2, prev.next, head, sum / 10);
    }

    private static int getValueIfNonNull(Node<Integer> current1) {
        return current1 == null ? 0 : current1.value;
    }
}
