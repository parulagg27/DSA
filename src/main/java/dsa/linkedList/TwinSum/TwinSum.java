package dsa.linkedList.TwinSum;

import dsa.linkedList.Node;

/**
 * Problem statement: <a href="https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/">...</a>
 * TODO: Add test cases
 */
public class TwinSum {

    /**
     * @Time_complexity O(n^2) - n/2 [for size] + n^2 for re-movement of 2 pointers
     * @Space_complexity O(1) - constant space used with increasing input size.
     * Time limit exceeded with 39th input on leetcode out of 48 test cases.
     */
    public int pairSum(Node<Integer> head) {
        if (head == null || head.next == null) return 0;
        Node<Integer> fast = new Node<>(0);
        fast.next = head;
        int size = 0;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            size += 2;
        }
        int i = 0, j = 0;
        Node<Integer> twin1 = head;
        Node<Integer> twin2 = head;
        int maxSum = 0;

        while (i <= ((size/2) - 1) && j <= (size - 1 - i)){
            if (j == size - 1 - i){
                int sum = twin1.value + twin2.value;
                if (sum > maxSum) maxSum = sum;
                twin1 = twin1.next;
                i++;
                j = i;
                twin2 = twin1;
            }
            twin2 = twin2.next;
            j++;
        }
        return maxSum;
    }

    /**
     * @Time_complexity O(n) = n/2 [size] + n/2 [half-list reversal] + n/2 [sum of each node on half lists]
     * @Space_complexity O(1) = constant space used with increasing input size
     * Beats 96.05% in runtime, 37.55% users in spacetime.
     */
    public int pairSumOptimised(Node<Integer> head) {
        if (head == null || head.next == null) return 0;

        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node<Integer> prev = null;
        Node<Integer> current = slow;
        while (current != null){
            Node<Integer> temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        int maxSum = 0;
        while (prev != null){
            int sum = prev.value + head.value;
            if (sum > maxSum) maxSum = sum;
            head = head.next;
            prev = prev.next;
        }
        return maxSum;
    }

    //TODO: solve problem statement using stack
}
