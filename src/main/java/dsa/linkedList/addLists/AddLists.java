package dsa.linkedList.addLists;

import dsa.linkedList.Node;

public class AddLists {

    /**
     * @Time_complexity O(max ( n, m))
     * @Space_complexity O(max ( n, m)): new nodes are created.
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
            int digit1 = current1 == null ? 0 : current1.value;
            int digit2 = current2 == null ? 0 : current2.value;
            int sum = digit1 + digit2 + carry;
            current.next = new Node<>(sum % 10);
            current = current.next;
            carry = sum / 10;

            if (current1 != null) current1 = current1.next;
            if (current2 != null) current2 = current2.next;
        }
        return dummyHead.next;
    }
}
