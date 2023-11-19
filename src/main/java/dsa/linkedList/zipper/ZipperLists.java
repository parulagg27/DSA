package dsa.linkedList.zipper;

import dsa.linkedList.Node;

public class ZipperLists {

    public static <T> Node<T> zipperLists(Node<T> head1, Node<T> head2){
        Node<T> current1 = head1;
        Node<T> current2 = head2;

        while (current1 != null && current2 != null){
            Node<T> next1;
            Node<T> next2;
            next1 = current1.next;
            next2 = current2.next;
            if (current2 != null) current1.next = current2;
            if (next1 != null) current2.next = next1;
            current1 = next1;
            current2 = next2;
        }
        return current1;
    }

    /**
     * @Time_complexity O(min(n, m)) - n, m: size of list1 & list2 respectively
     * @Space_complexity O(1) - constant space used with increasing list size
     * TODO: revisit approach with visualisation
     */
    public static <T> Node<T> zipperByOddEvenAndCurrentPointer(Node<T> head1, Node<T> head2){
        int i = 0;
        Node<T> current1 = head1;
        Node<T> current2 = head2;
        while( current1 != null && current2 != null){
            Node<T> next;
            if (i % 2 == 0){
                next = current1.next;
                current1.next = current2;
                current1 = next;
            }
            else {
                next = current2.next;
                current2.next = current1;
                current2 = next;
            }
            i++;
        }
        return head1;
    }
}
