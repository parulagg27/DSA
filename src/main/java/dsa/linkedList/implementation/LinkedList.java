package dsa.linkedList.implementation;

class Node<T> {
    T value;
    Node<T> next;

    Node(T value){
        this.value = value;
        this.next = null;
    }
}
public class LinkedList {

    public static void printList(Node head){
        var current = head;
        while (current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public static void printListRecursively(Node head){
        if (head == null) return;
        System.out.println(head.value);
        printListRecursively(head.next);
    }

    public static void main(String[] args) {
        Node<Integer> a = new Node<>(1);
        Node<Integer> b = new Node<>(5);
        Node<Integer> c = new Node<>(3);
        a.next = b;
        b.next = c;
        printList(a);
        printListRecursively(a);
    }
}
