package dsa.linkedList.oddEvenList;

import dsa.linkedList.Node;

/**
 * Problem statement link: <a href="https://leetcode.com/problems/odd-even-linked-list/description/">...</a>
 * Time taken: 1 hour
 */
public class OddEvenList {

    /**
     * @Time_complexity O(n) - Beats 100% of users
     * @Space_complexity O(1) - constant auxiliary space used with increasing input size - beats 94% users
     * @Learnings :
     * 1. to add even nodes group to end of odd list, ensure odd != null]
     * 2. Pointer movement for odd and even in each iteration so reference to nodes are not lost if only odd or only even grouped
     */
    public static Node<Integer> rearrangeOddEven(Node<Integer> head){
        if (head == null) return null;
        Node<Integer> odd = head;
        Node<Integer> even = head.next;
        Node<Integer> evenHead = head.next;
        int i = 1;
        while (even != null) {
            if (i % 2 != 0) {
                odd.next = even.next;
                if (odd.next == null) {
                    break;
                }
                odd = odd.next;
            } else {
                even.next = odd.next;
                even = even.next;
            }
            i++;
        }
        odd.next = evenHead;
        return head;
    }

    /**
     * Solution referenced from solution with most up-votes
     */
    public static Node<Integer> rearrangeOddEvenSimplified(Node<Integer> head){
        if (head == null || head.next == null || head.next.next == null) return head;
        Node<Integer> odd = head;
        Node<Integer> evenHead = head.next;
        Node<Integer> even = evenHead;

        while (even != null && even.next != null) {
            odd.next = even.next;
            even.next = odd.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
