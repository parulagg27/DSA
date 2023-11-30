package dsa.linkedList.longestStreak;

import dsa.linkedList.Node;

public class LongestStreak {

    /**
     * @Time_complexity O(n)
     * @Space_complexity O(1)
     */
    public static <T> int determineLongestStreak(Node<T> head) {
        Node<T> begin = head;
        Node<T> tail = begin;
        int maxStreak = 0;
        int count = 0;
        while(tail != null){
            if (begin.value == tail.value){
                tail = tail.next;
                count += 1;
            } else {
                begin = tail;
                count = 0;
            }
            if (count > maxStreak) maxStreak = count;
        }
        return maxStreak;
    }

    public static <T> int determineLongestStreakRecursively(Node<T> head) {
        return determineLongestStreakRecursively(head, head, 0, 0);
    }

    /**
     * @Time_complexity O(n)
     * @Space_complexity O(n)
     */
    private static <T> int determineLongestStreakRecursively(Node<T> begin, Node<T> tail, int count, int maxStreak) {
        if (tail == null) return maxStreak;
        if (begin.value == tail.value){
            count += 1;
            if (count > maxStreak) maxStreak = count;
            return determineLongestStreakRecursively(begin, tail.next, count, maxStreak);
        }
        else {
            if (count > maxStreak) maxStreak = count;
            return determineLongestStreakRecursively(tail, tail, 0, maxStreak);
        }
    }
}
